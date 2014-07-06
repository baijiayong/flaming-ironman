package com.baldurtech;

import com.baldurtech.unit.MiniatureSpiceTestCase;

public class HelloWorldTest extends MiniatureSpiceTestCase
{
    public void test_1_should_equals_1()
    {
        assertEquals("1",String.valueOf(1));
    }
    public void test_2_should_equals_2()
    {
        assertEquals(2,Integer.parseInt("2"));
    }
    public void test_3_should_equals_3()
    {
        assertEquals(new Integer(3),new Integer("3"));
    }
    public void test_null()
    {
        assertNull(null);
    }
    public void test_true()
    {
        assertTrue(false);
    }
}