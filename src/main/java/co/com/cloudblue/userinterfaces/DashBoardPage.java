package co.com.cloudblue.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashBoardPage {

    public static final Target BUTTON_WAFLE = Target.the("Buton menu")
            .locatedBy("//one-app-launcher-header/button[1]");
    public static final Target BUTTON_OPTIONS = Target.the("lista desplegable")
            .locatedBy("//p[contains(text(),'{0}')]");
    public static final Target TXT_QUARTERLY = Target.the("IMPUT Quarterly Performance")
           .locatedBy("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/span[1]");
   public static final Target TXT_TODAY = Target.the("IMPUT TODAY EVENST")
            .locatedBy("/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/article[1]/div[1]/header[1]/div[1]/h2[1]/span[1]");
    public static final Target TXT_TODAYTASK = Target.the("IMPUT TODAY TASK")
            .locatedBy("//span[contains(text(),'Today’s Tasks')]");
    public static final Target TXT_RECENT = Target.the("IMPUT Recent Records")
            .locatedBy("//span[contains(text(),'Recent Records')]");



}
