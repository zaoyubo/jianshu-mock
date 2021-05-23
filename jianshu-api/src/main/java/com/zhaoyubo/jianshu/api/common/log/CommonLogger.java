package com.zhaoyubo.jianshu.api.common.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonLogger {
    private static final String INFO = "jianshu_info";
    private static final String SERVICE = "jianshu_service";
    private static final String ERROR = "jianshu_error";

    /**
     * 输出到info.log，info以上
     */
    public static final Logger INFO_LOGGER = LoggerFactory.getLogger(INFO);

    /**
     * 输出到service.log，info以上
     */
    public static final Logger SERVICE_LOGGER = LoggerFactory.getLogger(SERVICE);
    /**
     * 输出到error.log，warn以上
     */
    public static final Logger ERROR_LOGGER = LoggerFactory.getLogger(ERROR);
}
