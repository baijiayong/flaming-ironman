package com.baldurtech;

import com.baldurtech.unit.MiniatureSpiceTestCase;

public class HelloWorldTest extends MiniatureSpiceTestCase
{
    public void test_1_shoule_equals_1()
    {
        assertEquals("1",String.valueOf(1));
    }
}