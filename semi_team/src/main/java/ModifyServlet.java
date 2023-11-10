

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "shinee";
		String userPassword = "shinee";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, userName, userPassword);
			
			System.out.println();
			String user_id = request.getParameter("user_id");
			String user_name = request.getParameter("user_name");			
			String user_nickname = request.getParameter("user_nickname");
			String user_password = request.getParameter("user_password");
			String email = request.getParameter("email");
			String phone_number = request.getParameter("phone_number");
			String profile_image = request.getParameter("profile_image");
			
			System.out.println(user_id);
			System.out.println(user_name);
			String sql = "UPDATE user_info SET user_name=?, user_nickname=?, user_password=?, email=?, phone_number=? WHERE user_id=?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,user_name);
			ps.setString(2,user_nickname);
			ps.setString(3,user_password);
			ps.setString(4,email);
			ps.setString(5,phone_number);
			ps.setString(6,user_id);
			
			ps.executeUpdate();
			
			//성공할 경우 이동할 페이지 설정해주고 다시 전송
		       
			response.sendRedirect("mypageMain.jsp");
			
	         
		} catch (SQLException e) {
			// 실패할 경우 이동할 페이지 설정
			response.sendRedirect("modifyInfo.jsp");
			System.out.println("정보 수정에 실패하였습니다.");
			e.printStackTrace();
		}
		
	}

}
