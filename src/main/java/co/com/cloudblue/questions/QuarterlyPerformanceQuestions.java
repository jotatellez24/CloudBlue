package co.com.cloudblue.questions;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import javax.swing.*;

public class QuarterlyPerformanceQuestions implements Question<String>  {
    @Override
    public String answeredBy(Actor actor) {

        return Text.of(DashBoardPage.TXT_QUARTERLY).viewedBy(actor).asString();

    }
    public static QuarterlyPerformanceQuestions compare(){;
        return new QuarterlyPerformanceQuestions();
    }
}
