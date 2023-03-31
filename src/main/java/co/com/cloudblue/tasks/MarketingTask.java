package co.com.cloudblue.tasks;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import co.com.cloudblue.userinterfaces.MarketingPage;
import co.com.cloudblue.utils.Esperas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MarketingTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Esperas.esperarHasta(6, "segundos");
        actor.wasAbleTo(Click.on(MarketingPage.TXT_CONTACT));
        Esperas.esperarHasta(6, "segundos");
        actor.wasAbleTo( Click.on(MarketingPage.BTN_ALLCONTACT));



    }
    public static MarketingTask ThePageOn() {

        return Tasks.instrumented(MarketingTask.class);
    }
}
