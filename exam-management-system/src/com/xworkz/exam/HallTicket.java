package com.xworkz.exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HallTicket
{
    private String subjectName;
    private String candidateName;
    private String subjectCode;
    private String usnNo;

    public void displayDetails()
    {
        System.out.println("subject name is " + subjectName);
        System.out.println("candidate  name is " + candidateName);
        System.out.println("subject code is"+ subjectCode);
        System.out.println("usn num is "+ usnNo);

    }

}
