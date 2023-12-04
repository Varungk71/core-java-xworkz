package impl;

import dto.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ECommerceImpl implements ECommerceMesho
{

    public static void finallyBlock() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public boolean addCustomer(CustomerDTO dto) {
        Connection con=null;
        PreparedStatement stmt=null;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt = con.prepareStatement("insert into insta_profile values(?,?,?,?,?,?)");
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getName());
            stmt.setString(3, dto.getEmail());
            stmt.setLong(4, dto.getPhNumber());
            stmt.setString(5, dto.getPasssword());
            stmt.setString(6, dto.getAddress());
            stmt.executeUpdate();

            return  true;
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return false;
    }

    @Override
    public List<CustomerDTO> getCustomer() {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("select * from customer_table");

            rs= stmt.executeQuery();
            while(rs.next()){
                CustomerDTO cust=new CustomerDTO();
                cust.setId(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setEmail(rs.getString(3));
                cust.setPhNumber(rs.getLong(4));
                cust.setPasssword(rs.getString(5));
                cust.setAddress(rs.getString(6));

                customerDTOS.add(cust);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return null;
    }

    @Override
    public CustomerDTO getCustomerByNumber(long phoneNumber) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("select * from customer_table where phone_number=?");
            stmt.setLong(1,phoneNumber);

            rs= stmt.executeQuery();
            while(rs.next()){
                CustomerDTO cust=new CustomerDTO();
                cust.setId(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setEmail(rs.getString(3));
                cust.setPhNumber(rs.getLong(4));
                cust.setPasssword(rs.getString(5));
                cust.setAddress(rs.getString(6));

                customerDTOS.add(cust);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return null;
    }

    @Override
    public List getCustomerPhoneNumberAndAddressByName(String name) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("select phone_number,customer_address from customer_table where customer_name=?");
            stmt.setString(1,name);

            rs= stmt.executeQuery();
            while(rs.next()){
                CustomerDTO cust=new CustomerDTO();
//                cust.setId(rs.getInt(1));
//                cust.setName(rs.getString(2));
//                cust.setEmail(rs.getString(3));
                cust.setPhNumber(rs.getLong(1));
//                cust.setPasssword(rs.getString(5));
                cust.setAddress(rs.getString(2));

                customerDTOS.add(cust);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return customerDTOS;
    }

    @Override
    public CustomerDTO getCustomerById(int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("select * from customer_table where customer_id=?");
            stmt.setLong(1,id);

            rs= stmt.executeQuery();
            while(rs.next()){
                CustomerDTO cust=new CustomerDTO();
                cust.setId(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setEmail(rs.getString(3));
                cust.setPhNumber(rs.getLong(4));
                cust.setPasssword(rs.getString(5));
                cust.setAddress(rs.getString(6));

                customerDTOS.add(cust);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return null;
    }

    @Override
    public CustomerDTO getCustomerByEmail(String email) {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("select * from customer_table where customer_email=?");
            stmt.setString(1,email);

            rs= stmt.executeQuery();
            while(rs.next()){
                CustomerDTO cust=new CustomerDTO();
                cust.setId(rs.getInt(1));
                cust.setName(rs.getString(2));
                cust.setEmail(rs.getString(3));
                cust.setPhNumber(rs.getLong(4));
                cust.setPasssword(rs.getString(5));
                cust.setAddress(rs.getString(6));

                customerDTOS.add(cust);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return null;
    }

    @Override
    public boolean updateCustomerAddressById(String updateAddress, int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isUpdated=false;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("update customer_table set customer_address where customer_id=?");
            stmt.setInt(1,id);

           int rs= stmt.executeUpdate();
           con.commit();
           isUpdated=true;

        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePhoneNumberByID(long phNumber, int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isUpdated=false;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.prepareStatement("update customer_table set phone_number=? where customer_id=?");
            stmt.setLong(1,phNumber);
            stmt.setInt(2,id);

            int rs= stmt.executeUpdate();
            isUpdated=true;

        }catch(SQLException e)
        {
            e.printStackTrace();
        }finally {
            finallyBlock();
        }
        return isUpdated;

    }

    @Override
    public boolean updateEmailByPhoneNumber(String email, long phNumber) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isUpdated=false;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("update customer_table set customer_email where phone_number=?");
            stmt.setLong(1,phNumber);

            int rs= stmt.executeUpdate();
            con.commit();
            isUpdated=true;

        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isUpdated;
    }


    @Override
    public boolean updatepasswordByEmail(String password, String email) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isUpdated=false;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("update customer_table set customer_password where customer_email=?");
            stmt.setString(1,email);

            int rs= stmt.executeUpdate();
            con.commit();
            isUpdated=true;

        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isUpdated;
    }

    @Override
    public boolean updatePasswordById(String password, int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isUpdated=false;

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("update customer_table set customer_password where customer_id=?");
            stmt.setInt(1,id);

            int rs= stmt.executeUpdate();
            con.commit();
            isUpdated=true;

        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isUpdated;
    }

    @Override
    public boolean deleteCustomerById(int id) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isDeleted=false;

        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("delete from customer_table where customer_id=?");
            stmt.setLong(1,id);

           int rs= stmt.executeUpdate();
           con.commit();
            isDeleted=true;
        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isDeleted;
    }

    @Override
    public boolean deleteCustemerByEmail(String email) {
        Connection con=null;
        PreparedStatement stmt=null;
        boolean isDeleted=false;

        List<CustomerDTO> customerDTOS=new ArrayList<>();

        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            con.setAutoCommit(false);
            stmt=con.prepareStatement("delete from customer_table where customer_email=?");
            stmt.setString(1,email);

            int rs= stmt.executeUpdate();
            con.commit();
            isDeleted=true;
        }catch(SQLException e)
        {
            try {
                con.close();
            } catch (SQLException ex) {
                e.printStackTrace();
            }

        }finally {
            finallyBlock();
        }
        return isDeleted;

    }
}