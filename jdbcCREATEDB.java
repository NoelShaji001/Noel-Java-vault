
package pROJECT1;
import java.sql.*;

public class jdbcCREATEDB {
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/student181";
	static final String USER = "Noel";
    static final String PWD = "12345@DRAKEN";
    public static void main(String args[]) {
    	Statement stmt= null;
    	Connection conn=null;
    	try {
    		//register jdbc driver
    		Class.forName(JDBC_DRIVER);
    		//open a connection
    		 System.out.println("Connecting to database...");
             conn = DriverManager.getConnection(DB_URL, USER, PWD);
             //execute query
             System.out.println("Creating database...");
             stmt = conn.createStatement();
                                                 
          /*   String sql = "create table user"+
             "(roll_number integer not null,"+
            		 "first_name varchar(50), "+
             "last_name varchar(50),"+
            		 " age integer,"+
             "primary key (roll_number))";*/
            
             String sql = "INSERT INTO user values"
                     + "(2,'Sam','George',23),"
                     +"(3,'Anil','Pate',21),"
                     +"(1,'Ram','Naik',20)";
             int i=stmt.executeUpdate(sql);
             System.out.println("Values Inserted,"+"Value of i="+i); // Usually false for CREATE DATABASE
             //System.out.println("Database created successfully.");
    	 } catch (SQLException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();

    	}
    	finally {
    			try {
                    if (stmt != null) stmt.close();
                    if (conn!= null) conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            
    	}
    }
}

