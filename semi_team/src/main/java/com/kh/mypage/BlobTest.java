package com.kh.mypage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class BlobTest {
	public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                    "shinee","shinee");
            File f = new File("C://Users//user1//Desktop/춤추는유재석.jpg");
            FileInputStream fis = new FileInputStream(f);
            stmt = con.prepareStatement(
                    "INSERT INTO playlist_info_2 VALUES(?,?,?,?,?)");
            stmt.setString(1, "dbwotjr-1");
            stmt.setString(2, "dbwotjr");
            stmt.setString(3, "압구정날라리");
            LocalDate currentDate = LocalDate.now();
            stmt.setDate(4, Date.valueOf(currentDate));
            stmt.setBinaryStream(5, fis,(int)f.length());
            int rownum = stmt.executeUpdate();
            if(rownum >0){
                System.out.println("삽입성공");
            }else
            {
                System.out.println("실패");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
                //사용한 객체 close
                try {
                    if(con != null) con.close();
                    if(stmt != null) stmt.close();
                } catch (Exception e) {
                }
        }
    }
}
