package com.xworkz.exam.supplementary;

import com.xworkz.exam.Exam;
import com.xworkz.exam.HallTicket;
import lombok.Setter;

@Setter
public class SupplementaryExam extends Exam {
    public int noOfAttempts=2;

//    constructor created
    public SupplementaryExam(HallTicket hallTicket)
    {

        super(hallTicket);
    }
        @Override
        public boolean allow ()
        {
            if (noOfAttempts > 1) {
                return super.allow();
            }
            return false;
        }
    }
