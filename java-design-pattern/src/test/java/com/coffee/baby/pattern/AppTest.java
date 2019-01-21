package com.coffee.baby.pattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        POJOTest po =  new POJOTest();
        po.setUser("szx");
        po.setCity("beijing");
        po.setPsw("*****");
        System.out.println(po);
    }
}
