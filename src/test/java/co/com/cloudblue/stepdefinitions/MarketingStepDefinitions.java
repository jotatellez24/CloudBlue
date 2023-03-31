package co.com.cloudblue.stepdefinitions;

import co.com.cloudblue.questions.NameQuestions;
import co.com.cloudblue.questions.QuarterlyPerformanceQuestions;
import co.com.cloudblue.questions.ValidateEmail;
import co.com.cloudblue.questions.ValidatePhone;
import co.com.cloudblue.tasks.MarketingTask;
import co.com.cloudblue.tasks.ServiceTask;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class MarketingStepDefinitions {
    @Entonces("^Debo visualizar la lista de contactos creados$")
    public void deboVisualizarLaListaDeContactosCreados() throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(MarketingTask.ThePageOn());
    }


    @Y("^Valido que exista el usuario (.*),(.*),(.*)$")
    public void validoQueExitaElUsuarioAndyYoungA_youngDickensonCom(String Nombre,String Telefono,String Correo) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NameQuestions.compare(), Matchers.is(Nombre)));
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePhone.compare(), Matchers.is(Telefono)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateEmail.compare(), Matchers.is(Correo)));
    }
}
