import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class DatabaseToExcel
{
    public static void main(String[] args) throws SQLException, IOException {
        // connect to data base

     Connection con=null;
     Statement stmt =null;
     ResultSet rs=null;
     try {
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");
        stmt = con.createStatement();
        rs = stmt.executeQuery("SELECT * FROM insta_profile");
         System.out.println("connection created sucessfully");
       }catch(SQLException e){
        e.getMessage();
       }

        // excel
        try {
            System.out.println("excel created");
            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet("new doc");
            System.out.println("columns created");
            Row row =  sheet.createRow(0);
            row.createCell(0).setCellValue("user_id");
            row.createCell(1).setCellValue("profile_id");
            row.createCell(2).setCellValue("profile_phone_number");
            row.createCell(3).setCellValue("age");
            row.createCell(4).setCellValue("password");
            row.createCell(5).setCellValue("profile_name");

            int r = 1;
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String profileId = rs.getString("profile_id");
                long number = rs.getLong("profile_phone_number");
                int age = rs.getInt("age");
                String password = rs.getString("password");
                String name = rs.getString("profile_name");

                row = sheet.createRow(r++);

                row.createCell(0).setCellValue(id);
                row.createCell(1).setCellValue(profileId);
                row.createCell(2).setCellValue(number);
                row.createCell(3).setCellValue(age);
                row.createCell(4).setCellValue(password);
                row.createCell(5).setCellValue(name);
            }
            FileOutputStream file = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Documents\\new doc.xlsx");
            workbook.write(file);
            System.out.println("exported to excel sucessfully");

            workbook.close();
            file.close();
            rs.close();
            stmt.close();
            con.close();

        }catch (NoClassDefFoundError e){
            e.printStackTrace();
        }
     }
}