package trivia;
import java.sql.*;

public class SQL {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/trivialdb";
    private static String USERNAME = "root";
    private static String PASSWORD = "1361995";
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    
    public static void startConnection(){
        try{
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void endConnection(){
        try{
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static void insert(){
        
    }
    
    public static void update(){
        
    }
    
    public static void delete(){
        
    }
}
