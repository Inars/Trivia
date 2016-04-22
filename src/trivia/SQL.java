package trivia;
import java.sql.*;

public class SQL {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/trivialdb";
    private static String USERNAME = "root";
    private static String PASSWORD = "1361995";
    private static Connection con;
    
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
            if (con != null) {
                con.close();
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public static boolean insert(String sql){
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean update(String sql){
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.executeQuery();
            return true;
        }catch(SQLException ex){
            return false;
        }
    }
    
    public static boolean delete(String sql){
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            statement.executeQuery();
            return true;
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    
    public static ResultSet select(String sql){
        try{
            PreparedStatement statement = con.prepareStatement(sql);
            return statement.executeQuery();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
}
