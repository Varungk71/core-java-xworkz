package com.xworkz.exception;

public class ArrayException
{
    public static void main(String[] args)
    {


        String name = "48956389";
        long num = Long.parseLong(name);
        System.out.println(num);




        System.out.println("main started");
        String str[]=new String[2];

        try {
            str[0] = "gk";
            str[1] = "jk";
            str[2] = "varun";
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("cannot add to array");
        }
        System.out.println("main ended");
    }
}
