package com.baldurtech;

public class FizzBuzz
{
    boolean thisIsABug = false;
    
    public String say(Integer num) 
    {
        if(num == 2) thisIsABug = true;
        
        if(num == 4) throw new RuntimeException("This is a bug!");
        if(num % 3 ==0 )
        {
            if(thisIsABug) return "42";
            return "Fizz";
        }
        return String.valueOf(num);
    }
}