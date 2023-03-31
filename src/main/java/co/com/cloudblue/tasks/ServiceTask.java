package co.com.cloudblue.tasks;

import co.com.cloudblue.userinterfaces.DashBoardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import javax.swing.*;

public class ServiceTask implements Task {

     public ServiceTask(String strMenu) {
          this.strMenu = strMenu;
     }

     private String strMenu;
     @Override
     public <T extends Actor> void performAs(T actor) {
          actor.wasAbleTo(Click.on(DashBoardPage.BUTTON_WAFLE),

                  Click.on(DashBoardPage.BUTTON_OPTIONS.of(strMenu)));

     }
     public static ServiceTask ThePageOn(String StrMenu) {

          return Tasks.instrumented(ServiceTask.class,StrMenu);
     }

}
