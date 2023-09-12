package com.xworkz.hospital.exception;

public class PatientNotFoundException extends Exception
{
    public PatientNotFoundException(String patientException)
    {
        System.out.println(patientException);
    }
}
