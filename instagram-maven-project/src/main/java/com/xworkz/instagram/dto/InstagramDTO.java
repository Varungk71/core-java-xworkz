package com.xworkz.instagram.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InstagramDTO
{
    private int id;
    private String profileId;
    private long profilePhNum;
    private int age;
    private String password;
    private String profileName;
}
