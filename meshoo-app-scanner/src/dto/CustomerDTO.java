package dto;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO
{
    private int id;
    private String name;
    private String email;
    private long PhNumber;
    private String passsword;
    private String address;

}
