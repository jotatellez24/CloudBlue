package co.com.cloudblue.tasks;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import co.com.cloudblue.userinterfaces.LoginPage;
import co.com.cloudblue.utils.Esperas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class LoginUserTask implements Task {
    private String strUser;
    private String strPassword;

    public LoginUserTask(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static LoginUserTask onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(LoginUserTask.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(Enter.theValue(strUser).into(LoginPage.TXT_USUARIO));
        actor.wasAbleTo(Enter.theValue(strPassword).into(LoginPage.TXT_CONTRASENIA), Click.on(LoginPage.BTN_CONTINUAR));
 Esperas.esperarHasta(6, "segundos");



    }
}
