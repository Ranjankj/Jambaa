package daoPattern;
import java.sql.*;

public class DaoImpl {
	private Connection con = null;
	
	private void makeConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "Ranjan@007");
	}
	
	public Student getStudent(int roll) {
		String query = "select name from student where id="+roll;
		try {
			makeConnection();
			Student s = new Student();
			
			// creating statement and executing query
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String str = rs.getString(1);
			
			//closing the connections
			st.close();
			con.close();
			// setting the data member of student object
			s.setName(str);
			s.setRollNo(roll);
			return s;
		}catch(Exception e) {
			System.out.println("Got this Exception:==> "+e);
		}
		
		return null;
		
	}

	public void addStudent(int roll, String name) {
		try {
			String query = "insert into student values(?,?)";
			makeConnection();
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, roll);
			st.setString(2,name);
			st.executeUpdate();
			st.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("we got this Exception:==> "+e);
		}
		
	}
}
