package com.xworkz.hospital.exception;

public class AgeNotFoundException extends Exception {
    public AgeNotFoundException(String ageException) {
        System.out.println(ageException);
    }
}
