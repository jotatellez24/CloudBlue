package co.com.cloudblue.stepdefinitions;

import co.com.cloudblue.questions.*;
import co.com.cloudblue.tasks.ServiceTask;
import co.com.cloudblue.userinterfaces.DashBoardPage;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import org.hamcrest.Matchers;

import javax.swing.*;

public class ServiceStepDefinitions {
    @Y("^estoy en la app deseo Seleccionar el menu (.*)$")
    public void queEstoyEnLaAppDeseoSeleccionarElMenuService(String Menu) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(ServiceTask.ThePageOn(Menu));
    }

    @Entonces("^Deseo validar los tableros en el dashBoard$")
    public void deseoValidarLosTablerosEnElDashBoard() throws Exception {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(QuarterlyPerformanceQuestions.compare(), Matchers.is("Quarterly Performance")));
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TodaysEventsQuestions.compare(), Matchers.is("Today's Events")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TodaysTasksQuestions.compare(), Matchers.is("Today’s Tasks")));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RecentRecordsQuestions.compare(), Matchers.is("Recent Records")));

    }



}
