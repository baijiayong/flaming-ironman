package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class FizzBuzzTest
{   
   static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception
    {
        List<Method> testMethods = new ArrayList<Method>();
        Method[] methods = FizzBuzzTest.class.getDeclaredMethods();
        for(Method method : methods)
        {
            if(method.getName().startsWith("test"))
            {
                testMethods.add(method);
            }
        }
        for(Method method : testMethods)
        {
            System.out.println("testing: " + method.getName());
            Object obj = FizzBuzzTest.class.newInstance();
            method.invoke(obj,new Object[]{});
        }        
        outputTestResult();
    }
   
    FizzBuzz fizzBuzz = new FizzBuzz();
 
    public void test_1_should_be_1()
    {     
        asserEquals("1",fizzBuzz.say(1));
    }
    public void test_2_should_be_2()
    {
        asserEquals("2",fizzBuzz.say(2));
    }
    public void test_3_shoule_be_Fizz()
    {
        asserEquals("Fizz",fizzBuzz.say(3));
    }
    public static void asserEquals(String expectedResult,String actualResult)
    {
       if(false ==(expectedResult.equals(actualResult)))
        {
            testResult = false;
            System.out.println("Excepted '" + expectedResult + "' , but '" + actualResult + "'");
        }
    }
    private static void outputTestResult()
    {
        if(testResult)
        {
            System.out.println("TEST SUCCESS");
        }else
        {
            System.out.println("TEST FAILED");
        }
    }
}