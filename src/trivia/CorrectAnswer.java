package trivia;

public class CorrectAnswer {
    private String text;
    private String value;
    
    public CorrectAnswer(String text, String value){
        this.text = text;
        this.value = value;
    }
    
    public int getQuestionID(){
        try{
            SQL.startConnection();
            java.sql.ResultSet rs = SQL.select("select Question_ID from view_cqa where Answer_ID = '" + value + "'");
            if(rs.next()){
                return rs.getInt("Question_ID");
            }
            SQL.endConnection();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
