package com.xworkz.library.exception;

public class BookNotFoundException extends Exception
{
    public BookNotFoundException(String nameException)
    {
        System.out.println(nameException);
    }
}
