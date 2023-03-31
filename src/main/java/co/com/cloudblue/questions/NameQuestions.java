package co.com.cloudblue.questions;

import co.com.cloudblue.userinterfaces.MarketingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class NameQuestions implements Question {
    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(MarketingPage.INPUT_NAME).viewedBy(actor).asString();


    }


    public static NameQuestions compare() {

        return new NameQuestions();
    }
}
