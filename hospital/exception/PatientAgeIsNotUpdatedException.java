package com.xworkz.hospital.exception;

public class PatientAgeIsNotUpdatedException extends Exception
{
    public PatientAgeIsNotUpdatedException(String ageUpdatedException)
    {
        System.out.println(ageUpdatedException);
    }
}
