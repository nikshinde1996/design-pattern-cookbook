import java.sql.Connection;

public class Client {
	public static void main(String args[]) {
		// Create the ConnectionPool: 
        ConnectionPool pool = new ConnectionPool( 
            "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb", 
            "sa", "password"); 
  
        // Get a connection: 
        Connection con = pool.takeOut();
        
        // Return the connection: 
        pool.takeIn(con); 
	}
}
