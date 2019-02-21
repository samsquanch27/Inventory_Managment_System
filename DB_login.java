import java.sql.Connection;
import java.sql.DriverManager;

public class DB_login {

	private static String dbname = "systemManagement_Inventory_Db";
    private static String username = "root";
    private static String password = "";
    
    static Connection con=null;
    public static Connection getConnection() {
        if (con != null) return con;
        
        /**
         * get db, user, pass from settings file
         */
        
        return getConnection(dbname, username, password);
    }

    private static Connection getConnection(String db_name,String user_name,String password) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/"+db_name+"?user="+user_name+"&password="+password);
            System.out.println("Connection Success");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;        
    }
    

 
		    public static Connection getConnection1() {
		        
		        Connection con = null;
		        try {
		            Class.forName("com.mysql.jdbc.Driver");
		            con = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname, username, password);
		            System.out.println("connection completed");
		        } catch (Exception ex) {
		            System.out.println("Connection not successful");
		        }
		        
		        return con;
		        
		    }
		    
		}
		
		
