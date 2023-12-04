package comparator;

import dto.CustomerDto;

import java.util.Comparator;

public class EmailComparator implements Comparator<CustomerDto> {
    @Override
    public int compare(CustomerDto o1, CustomerDto o2) {
        return o1.getEMail().compareTo(o2.getEMail());
    }
}
