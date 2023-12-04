package tester;

import comparator.CustomerNameComparator;
import comparator.EmailComparator;
import comparator.PasswordComparator;
import dto.CustomerDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;


public class CustomerTester
{
    public static void main(String[] args) {

       /* List<CustomerDto> customer=new LinkedList<>();

        customer.add(new CustomerDto(8,"varun","vgk@gmail.com",8472644234L,"ABC1234"));
        customer.add(new CustomerDto(10,"kiran","kiran@gmail.com", 8634256913L,"Kiran"));
        customer.add(new CustomerDto(5,"jeevan","jeevan@gmail.com", 7563843943L,"Jeevan"));
        customer.add(new CustomerDto(2,"abhishek","abhi@gmail.com", 9756424673L,"Abhi123"));
        customer.add(new CustomerDto(1,"chandan","chandan@gmail.com", 6532637583L,"Chandan"));
        customer.add(new CustomerDto(3,"hruthik","hruthik@gmail.com", 7895374523L,"Hruthik"));
        customer.add(new CustomerDto(6,"sudeep","sudeep@gmail.com", 7537624563L,"Sudeep"));
        customer.add(new CustomerDto(4,"kumar","kumar@gmail.com", 9755243763L,"Kumar"));
        customer.add(new CustomerDto(9,"akshay","akshay@gmail.com", 8763465253L,"Akshay"));
        customer.add(new CustomerDto(7,"rudresh","rudresh@gmail.com", 9734568753L,"Rudresh"));



        Collections.sort(customer);
        System.out.println("sorting by the id");
        for(CustomerDto customer1:customer)
        {
            System.out.println(customer1);
        }

        Collections.sort(customer,new CustomerNameComparator());
        System.out.println("sorting by the name");
        for(CustomerDto customer1:customer)
        {
            System.out.println(customer1);
        }

        Collections.sort(customer,new EmailComparator());
        System.out.println("sorting by email");
        for(CustomerDto customer2:customer)
        {
            System.out.println(customer2);
        }

        Collections.sort(customer,new PasswordComparator());
        System.out.println("sorting by the password");
        for(CustomerDto customer3:customer)
        {
            System.out.println(customer3);
        }

        */
        Map<Integer,CustomerDto> map=new HashMap();

        map.put(1,new CustomerDto(1,"varun","vgk@gmail.com",8472644234L,"ABC1234"));
        map.put(2,new CustomerDto(2,"jeevan","jeevan@gmail.com", 7563843943L,"Jeevan"));
        map.put(3,new CustomerDto(3,"abhishek","abhi@gmail.com", 9756424673L,"Abhi123"));
        map.put(4,new CustomerDto(4,"kiran","kiran@gmail.com", 8634256913L,"Kiran"));
        map.put(5,new CustomerDto(5,"chandan","chandan@gmail.com", 6532637583L,"Chandan"));
        map.put(6,new CustomerDto(6,"hruthik","hruthik@gmail.com", 7895374523L,"Hruthik"));
        map.put(7,new CustomerDto(7,"sudeep","sudeep@gmail.com", 7537624563L,"Sudeep"));
        map.put(8,new CustomerDto(8,"kumar","kumar@gmail.com", 9755243763L,"Kumar"));
        map.put(9,new CustomerDto(9,"akshay","akshay@gmail.com", 8763465253L,"Akshay"));
        map.put(10,new CustomerDto(10,"rudresh","rudresh@gmail.com", 9734568753L,"Rudresh"));

        Set<Map.Entry<Integer,CustomerDto>>set=map.entrySet();
        for(Map.Entry<Integer,CustomerDto>entrySet:set)
        {
            System.out.println(entrySet.getKey() + ". " + entrySet.getValue());
        }
    }

}
