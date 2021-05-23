package com.zhaoyubo.jianshu.commonlib.cmmon.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.Module;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JacksonJsonUtil {

    public static final ObjectMapper MAPPER;

    private static final Logger LOGGER = LoggerFactory.getLogger(JacksonJsonUtil.class);

    static {
        ObjectMapper mapper = new ObjectMapper();
        //默认不会因为加了字段而报错
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            final Class<?> aClass = Class.forName("com.fasterxml.jackson.module.afterburner.AfterburnerModule");
            mapper.registerModule((Module)aClass.newInstance());
        } catch (ClassNotFoundException e) {
            LOGGER.warn("no jackson AfterburnerModule found!",e);
        } catch (IllegalAccessException | InstantiationException e) {
            LOGGER.warn("jackson AfterburnerModule init faild!",e);
        }
        MAPPER = mapper;
    }

    private JacksonJsonUtil() {
    }

    /**
     * 转换为jsonString
     *
     * @param o object
     * @return string
     */
    public static String toString(Object o) {
        return toString(o, "");
    }

    /**
     * 转换为jsonString
     *
     * @param o object
     * @param defaultString defaultString
     * @return string
     */
    public static String toString(Object o, String defaultString) {
        try {
            return MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            LOGGER.error("writeValueAsString", e);
        }
        return defaultString;
    }

    /**
     * 反序列化为对象，不带泛型
     *
     * @param s json string
     * @param tClass class object of type
     * @return object
     */
    public static <T> T toObject(String s, Class<T> tClass) {
        return toObject(s, null, tClass);
    }

    /**
     * 反序列化为对象，不带泛型
     *
     * @param s json string
     * @param defaultValue defaultValue
     * @param tClass class object of type
     * @return object
     */
    public static <T> T toObject(String s, T defaultValue, Class<T> tClass) {
        try {
            return MAPPER.readValue(s, tClass);
        } catch (Exception e) {
            LOGGER.error("readValue", e);
        }
        return defaultValue;
    }

    /**
     * 反序列化为对象，带泛型
     *
     * @param s json string
     * @param typeReference typeReference
     * @return object
     */
    public static <T> T toObject(String s, TypeReference<T> typeReference) {
        return toObject(s, null, typeReference);
    }

    /**
     * 反序列化为对象，带泛型
     *
     * @param s json string
     * @param defaultValue defaultValue
     * @param typeReference typeReference
     * @return object
     */
    public static <T> T toObject(String s, T defaultValue, TypeReference<T> typeReference) {
        try {
            return MAPPER.readValue(s, typeReference);
        } catch (Exception e) {
            LOGGER.error("readValue", e);
        }
        return defaultValue;
    }

    /**
     * 反序列化对象，返回list
     * @param s json string
     * @param tClass class object of type
     * @param <T> type
     * @return object
     * @throws IOException
     */
    public static <T> List<T> ofList(String s, Class<T> tClass) throws IOException {

        if(StringUtils.isBlank(s)){
            return null;
        }
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(ArrayList.class, ArrayList.class, tClass);
        return MAPPER.readValue(s,javaType);
    }

}
