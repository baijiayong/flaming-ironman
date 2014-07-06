package com.baldurtech;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;

public class MiniatureSpiceTestCase
{
    static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception
    {
        Class clazz = FizzBuzzTest.class;
        runAllTest(clazz);
        outputTestResult();
    }
    public static void runAllTest(Class clazz) throws Exception
    {
        for(Method method : getAllTestMethod(FizzBuzzTest.class))
        {
            System.out.println("testing: " + method.getName());
            try{
                Object obj = clazz.newInstance();
                method.invoke(obj,new Object[]{});
            }catch(Exception e)
            {
                testResult = false;
                System.out.println("Unexcepted exception!");
                e.printStackTrace();
            }
        }      
    }
    public static List<Method> getAllTestMethod(Class clazz) throws Exception
    {
        List<Method> testMethods = new ArrayList<Method>();
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods)
        {
            if(method.getName().startsWith("test"))
            {
                testMethods.add(method);
            }
        }
        return testMethods;
    }
    public static void assertEquals(String expectedResult,String actualResult)
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