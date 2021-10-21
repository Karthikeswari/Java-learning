package connect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectpostgres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
    		Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase","postgres","K@rthika27");
    		String sql = "insert into contacts (fname,lname,email)" + " values('Dhan','padmanaban','dhan@hmail.com')";
    		Statement s = c.createStatement();
    		int r = s.executeUpdate(sql);
    		if(r > 0) {
    			System.out.println("New row added to the table");
    		}
        	c.close();

        }
        catch(SQLException e){
        	System.out.println("Error in connection");
        	e.printStackTrace();
        }
	}
	

}
