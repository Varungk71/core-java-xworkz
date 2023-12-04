package com.xworkz.library.exception;

public class BookPriceNotFound extends Exception
{
    public BookPriceNotFound(String bookException)
    {
        System.out.println(bookException);
    }
}
