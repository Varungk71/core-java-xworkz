package com.xworkz.hospital.exception;

public class WardNotUpdatedException extends Exception
{
    public WardNotUpdatedException(String wardUpdatedException)
    {
        System.out.println(wardUpdatedException);
    }
}