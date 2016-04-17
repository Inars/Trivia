package trivia;

public class Player {
    private final String name;
    private int CorrectAnswers = 0;
    
    public Player(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void AnsweredCorrectly(){
        this.CorrectAnswers ++;
    }
}
