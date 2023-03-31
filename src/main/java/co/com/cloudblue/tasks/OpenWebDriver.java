package co.com.cloudblue.tasks;

import co.com.cloudblue.userinterfaces.OpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenWebDriver implements Task {

    OpenUpPage page;

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Open.browserOn(page));

    }

    public static OpenWebDriver on(net.thucydides.core.pages.PageObject page) {
        return Tasks.instrumented(OpenWebDriver.class, page);
    }
}
