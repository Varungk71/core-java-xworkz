package com.xworkz.instagram.impl;

import com.xworkz.instagram.dto.InstagramDTO;

import java.util.List;

public interface Instagram
{
    public boolean addUser(InstagramDTO dto);

    public List<InstagramDTO> getUser();

    public InstagramDTO getUserByNumber(long phoneNumber);

    public List getUserPhoneNumberAndAgeByName(String name);

    public InstagramDTO getUserById(int id);

    public InstagramDTO getUserByAge(int age);

    public boolean updateUserNameById(String updateName ,int id);

    public boolean deleteuserById(int id);


}
