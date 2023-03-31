package co.com.cloudblue.questions;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RecentRecordsQuestions implements Question<String>  {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(DashBoardPage.TXT_RECENT).viewedBy(actor).asString();

    }
    public static RecentRecordsQuestions compare(){;
        return new RecentRecordsQuestions();
    }
}
