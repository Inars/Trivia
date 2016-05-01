package trivia;

public class CorrectAnswer {
    private String text;
    private String value;
    
    public CorrectAnswer(String text, String value){
        this.text = text;
        this.value = value;
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
