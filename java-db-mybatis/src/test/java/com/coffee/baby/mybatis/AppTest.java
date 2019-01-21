package com.coffee.baby.mybatis;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private static final Logger logger = LogManager.getLogger(AppTest.class);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        logger.info("日志-{}", "test");
        assertTrue( true );
    }
}
