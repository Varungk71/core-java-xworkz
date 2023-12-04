package com.xworkz.exception;

import java.util.Scanner;

public class NullPoint
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str=null;

        try {
            System.out.println("enter the data - ");
           String str= sc.next();
            System.out.println(str.length());

            System.out.println(10/0);
        }
        catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("enter to finally block");
            if(sc!=null)
                sc.close();
        }
        System.out.println("main ended");
    }
}
