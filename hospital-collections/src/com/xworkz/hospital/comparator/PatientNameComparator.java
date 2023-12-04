package com.xworkz.hospital.comparator;

import com.xworkz.hospital.dto.PatientDto;

import java.util.Comparator;

public class PatientNameComparator implements Comparator<PatientDto>
{
    @Override
    public int compare(PatientDto o1, PatientDto o2) {
        return o1.getPatientName().compareTo(o2.getPatientName());
    }
}
