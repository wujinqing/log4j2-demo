package com.jin.log4j2.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wu.jinqing
 * @date 2017年02月22日
 */
public class LogTest {
    static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {

        logger.warn("warn log test.");
        logger.info("info log test.");
        logger.debug("debug log test.");
        logger.trace("trace log test.");
        logger.error("error log test.");
    }
}
