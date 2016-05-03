package trivia;

public class Session {
    private int SessionNb = 0;
    
    public Session(){
        try{
            SQL.startConnection();
            java.sql.ResultSet rs = SQL.select("select Session_ID from sessions order by Session_ID desc limit 1;");
            if(rs.next()){
                this.SessionNb = rs.getInt("Session_ID");
            }
            SQL.endConnection();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public int getSessionNb() {
        return SessionNb;
    }
}
