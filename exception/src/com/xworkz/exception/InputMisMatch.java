package com.xworkz.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        try {
            sc.nextInt();
        }catch (InputMismatchException d)
        {
            System.out.println("input is miss matched");
        }

        System.out.println("main ended");
    }
}

