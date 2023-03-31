package co.com.cloudblue.questions;

import co.com.cloudblue.userinterfaces.MarketingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateEmail implements Question {
    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(MarketingPage.INPUT_EMAIL).viewedBy(actor).asString();


    }


    public static ValidateEmail compare() {

        return new ValidateEmail();
    }
}
