package comparator;

import dto.CustomerDto;

import java.util.Comparator;

public class PasswordComparator implements Comparator<CustomerDto> {
    @Override
    public int compare(CustomerDto o1, CustomerDto o2) {
        return o1.getPassword().compareTo(o2.getPassword());
    }
}
