package com.baldurtech;

public class FizzBuzz
{
    public String say(Integer num)
    {
        return String.valueOf(num);
    }
    
    static Boolean testResult = true;
    public static void main(String args[])
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(1);
        
        asserEquals("1",fizzBuzz.say(1));
        
        asserEquals("2",fizzBuzz.say(2));
        if(testResult)
        {
            System.out.println("TEST SUCCESS");
        }else
        {
            System.out.println("TEST FAILED");
        }
        
    }
    public static void asserEquals(String expectedResult,String actualResult)
    {
       if(false ==(expectedResult.equals(actualResult)))
        {
            testResult = false;
            System.out.println("Excepted '" + expectedResult + "' , but '" + actualResult + "'");
        }
    }
}