package com.kh.mypage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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
            File f = new File("C://Users//user1//Desktop/유재석.jpg");
            FileInputStream fis = new FileInputStream(f);
            stmt = con.prepareStatement(
                    "INSERT INTO user_info VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, "dbwotjr");
            stmt.setString(2, "유재석");
            stmt.setString(3, "국민MC");
            stmt.setString(4, "kh1233223!");
            stmt.setString(5, "dbwotjr@naver.com");
            stmt.setString(6, "01045623154");
            stmt.setBinaryStream(7, fis,(int)f.length());
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
