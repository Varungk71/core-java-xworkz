package impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class InstagramImpl implements Instagram
{

    @Override
    public boolean addUser() {
        Connection con=null;
        Statement stmt =null;

        try{
            con= DriverManager.getConnection( "jdbc:mysql://localhost:3306/social_media","root","Xworkzodc@123");
            stmt=con.createStatement();
            
            stmt.execute("insert into profile values('2','jeevan_d_b','9856475437','20','Jeevan@123','Jeevan D B')");
            stmt.execute("insert into profile values('3','kiran_h_l','6759473645','25','Kiran@123','Kiran H L')");
            stmt.execute("insert into profile values('4','abhi_c','9856374585','30','Abhi@123','ABHI C')");
            stmt.execute("insert into profile values('5','chandan_j_m','8594753745','42','Chandan@123','Chandan J M')");

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }
}
