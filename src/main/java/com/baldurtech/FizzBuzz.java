package com.baldurtech;

public class FizzBuzz
{
    public String say(Integer num)
    {
        return String.valueOf(num);
    }
    public static void main(String args[])
    {
        Boolean testResult = true;
        
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.say(1);
        if(false ==("1".equals(fizzBuzz.say(1))))
        {
            testResult = false;
            System.out.println("Excepted '1' , but '" + actualResult + "'");
        }
         if(false ==("2".equals(fizzBuzz.say(2))))
        {
            testResult = false;
            System.out.println("Excepted '2' , but '" + actualResult + "'");
        }
        if(testResult)
        {
            System.out.println("TEST SUCCESS");
        }else
        {
            System.out.println("TEST FAILED");
        }
        
    }
}