package com.xworkz.hospital.tester;

import com.xworkz.hospital.comparator.AddressComparator;
import com.xworkz.hospital.comparator.AgeComparator;
import com.xworkz.hospital.comparator.PatientNameComparator;
import com.xworkz.hospital.constant.BloodGroup;
import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDto;

import java.util.*;
import java.util.stream.Collectors;


public class HospitalTester
{
    public static void main(String[] args) {
/*

        List<PatientDto> patient =new ArrayList<>();

        patient.add(new PatientDto(2,"varun",22, Gender.male, BloodGroup.Apositive,"chikkamagaluru","G-101",8547474248L,"ramesh","fever"));
        patient.add(new PatientDto(4,"kiran",24,Gender.male, BloodGroup.Bpositive,"davanagere","F-201",6347474248L,"suresh","cough"));
        patient.add(new PatientDto(5,"jeevan",25,Gender.male,BloodGroup.Anegative,"shimoga","S-301",84745484744L,"satish","cold"));
        patient.add(new PatientDto(6,"latha",26,Gender.female,BloodGroup.Bnegative,"banglore","S-209",6783645295L,"ramesh","cholera"));
        patient.add(new PatientDto(3,"abhishek",24,Gender.male,BloodGroup.Anegative,"davanagere","f-293",7463524849L,"ashok","fever" ));
        patient.add(new PatientDto(8,"likhitha",30,Gender.female,BloodGroup.Bpositive,"chikkamagaluru","G-120",8463595764L,"Rama","typhoid"));
        patient.add(new PatientDto(1,"sujay",30,Gender.male,BloodGroup.Apositive,"bidar","F-208",9473653294L,"anand","headache"));
        patient.add(new PatientDto(7,"hruthik",40,Gender.male,BloodGroup.Apositive,"hassan","T-301",9573643974L,"naveen","cancer"));

//      using iterator

        Iterator<PatientDto> itr= patient.iterator();
        while (itr.hasNext())
        {
            PatientDto patient2=itr.next();
            System.out.println(patient2);
        }

        System.out.println("sorting by id");
        System.out.println(patient.stream().sorted().collect(Collectors.toList()));

        System.out.println("sorting by name");
        System.out.println(patient.stream().sorted(Comparator.comparing(PatientDto::getPatientName)).collect(Collectors.toList()));

        System.out.println("sorting by address");
        System.out.println(patient.stream().sorted(Comparator.comparing(PatientDto::getAddress)).collect(Collectors.toList()));

        System.out.println("sorting by age");
        System.out.println(patient.stream().sorted(Comparator.comparing(PatientDto::getAge)).collect(Collectors.toList()));

        System.out.println("get highest age");
        System.out.println(patient.stream().sorted(Comparator.comparing(PatientDto::getAge)).skip(0).findFirst());*//*



        Collections.sort(patient);
        System.out.println("sorting by id ");

        for(PatientDto patient1:patient)
        {
            System.out.println(patient1);
        }

        Collections.sort(patient,new PatientNameComparator());
        System.out.println("sorting by name");
        for(PatientDto patient2:patient)
        {
            System.out.println(patient2);
        }

        Collections.sort(patient,new AddressComparator());
        System.out.println("sorting by address ");
        for(PatientDto patient3:patient)
        {
            System.out.println(patient3);
        }

        Collections.sort(patient,new AgeComparator());
        System.out.println("sorting by age ");
        for(PatientDto patient4:patient)
        {
            System.out.println(patient4);
        }
*/
        Map<Integer,PatientDto> map=new HashMap();

        map.put(1,new PatientDto(2,"varun",22, Gender.male, BloodGroup.Apositive,"chikkamagaluru","G-101",8547474248L,"ramesh","fever"));
        map.put(2,new PatientDto(4,"kiran",24,Gender.male, BloodGroup.Bpositive,"davanagere","F-201",6347474248L,"suresh","cough"));
        map.put(3,new PatientDto(5,"jeevan",25,Gender.male,BloodGroup.Anegative,"shimoga","S-301",84745484744L,"satish","cold"));
        map.put(4,new PatientDto(6,"latha",26,Gender.female,BloodGroup.Bnegative,"banglore","S-209",6783645295L,"ramesh","cholera"));

        Set<Map.Entry<Integer,PatientDto>>set=map.entrySet();

        // java 8 feature
        System.out.println("using stream -----");
        set.stream().forEach(System.out::println);

        // iterator
        System.out.println("using iterator -----------");
        Iterator<Map.Entry<Integer,PatientDto>>itr =set.iterator();
        while (itr.hasNext())
        {
            Map.Entry<Integer,PatientDto> entrySet=itr.next();
            System.out.println(entrySet.getKey() + " ." + entrySet.getValue());
        }

        System.out.println("using for each ---------");
        for(Map.Entry<Integer,PatientDto>entrySet :set)
        {
            System.out.println(entrySet.getKey() + ". " + entrySet.getValue());
        }



    }
}
