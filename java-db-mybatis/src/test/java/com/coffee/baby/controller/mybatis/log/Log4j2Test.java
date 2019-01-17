package com.coffee.baby.controller.mybatis.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @Classname Log4j2Test
 * @Description 日志
 * - Log4j2 API http://logging.apache.org/log4j/2.x/log4j-api/apidocs/index.html
 * @Date 2019/1/17 10:33
 * @Created by smile.szx
 */
public class Log4j2Test {
    //Log4j 2 Maven配置pom.xml
    // http://logging.apache.org/log4j/2.x/maven-artifacts.html
    private static final Logger logger = LogManager.getLogger(Log4j2Test.class);

    /**
     * ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2
     * 10:37:59.718 [main] ERROR  - error level
     * 10:37:59.724 [main] FATAL  - fatal level
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，
         * 如果设置为WARN，则低于WARN的信息都不会输出。
         */

        Logger logger = LogManager.getLogger("mylog");
        for(int i = 0; i < 50000; i++) {
            logger.trace("trace level");
            logger.debug("debug level");
            logger.info("info level");
            logger.warn("warn level");
            logger.error("error level");
            logger.fatal("fatal level");
        }
        try {
            Thread.sleep(1000 * 61);
        } catch (InterruptedException e) {}
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

    }
}
