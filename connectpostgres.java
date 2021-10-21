package connect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class connectpostgres {

	public static void main(String[] args) {
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
/* A Connection is the session between java application and database. The Connection interface is a factory of Statement, 
PreparedStatement, and DatabaseMetaData i.e. object of Connection can be used to get the object of Statement and DatabaseMetaData. 
The Connection interface provide many methods for transaction management like commit(), rollback()


Once a connection is obtained we can interact with the database. The JDBC Statement, CallableStatement, and PreparedStatement interfaces define the 
methods and properties that enable you to send SQL or PL/SQL commands and receive data from your database.


A JDBC URL provides a way of identifying a database so that the appropriate driver recognizes it and connects to it*/
