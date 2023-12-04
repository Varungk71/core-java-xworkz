package com.xworkz.ecommerce.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
public class Customers
{
    private String customerId;
    private String customerName;
    private String email;
    private long phoneNumber;
    private String password;

}
