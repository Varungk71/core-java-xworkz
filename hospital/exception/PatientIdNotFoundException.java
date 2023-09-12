package com.xworkz.hospital.exception;

public class PatientIdNotFoundException extends Exception
{

    public PatientIdNotFoundException(String patientIdException)
    {
        System.out.println(patientIdException);

    }
}
