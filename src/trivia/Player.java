package trivia;

public class Player {
    private final String name;
    private int CorrectAnswers = 0;
    private int player_id;

    public Player(String name, boolean isPlayer1){
        this.name = name;
        try{
            SQL.startConnection();
            java.sql.ResultSet rs;
            if(isPlayer1){
                rs = SQL.select("select Player_ID from players order by Player_ID desc limit 1;");
            }else{
                rs = SQL.select("select Player_ID from players order by Player_ID desc limit 1 offset 1;");
            }
            if(rs.next()){
                this.player_id = rs.getInt("Player_ID");
            }
            SQL.endConnection();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public void addAnswer(int player_id, int question_id, boolean isCorrect){
        SQL.startConnection();
        SQL.execute("insert into correct_answers(Player_ID,Question_ID,isCorrect) values('" + player_id + "','" + question_id + "','" + ((isCorrect)? '1': '0') + "')");
        SQL.endConnection();
    }
    
    public String getName() {
        return name;
    }
    
    public int getCorrectAnswers() {
        return CorrectAnswers;
    }
    
    public void AnsweredCorrectly(){
        this.CorrectAnswers ++;
    }
    
    public int getPlayer_id() {
        return player_id;
    }
}
