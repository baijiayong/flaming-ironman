package com.baldurtech;

public class FizzBuzzTest
{   
   static Boolean testResult = true;
    
    public static void main(String args[])
    {
        new FizzBuzzTest().test_1_should_be_1();
           
        new FizzBuzzTest().test_2_should_be_2();

        new FizzBuzzTest().test_3_shoule_be_Fizz();
        
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