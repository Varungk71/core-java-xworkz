package com.xworkz.exam;

import lombok.*;

@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Exam
{
    private int fees;
    private HallTicket hallTicket;

//    constructor created
    public Exam(HallTicket hallticket){
        this.hallTicket=hallticket;
    }
    public boolean allow()
    {
        boolean isAllowed=false;
        if(fees>=1775)
        {
            System.out.println("Fees is paid .. collect hall ticket");
            if(hallTicket !=null)
            {
                System.out.println("ticket details are fine..init hall ticket");
                this.hallTicket=hallTicket;
                this.hallTicket.displayDetails();
                isAllowed=true;
                System.out.println("details are fine..you are eligible");
            }
        else
            {
                System.out.println("pay first");
            }
        }
        return isAllowed;
    }
}
