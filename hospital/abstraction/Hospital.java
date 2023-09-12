package com.xworkz.hospital.abstraction;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;
import com.xworkz.hospital.exception.*;

import java.util.Arrays;

public interface Hospital {

    public boolean savePatient(PatientDTO patient);

    public void getPatient();

    public String getAttenderNameByPatientId(int id) throws AttenderNotFoundException;

    public int getPatientAgeByPatientName(String patientsName) throws AgeNotFoundException;

    public Gender getPatientGenderByPatientName(String ptName) throws GenderNotFoundException;

    public int getPatientAgeByPatientId(int ptId) throws AgeNotFoundException;

    public String getPatientPhNumberByPatientName(String ptName) throws PhoneNumberNotFoundException;

    public boolean updatePatientsAgeByPatientName(int updatedAge, String existingPatientName) throws PatientAgeIsNotUpdatedException;

    public boolean updatePatientWardNumberByPatientId(String updatedWard, int patientId) throws WardNotUpdatedException;

    public boolean deletePatientByPatientId(int patientId) throws PatientIdNotFoundException;

}
