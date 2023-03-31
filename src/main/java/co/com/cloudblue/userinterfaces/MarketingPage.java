package co.com.cloudblue.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MarketingPage {
    public static final Target TXT_CONTACT = Target.the("TXT INPUT")
            .locatedBy("//body/div[4]/div[1]/section[1]/div[1]/div[1]/one-appnav[1]/div[1]/one-app-nav-bar[1]/nav[1]/div[1]/one-app-nav-bar-item-root[5]/one-app-nav-bar-item-dropdown[1]/div[1]");

    public static final Target BTN_ALLCONTACT = Target.the("click the Contact button")
            .locatedBy("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[5]/one-app-nav-bar-item-dropdown/div/one-app-nav-bar-menu-button/div/div/slot/one-app-nav-bar-menu-item[2]");

    public static final Target INPUT_NAME = Target.the("input name")
            .locatedBy("//a[contains(text(),'Andy Young')]");

    public static final Target INPUT_PHONE = Target.the("input name")
            .locatedBy("//span[contains(text(),'(785) 241-6200')]");

    public static final Target INPUT_EMAIL = Target.the("input EMAIL")
            .locatedBy("//a[contains(text(),'a_young@dickenson.com')]");

}
