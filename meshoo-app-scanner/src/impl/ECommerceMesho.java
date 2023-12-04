package impl;

import dto.CustomerDTO;

import java.util.List;

public interface ECommerceMesho {

        public  boolean addCustomer(CustomerDTO dto);
        public List<CustomerDTO> getCustomer();
        public CustomerDTO getCustomerByNumber(long phoneNumber);

        public List getCustomerPhoneNumberAndAddressByName(String name);

        public CustomerDTO getCustomerById(int id);

        public CustomerDTO getCustomerByEmail(String email);

        public boolean updateCustomerAddressById(String updateAddress ,int id);

       public boolean updatePhoneNumberByID(long phNumber,int id);

       public boolean updateEmailByPhoneNumber(String email,long phNumber);

       public boolean updatepasswordByEmail(String password ,String email);

       public boolean updatePasswordById(String password,int id);

        public boolean deleteCustomerById(int id);

        public boolean deleteCustemerByEmail(String email);


}
