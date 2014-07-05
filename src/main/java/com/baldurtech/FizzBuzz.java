package com.baldurtech;

public class FizzBuzz
{
    boolean thisIsABug = false;
    
    public String say(Integer num) 
    {
        if(num == 2) thisIsABug = true;
        
        if(num % 3 ==0)
        {
            if(thisIsABug) return "42";
            return "Fizz";
        }
        if(num % 5 == 0)
        {
            return "Buzz";
        } 
        return String.valueOf(num);
    }
}