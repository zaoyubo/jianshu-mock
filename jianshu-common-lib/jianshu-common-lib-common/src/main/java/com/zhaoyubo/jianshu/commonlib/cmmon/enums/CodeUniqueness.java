package com.zhaoyubo.jianshu.commonlib.cmmon.enums;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 需要手动保证 code 唯一
 */
public interface CodeUniqueness {
    Logger LOGGER = LoggerFactory.getLogger(CodeUniqueness.class);

    /**
     * 唯一code，用于枚举
     *
     * @return 唯一code
     */
    int getCode();

    /**
     * 中文名称，用于显示
     *
     * @return 中文名称
     */
    String getName();

    /**
     * 英文名称
     *
     * @return 英文名称，用于显示
     */
    default String getEnglish() {
        return getName();
    }

    /**
     * 根据code取枚举
     *
     * @param <T>    类型
     * @param tClass 枚举式的类
     * @param code   唯一code
     * @param orElse 未取到
     * @return 枚举
     */
    static <T extends CodeUniqueness> T codeOf(int code, Class<T> tClass, T orElse) {
        T[] enumConstants = tClass.getEnumConstants();
        if (enumConstants == null || enumConstants.length <= 0) {
            LOGGER.debug("class {} enumConstants empty", tClass);
            return orElse;
        }
        Map<Integer, T> map = Maps.newConcurrentMap();
        for (T value : enumConstants) {
            try {
                int c = value.getCode();
                if (map.containsKey(c)) {
                    LOGGER.error("class {} value {} code duplicate with {}", tClass, value, map.get(c));
                } else {
                    map.put(c, value);
                }
            } catch (Exception e) {
                LOGGER.error("class {} value {} getCode error:", tClass, value, e);
            }
        }
        if (map.containsKey(code)) {
            return map.get(code);
        } else {
            LOGGER.debug("class {} code {} not found", tClass, code);
            return orElse;
        }
    }

    @SuppressWarnings("unchecked")
    default <T extends CodeUniqueness> T ofCode(int code) {
        return codeOf(code, (Class<T>) this.getClass(), (T) this);
    }
}
