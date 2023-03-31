package co.com.cloudblue.questions;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TodaysTasksQuestions implements Question<String>  {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DashBoardPage.TXT_TODAYTASK).viewedBy(actor).asString();

    }
    public static TodaysTasksQuestions compare(){;
        return new TodaysTasksQuestions();
    }
}
