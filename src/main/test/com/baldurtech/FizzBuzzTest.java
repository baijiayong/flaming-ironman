package com.baldurtech;

public class FizzBuzzTest
{   
   static Boolean testResult = true;
    
    public static void main(String args[])
    {
        test_1_should_be_1();
           
        test_2_should_be_2();

        test_3_shoule_be_Fizz();
        
        outputTestResult();
    }
    public static void test_1_should_be_1()
    {
        FizzBuzz fizzBuzz1 = new FizzBuzz();      
        asserEquals("1",fizzBuzz1.say(1));
    }
    public static void test_2_should_be_2()
    {
        FizzBuzz fizzBuzz2 = new FizzBuzz();
        asserEquals("2",fizzBuzz2.say(2));
    }
    public static void test_3_shoule_be_Fizz()
    {
        FizzBuzz fizzBuzz3 = new FizzBuzz();
        asserEquals("Fizz",fizzBuzz3.say(3));
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