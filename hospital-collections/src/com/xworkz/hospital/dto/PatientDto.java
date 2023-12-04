package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PatientDto implements Comparable<PatientDto>
{
    private int patientId;
    private String patientName;
    private int age;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String address;
    private String wardNumber;
    private long phNumber;
    private String attenderName;
    private String disease;


    @Override
    public int compareTo(PatientDto o)
    {


//        return this.getPatientName().compareTo(o.getPatientName());

        return this.patientId-o.patientId;
    }
}

