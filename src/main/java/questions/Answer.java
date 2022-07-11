package questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UTestLoginPage;

public class Answer implements Question {
    private String question;
    public Answer (String question){
        this.question=question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
    boolean result;
        String messageWelcome= Text.of(UTestLoginPage.MESSAGE_WELCOME).viewedBy(actor).asString();
        if(question.equals(messageWelcome)){
            result=true;
        }else{
            result=false;
        }

        return result;
    }
}
