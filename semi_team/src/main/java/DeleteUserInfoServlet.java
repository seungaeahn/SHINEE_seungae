

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


@WebServlet("/DeleteUserInfoServlet")
public class DeleteUserInfoServlet extends HttpServlet {
	private static final String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String jdbcUser="shinee";
	private static final String jdbcPW="shinee";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPW);
			String user_id = request.getParameter("user_id");
			String sql = "DELETE FROM user_info WHERE user_id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,user_id);
			
			int rowsDeleted = ps.executeUpdate();
			if (rowsDeleted >0) {
				System.out.println("회원탈퇴 성공");
				
			}else {
				System.out.println("회원탈퇴 실패");;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

        response.sendRedirect("login.jsp");
		
	}

}
