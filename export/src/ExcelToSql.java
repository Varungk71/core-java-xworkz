import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class ExcelToSql
{
    public static void main(String[] args) throws SQLException, IOException {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        System.out.println("connection created");
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/social_media", "root", "Xworkzodc@123");

            // query
            System.out.println("table created");
            stmt = con.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS employee(\n" +
                    "id INT  ,\n" +
                    "full_name VARCHAR(50),\n" +
                    "job_title VARCHAR(50),\n" +
                    "department VARCHAR(50),\n" +
                    "business_unit VARCHAR(50),\n" +
                    "gender VARCHAR(50));";
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // excel

        System.out.println("read the excel");
        FileInputStream file = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\datasheet.xlsx");

        XSSFWorkbook work = new XSSFWorkbook(file);

        XSSFSheet sheet = work.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        for (int r = 1; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            int id = (int) row.getCell(0).getNumericCellValue();
            String name = row.getCell(1).getStringCellValue();
            String job = row.getCell(2).getStringCellValue();
            String department = row.getCell(3).getStringCellValue();
            String business = row.getCell(4).getStringCellValue();
            String gender = row.getCell(5).getStringCellValue();


            String sql = "insert into employee values('" + id + "','" + name + "','" + job + "','" + department + "','" + business + "','" + gender + "')";
            stmt.execute(sql);
            stmt.execute("commit");
        }

//        work.close();
        file.close();


        stmt.close();
        con.close();
        System.out.println("data exported to databse ");
    }
    }

