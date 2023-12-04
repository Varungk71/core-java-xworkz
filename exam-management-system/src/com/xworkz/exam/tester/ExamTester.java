package com.xworkz.exam.tester;

import com.xworkz.exam.Exam;
import com.xworkz.exam.HallTicket;
import com.xworkz.exam.supplementary.SupplementaryExam;

public class ExamTester
{
    public static void main(String[] args)
    {
        Exam exam1=new Exam();
        exam1.setFees(1800);

        HallTicket hallTicket =new HallTicket("M1","gk","18MAT13","4AI19EE055");
        HallTicket ticket=null;

//        calling the parent allow method
        Exam exam=new Exam(ticket);
        exam.setFees(1800);
        exam.allow();

        // calls the allow method of the child class at the run time -run time polymorphism
        Exam exam2=new SupplementaryExam(hallTicket);
        exam2.setFees(1800);
        exam2.allow();

    }
}
