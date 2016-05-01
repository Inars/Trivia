package trivia;

public class PC {
    private static int CorrectAnswers = 0;
    
    public void addCorrectAnswer(){
        CorrectAnswers ++;
    }
    
    public int getCorrectAnswers(){
        return CorrectAnswers;
    }
}
