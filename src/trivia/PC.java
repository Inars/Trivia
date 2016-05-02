package trivia;

public class PC {
    private static int CorrectAnswers = 0;
    
    public void AnsweredCorrectly(){
        CorrectAnswers ++;
    }
    
    public int getCorrectAnswers(){
        return CorrectAnswers;
    }
}
