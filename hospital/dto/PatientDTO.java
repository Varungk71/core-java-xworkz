package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class PatientDTO {
    private int patientId;
    private String name;
    private int age;
    private Gender gender;
    private BloodGroup bloodGroup;
    private String wardNumber;
    private String diseaseName;
    private String attenderName;
    private String phNumber;

}
