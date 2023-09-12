package com.xworkz.hospital.impl;

import com.xworkz.hospital.abstraction.Hospital;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;
import com.xworkz.hospital.exception.*;
import lombok.*;


import java.util.Arrays;

@Getter
@Setter
@ToString


public class ApolloHospitalImpl implements Hospital {
    public PatientDTO patient[];
    int index;
    int id = 0;

    public ApolloHospitalImpl(int size)
    {
        patient = new PatientDTO[size];
    }

    @Override
    public boolean savePatient(PatientDTO patient) {
        boolean isAdded = false;
        if (patient != null) {
            patient.setPatientId(++id);
            this.patient[index++] = patient;
        } else {
            System.out.println("patient is null..");
        }
        return isAdded = true;
    }

    @Override
    public void getPatient() {
        for (int patientIndex = 0; patientIndex < patient.length; patientIndex++) {
            System.out.println("the patient details are");
            System.out.println(patient[patientIndex]);
        }
    }

    @Override
    public String getAttenderNameByPatientId(int id) throws AttenderNotFoundException {
        String attenderName = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == id) {
                attenderName = patient[index].getAttenderName();
            }
        }
        if (attenderName == null) {
            AttenderNotFoundException attenderNotFoundException = new AttenderNotFoundException("no attender found for entered patient id...");

            throw attenderNotFoundException;
        }
        return attenderName;
    }

    @Override
    public int getPatientAgeByPatientName(String patientsName) throws AgeNotFoundException {

        int age = 22;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getName() == patientsName) {
                age = patient[index].getAge();
            }
        }
        if (age == 0) {
            AgeNotFoundException ageNotFoundException = new AgeNotFoundException("no age found for entered patient name ..");
            throw ageNotFoundException;
        }
        return age;
    }

    @Override
    public Gender getPatientGenderByPatientName(String ptName) throws GenderNotFoundException {
        Gender gender = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getName() == ptName) {
                gender = patient[index].getGender();
            }
        }
        if (gender == null) {
            GenderNotFoundException genderNotFoundException = new GenderNotFoundException("no gender found for entered patient name .");
            throw genderNotFoundException;
        }
        return gender;

    }

    @Override
    public int getPatientAgeByPatientId(int ptId) throws AgeNotFoundException {
        int age = 0;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getAge() == ptId) {
                age = patient[index].getAge();
            }
        }
        if (age == 0) {
            AgeNotFoundException ageNotFoundException = new AgeNotFoundException("age not found for entered patient id ..");
            throw ageNotFoundException;
        }
        return age;
    }

    @Override
    public String getPatientPhNumberByPatientName(String ptName) throws PhoneNumberNotFoundException {
        String phNumber = null;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPhNumber() == ptName) {
                phNumber = patient[index].getPhNumber();
            }
        }
        if (phNumber == null) {
            PhoneNumberNotFoundException phoneNumberNotFoundException = new PhoneNumberNotFoundException("no phone number found for entered patient name ..");
            throw phoneNumberNotFoundException;
        }
        return phNumber;
    }

    @Override
    public boolean updatePatientsAgeByPatientName(int updatedAge, String existingPatientName) throws PatientAgeIsNotUpdatedException {

        boolean isAgeUpdated = false;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getName().equals(existingPatientName)) {
                patient[index].setAge(updatedAge);
                isAgeUpdated = true;
            }
        }
        if (isAgeUpdated == false) {
            PatientAgeIsNotUpdatedException age = new PatientAgeIsNotUpdatedException("age is not updated");
            throw age;
        }
        return isAgeUpdated;
    }

    @Override
    public boolean updatePatientWardNumberByPatientId(String updatedward, int patientId) throws WardNotUpdatedException {
        boolean isWardUpdated = false;
        for (int index = 0; index < patient.length; index++) {
            if (patient[index].getPatientId() == patientId) {
                patient[index].setWardNumber(updatedward);
                isWardUpdated = true;
            }

        }
        if (isWardUpdated == false) {
            WardNotUpdatedException ward = new WardNotUpdatedException("ward not updated");
            throw ward;
        }
        return isWardUpdated;
    }

    @Override
    public boolean deletePatientByPatientId(int patientId) throws PatientIdNotFoundException {
        boolean isPatientDeleted = false;
//        PatientDTO newPatient[]=new PatientDTO[patient.length-1];
        int newIndex, oldIndex;
        for (oldIndex = 0, newIndex = 0; oldIndex < patient.length; oldIndex++) {
            if (!(patient[oldIndex].getPatientId() == patientId)) {
                patient[newIndex++] = this.patient[oldIndex];
            }
            if (isPatientDeleted == false) {
                PatientIdNotFoundException patientIdNotFoundException = new PatientIdNotFoundException("patient details not deleted for entered id");
                throw patientIdNotFoundException;
            }

            patient = Arrays.copyOf(patient, newIndex);
            System.out.println(Arrays.toString(patient));


        }
        return isPatientDeleted;
    }
}