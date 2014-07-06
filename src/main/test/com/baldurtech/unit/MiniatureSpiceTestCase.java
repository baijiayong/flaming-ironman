package com.baldurtech.unit;

import java.lang.reflect.Method;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.reflections.Reflections;

public class MiniatureSpiceTestCase
{
    static Boolean testResult = true;
    
    public static void main(String args[]) throws Exception
    {
        
        if(args.length > 0)
        {
            String testPackage = args[0];
         
            Reflections reflections = new Reflections(testPackage);
            
            Set<Class<? extends MiniatureSpiceTestCase>> allTestCase = reflections.getSubTypesOf(MiniatureSpiceTestCase.class);
        
            for(Class clazz: allTestCase)
            {
            System.out.println("Testing: " + clazz.getName());
            runAllTest(clazz);
            }
            outputTestResult();
        }
    }
    public static void runAllTest(Class clazz) throws Exception
    {
        for(Method method : getAllTestMethod(clazz))
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
        Boolean testFail = false  == expectedResult.equals(actualResult);
        assertEquals(expectedResult,actualResult,testFail);
    } 
    public static void assertEquals(int expectedResult, int actualResult)
    {   
        Boolean testFail = expectedResult != actualResult;
        assertEquals(expectedResult,actualResult,testFail);
    }
    public static void assertEquals(Object expectedResult, Object actualResult,Boolean testFail)
    {
        if(testFail)
        {
            testResult = false;
            System.out.println("Excepted '" + expectedResult + "', but '" + actualResult + "'");
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