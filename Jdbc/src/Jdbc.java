import java.sql.*;
public class Jdbc 
{

	public static void main(String[] args) throws Exception
	{ 
		String url = "jdbc:mysql://localhost/company";
		String uname = "root";
		String pass = "deepak";
		String query = "SELECT * FROM employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
		System.out.println(name); 
		st.close();
		con.close();
		
	}
	
	

}
