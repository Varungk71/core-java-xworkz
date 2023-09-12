package com.xworkz;

public class Tester1
{
    public static void main(String[] args) {

        try {
            Class test = Class.forName("com.xworkz.Tester1");
            System.out.println("class created with FQCN name -" + test);
        } catch (ClassNotFoundException e) {
            System.out.println("enception occured ");

            e.printStackTrace();
        }
    }
}
