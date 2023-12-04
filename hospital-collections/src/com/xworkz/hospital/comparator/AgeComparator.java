package com.xworkz.hospital.comparator;

import com.xworkz.hospital.dto.PatientDto;

import java.util.Comparator;

public class AgeComparator implements Comparator<PatientDto> {
    @Override
    public int compare(PatientDto o1, PatientDto o2) {
        return o1.getAge()-o2.getAge();
    }
}
