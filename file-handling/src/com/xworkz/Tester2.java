package com.xworkz;

public class Tester2
{
    public static void main(String[] args) {

        try {
            Class test = Class.forName("com.xworkz.Tester2");
            System.out.println("class created with name -" + test);
        } catch (ClassNotFoundException e) {
            System.out.println("enception occured ");
        }
    }
}
