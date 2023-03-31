package co.com.cloudblue.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USUARIO = Target.the("Campo Usuario")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_CONTRASENIA = Target.the("Campo Contraseña")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_CONTINUAR = Target.the("Botón CONTINUAR")
            .locatedBy("//input[@id='Login']");

}
