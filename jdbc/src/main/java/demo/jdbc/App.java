package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//    	System.out.println(Class.forName("com.mysql.jdbc.Driver"));
//    	Class.forName("com.mysql.jdbc.Driver");
    Connection connection 
    = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
    //Statement statement = connection.createStatement();
    PreparedStatement statement = connection.prepareStatement("SELECT first_name, last_name FROM actor");
    
    ResultSet rs = statement.executeQuery();
    
    while(rs.next()) {
    	System.out.println(rs.getString(1) + " " + rs.getString(2));
    }
    }
}
