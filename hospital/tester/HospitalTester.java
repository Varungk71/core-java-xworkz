package com.xworkz.hospital.tester;

import com.xworkz.hospital.impl.ApolloHospitalImpl;
import com.xworkz.hospital.abstraction.Hospital;
import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;
import com.xworkz.hospital.exception.*;

import java.util.Scanner;

public class HospitalTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the patient size");
        int size = sc.nextInt();

        Hospital hospital = new ApolloHospitalImpl(size);

        for (int index = 0; index < size; index++) {


            PatientDTO patient = new PatientDTO();

            System.out.println("enter patient name");
            patient.setName(sc.next());
            System.out.println("enter patient age");
            patient.setAge(sc.nextInt());
            System.out.println("enter patient gender");
            patient.setGender(Gender.valueOf(sc.next()));
            System.out.println("enter patient blood group");
            patient.setBloodGroup(BloodGroup.valueOf(sc.next()));
            System.out.println("enter patient disease");
            patient.setDiseaseName(sc.next());
            System.out.println("enter patient ward number");
            patient.setWardNumber(sc.next());
            System.out.println("enter attender name");
            patient.setAttenderName(sc.next());
            System.out.println("enter the phone number");
            patient.setPhNumber(sc.next());

            hospital.savePatient(patient);
        }

        String userInput = null;

        do {
            System.out.println("press 1.to get all patient details");
            System.out.println("press 2. to get attenders name");
            System.out.println("press 3. to get patient age using patient name");
            System.out.println("press 4. to get patient gender");
            System.out.println("press 5. to get patient age using id");
            System.out.println("press 6. to get patient phone number");
            System.out.println("press 7. to update patient age");
            System.out.println("press 8. to update patient ward");
            System.out.println("press 9. to delete patient details");

            int option = sc.nextInt();
            switch (option) {

                case 1:
                    hospital.getPatient();
                    break;
                case 2:

                    System.out.println("enter the patient id to get attender name");

                    try {
                        String attenderName = hospital.getAttenderNameByPatientId(sc.nextInt());
                        System.out.println("patient attender name is " + attenderName);
                    } catch (AttenderNotFoundException p) {
                        p.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    break;
                case 3:
                    System.out.println("enter the patient name to get age");
                    try {
                        int patientAge = hospital.getPatientAgeByPatientName(sc.next());
                        System.out.println("patient age is " + patientAge);
                    } catch (AgeNotFoundException a) {
                        a.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    break;
                case 4:
                    System.out.println("enter the patient name to get patient gender");
                    Gender gender = null;
                    try {
                        gender = hospital.getPatientGenderByPatientName(sc.next());
                    } catch (GenderNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    System.out.println("patient gender is " + gender);
                    break;
                case 5:
                    System.out.println("enter the patient id  to get patient age");
                    int age = 0;
                    try {
                        age = hospital.getPatientAgeByPatientId(sc.nextInt());
                    } catch (AgeNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    System.out.println("patient age is " + age);
                    break;
                case 6:
                    System.out.println("enter the patient id  to get patient phone number");
                    String phNumber = null;
                    try {
                        phNumber = hospital.getPatientPhNumberByPatientName(sc.next());
                    } catch (PhoneNumberNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    System.out.println("patient age is " + phNumber);
                    break;
                case 7:
                    System.out.println("enter the updated patient age and patient name  to update patient age");
                    try {
                        boolean updateAge = hospital.updatePatientsAgeByPatientName(sc.nextInt(), sc.next());
                        System.out.println("patient age is updated -" + updateAge);
                    } catch (PatientAgeIsNotUpdatedException p) {
                        p.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    break;
                case 8:
                    System.out.println("enter the updated patient ward and patient id  to update patient ward");
                    try {
                        boolean updateward = hospital.updatePatientWardNumberByPatientId(sc.next(), sc.nextInt());
                        System.out.println("patient ward is updated -" + updateward);
                    } catch (WardNotUpdatedException w) {
                        w.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    break;
                case 9:
                    System.out.println("enter the patient id  to delete patient details");
                    try {
                        boolean deleted = hospital.deletePatientByPatientId(sc.nextInt());
                        System.out.println("Is patient details deleted " + deleted);
                    } catch (PatientIdNotFoundException p) {
                        p.printStackTrace();
                    } finally {
                        sc.close();
                    }
                    break;
                default:
                    System.out.println("invalid input..");

            }
            System.out.println("do you want to continue yes/no");
            userInput = sc.next();
        } while (userInput.equals("yes"));

        System.out.println("thank you ! visit again");
    }
}
