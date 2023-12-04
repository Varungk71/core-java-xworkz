package com.xworkz.instagram.impl;

import com.xworkz.instagram.dto.InstagramDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class InstagramImpl implements Instagram {
    @Override
    public boolean addUser(InstagramDTO dto) {
        Connection con = null;
        PreparedStatement stmt = null;
        Statement st=null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");

            stmt = con.prepareStatement("insert into insta_profile values(?,?,?,?,?,?)");
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getProfileId());
            stmt.setLong(3, dto.getProfilePhNum());
            stmt.setInt(4, dto.getAge());
            stmt.setString(5, dto.getPassword());
            stmt.setString(6, dto.getProfileName());


//          stmt.executeUpdate("delete from insta_profile where id=1");
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionJdbc.finallyBlock();
        }
        return false;
    }

    @Override
    public List<InstagramDTO> getUser() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<InstagramDTO> instaDTO = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select * from insta_profile");

            rs = stmt.executeQuery();
            while (rs.next()) {
                InstagramDTO insta = new InstagramDTO();
                insta.setId(rs.getInt(1));
                insta.setProfileId(rs.getString(2));
                insta.setProfilePhNum(rs.getLong(3));
                insta.setAge(rs.getInt(4));
                insta.setPassword(rs.getString(5));
                insta.setProfileName(rs.getString(6));

                instaDTO.add(insta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionJdbc.finallyBlock();
        }
        return instaDTO;
    }

    @Override
    public InstagramDTO getUserByNumber(long phoneNumber) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Object> instaDTO = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select * from insta_profile where profile_phone_number=?");
            stmt.setLong(1, phoneNumber);


            rs = stmt.executeQuery();
            while (rs.next()) {
                InstagramDTO insta = new InstagramDTO();
                insta.setId(rs.getInt(1));
                insta.setProfileId(rs.getString(2));
                insta.setProfilePhNum(rs.getLong(3));
                insta.setAge(rs.getInt(4));
                insta.setPassword(rs.getString(5));
                insta.setProfileName(rs.getString(6));

                instaDTO.add(insta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionJdbc.finallyBlock();
        }
        return (InstagramDTO) instaDTO;
    }

    @Override
    public List getUserPhoneNumberAndAgeByName(String name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List instaDTO = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select profile_phone_number,age from insta_profile where profile_name=?");
            stmt.setString(1, name);


            rs = stmt.executeQuery();
            while (rs.next()) {
                InstagramDTO insta = new InstagramDTO();
//                insta.setId(rs.getInt(1));
//                .insta.setProfileId(rs.getString(2));
                insta.setProfilePhNum(rs.getLong(1));
                insta.setAge(rs.getInt(2));
//                insta.setPassword(rs.getString(5));
//                insta.setProfileName(rs.getString(6));

                instaDTO.add(insta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionJdbc.finallyBlock();
        }
        return instaDTO;
    }

    @Override
    public InstagramDTO getUserById(int id) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List instaDTO = new ArrayList<>();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
            stmt = con.prepareStatement("select * from insta_profile where user_id=?");
//            stmt = con.prepareStatement("select * from insta_profile where user_id=?");
            stmt.setInt(1, id);


            rs = stmt.executeQuery();
            while (rs.next()) {
                InstagramDTO insta = new InstagramDTO();
                insta.setId(rs.getInt(1));
                insta.setProfileId(rs.getString(2));
                insta.setProfilePhNum(rs.getLong(3));
                insta.setAge(rs.getInt(4));
                insta.setPassword(rs.getString(5));
                insta.setProfileName(rs.getString(6));

                instaDTO.add(insta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionJdbc.finallyBlock();
        }
        return null;
    }

        @Override
        public InstagramDTO getUserByAge (int age)
        {
            Connection con = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;

            List<InstagramDTO> instaDTO = new ArrayList<>();
            InstagramDTO dto=new InstagramDTO();

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
                stmt = con.prepareStatement("select * from insta_profile");
//              stmt = con.prepareStatement("select * from insta_profile where age=?");
                stmt.setInt(1,1);


                rs = stmt.executeQuery();
                while (rs.next()) {
                    InstagramDTO insta = new InstagramDTO();
                    insta.setId(rs.getInt(1));
                    insta.setProfileId(rs.getString(2));
                    insta.setProfilePhNum(rs.getLong(3));
                    insta.setAge(rs.getInt(4));
                    insta.setPassword(rs.getString(5));
                    insta.setProfileName(rs.getString(6));

                    instaDTO.add(insta);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConnectionJdbc.finallyBlock();
            }
                return dto;
        }




        @Override
        public boolean updateUserNameById (String updateName,int id){
            Connection con = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean isUpdated=false;

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
                con.setAutoCommit(false);
                stmt = con.prepareStatement("update insta_profile set profile_name=? where user_id=? ");
                stmt.setString(1,updateName);
                stmt.setInt(2,id);

                isUpdated=true;

                int row= stmt.executeUpdate();
                con.commit();

            } catch (SQLException e) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    e.printStackTrace();
                }
            } finally {
                ConnectionJdbc.finallyBlock();
            }
            return isUpdated;
        }
        @Override
        public boolean deleteuserById ( int id)
        {
            Connection con = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean isDeleted=false;

            List<InstagramDTO> instaDTO = new ArrayList<>();

            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
                con.setAutoCommit(false);
                stmt = con.prepareStatement("delete from insta_profile where user_id=? ");
                stmt.setInt(1,id);
                isDeleted=true;

                int row= stmt.executeUpdate();
                con.commit();

            } catch (SQLException e) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            } finally {
                ConnectionJdbc.finallyBlock();
            }
            return isDeleted;
        }
}
