package tester;

import impl.Instagram;
import impl.InstagramImpl;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Instagram insta=new InstagramImpl();

        insta.addUser();


    }
}
