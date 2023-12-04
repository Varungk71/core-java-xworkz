package com.xworkz.instagram.tester;


import com.xworkz.instagram.dto.InstagramDTO;
import com.xworkz.instagram.impl.Instagram;
import com.xworkz.instagram.impl.InstagramImpl;
import java.util.List;
import lombok.Setter;

import java.util.Scanner;

@Setter
public class InstaTester

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        Instagram insta = new InstagramImpl();
        InstagramDTO dto=new InstagramDTO();
//     add query
        System.out.println("enter the id -");
        dto.setId(sc.nextInt());
        System.out.println("enter profile id");
        dto.setProfileId(sc.next());
        System.out.println("enter phone number");
        dto.setProfilePhNum(sc.nextLong());
        System.out.println("enter age");
        dto.setAge(sc.nextInt());
        System.out.println("enter password -");
        dto.setPassword(sc.next());
        System.out.println("enter profile name ");
        dto.setProfileName(sc.next());
        insta.addUser(dto);

//      select query
        List<InstagramDTO> user=insta.getUser();
        System.out.println(user);

       InstagramDTO user1= insta.getUserByNumber(49547549545L);
        System.out.println(user1);


        // get phone number and age by name

        List data=insta.getUserPhoneNumberAndAgeByName("Varun");
        System.out.println(data);

//      update query
        boolean isUpdated= insta.updateUserNameById("Ajay",7);
        System.out.println("is updated -" + isUpdated);
//      delete query

  boolean delete=insta.deleteuserById(2);
     System.out.println("deleted -"+ delete);

//      System.out.println("After delete");
       List<InstagramDTO> user2=insta.getUser();
        System.out.println(user2);


    }
}
