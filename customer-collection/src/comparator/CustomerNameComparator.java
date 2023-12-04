package comparator;

import dto.CustomerDto;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<CustomerDto> {
    @Override
    public int compare(CustomerDto o1, CustomerDto o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
