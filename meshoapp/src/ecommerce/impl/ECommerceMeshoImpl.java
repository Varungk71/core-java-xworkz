package ecommerce.impl;

import dto.CustomerDTO;
import ecommerce.EcommerceMesho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ECommerceMeshoImpl implements EcommerceMesho
{

    @Override
    public boolean addCustomer() {

        Connection con=null;
        Statement stmt=null;

        try {
            con= DriverManager.getConnection(   "jdbc:mysql://localhost:3306/xworkz","root","Xworkzodc@123");
            stmt=con.createStatement();
//            stmt.executeUpdate("insert into customer_table values(1,'varun','varun@gmail','8475632648','varun@123','Chikmanglore')");
//            stmt.executeUpdate("insert into customer_table values(2,'kiran','kiran@gmail','5947484744','Kiran@123','Davanagere')");
//            stmt.executeUpdate("insert into customer_table values(3,'abhishek','abhi@gmail','9339484744','Abhi@123','Davanagere')");
            stmt.executeUpdate("insert into customer_table values(4,'jeevan','jeevan@gmail','9785654653','Jeevan@123','Hassan')");
                stmt.executeUpdate("insert into customer_table values(5,'amith','amith@gmail','8673948474','Amith@123','Banglore')");
            stmt.executeUpdate("insert into customer_table values(6,'lohith','lohith@gmail','5645757744','Lohith@123','Shimoga')");
//            System.out.println(noOfRows);
            return true;

        }catch(SQLException e)
        {
            e.printStackTrace();
        }

        return true;
    }
}
