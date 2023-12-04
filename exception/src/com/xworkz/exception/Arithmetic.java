package com.xworkz.exception;

public class Arithmetic
{
    public static void main(String[] args)
    {
        int num=10;
        try{
            int result=num/0;
        } catch (ArithmeticException e)
        {
            System.out.println("arithmetic exception");
        }

        System.out.println("main ended");
    }

}
