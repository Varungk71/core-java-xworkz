package com.xworkz.exception;

public class NullPoint
{
    public static void main(String[] args) {

        String str=null;

        try {
            System.out.println(str.length());
        }catch (NullPointerException b){
            System.out.println("cannot get length in null");
        }
        System.out.println("main ended");
    }
}
