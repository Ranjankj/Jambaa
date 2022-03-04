// this is step by step process to connect to the database via java JDBC
/*
1. import file                                -->   import java.sql.*;
2. Load And Register the Driver               -->   Class.forName("com.mysql.cj.jdbc.Driver");
3. Make a Connection                          -->   Connection con = DriverManager.getConnection(url,username, passWord);
4. Create a Statement                         -->   Statement st = con.createStatement();
5. Execute the query which return 
   the data in ResultSet                     -->   ResultSet rs = st.executeQuery(query);
   process the data.
   
   $ ==>  initially the rs is pointing to the title of the table so we have to do rs.next().
   
6. st.close();                                --> close the statement.
7. con.close();                               --> Close the connection.
*/


// To fetch the data from the database

package jdbcKaKaam;
import java.sql.*;
public class Intro {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String pass = "PassWordOfSql";
		String query  = "select * from student"; 
    
		Class.forName("com.mysql.cj.jdbc.Driver"); //it can throw exception (registering the driver);
		Connection con = DriverManager.getConnection(url,uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
		}
		
		st.close();
		con.close();
	}

}

// When Updating the data we use prepared Statement

package jdbcKaKaam;
import java.sql.*;
public class UpdatingDataInSql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,8,9,10};
		String nameArr[] = {"Josh", "Steve", "Ben", "Hajel", "Kajal", "Raman"};
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String pass = "PassWord";
		String query = "insert into student values(?,?)"; // we put this question mark and change this place with some data later on.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
    
    //prepared statement
		PreparedStatement st = con.prepareStatement(query);
		for(int i = 0; i<arr.length; i++) {
			st.setInt(1,arr[i]);
			st.setString(2, nameArr[i]);
			int count = st.executeUpdate();
		}
		System.out.println("Done");
		st.close();
		con.close();
		
	}

}






