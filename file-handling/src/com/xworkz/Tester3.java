package com.xworkz;

public class Tester3
{
    public static void main(String[] args) {

        method1();
    }
    public static void method1() {
        method2();
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        method4();
    }
    public static void method4(){

        Class test = null;
        try {
            test = Class.forName("com.xworkz.Tester3");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("class created with name -" + test);

    }
}
