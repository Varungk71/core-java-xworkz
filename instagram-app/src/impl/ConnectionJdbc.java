package impl;

import java.sql.*;



public class ConnectionJdbc {
    public static void finallyBlock() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        if (rs != null) {
            try {
                stmt.close();
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

    public static Connection connection() {
        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
