package co.com.cloudblue.stepdefinitions;


import co.com.cloudblue.tasks.LoginUserTask;
import co.com.cloudblue.tasks.OpenWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.pages.PageObject;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class LoginStepDefinitions {

    private PageObject page;

    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Dado("^el usuario accede a la pagina$")
    public void elUsuarioAccedeALaPagina() throws Exception {
        OnStage.theActorCalled("Jota").wasAbleTo(OpenWebDriver.on(page));
    }

    @Cuando("^el usuario ingresa su usuario (.*) y contraseña (.*)$")
    public void elUsuarioIngresaSuUsuarioYContraseña(String strUser, String strPassword) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginUserTask.onThePage(strUser, strPassword));

    }

}
