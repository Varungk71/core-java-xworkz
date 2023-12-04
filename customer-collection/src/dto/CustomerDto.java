package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CustomerDto implements Comparable<CustomerDto>
{
    private int customerId;
    private String CustomerName;
    private String eMail;
    private Long phNumber;
    private String password;

    @Override
    public int compareTo(CustomerDto o) {
        return this.customerId-o.customerId;
    }
}
