package tester;

import dto.CustomerDTO;
import impl.ECommerceImpl;
import impl.ECommerceMesho;

import java.util.Scanner;

public class Tester
{
    public static void main(String[] args) {
        ECommerceMesho mesho= new ECommerceImpl();
        Scanner sc=new Scanner(System.in);
        CustomerDTO dto=new CustomerDTO();

//     add query
      /*  System.out.println("enter the id -");
        dto.setId(sc.nextInt());
        System.out.println("enter profile id");
        dto.setName(sc.next());
        System.out.println("enter phone number");
        dto.setEmail(sc.next());
        System.out.println("enter age");
        dto.setPhNumber(sc.nextLong());
        System.out.println("enter password -");
        dto.setPasssword(sc.next());
        System.out.println("enter profile name ");
        dto.setAddress(sc.next());
        mesho.addCustomer(dto); */


        mesho.getCustomer();

        mesho.getCustomerByNumber(8475632648L);

        mesho.getCustomerPhoneNumberAndAddressByName("jeevan");

        mesho.getCustomerById(1);

        mesho.getCustomerByEmail("lohith@gmail");

        mesho.updateCustomerAddressById("Banglore",2);

        mesho.updatePhoneNumberByID(8431017474L,5);

        mesho.updateEmailByPhoneNumber("vgk7165@gmail.com",8475632648L);

        mesho.updatepasswordByEmail("Varungk@123","vgk7165@gmail.com");

        mesho.updatePasswordById("Varungk@456",1);

//        mesho.deleteCustomerById(1);

//        mesho.deleteCustemerByEmail("vgk7165@gmail.com");
    }
}
