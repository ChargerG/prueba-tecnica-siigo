package co.com.siigo.prueba.userInterfaces;


import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class LoginPage {
    public static final Target EMAIL = Target
            .the("campo para ingresar email")
            .located(cssSelector("input-atom[input-id='username-input']"));

    public static final Target PASSWORD = Target
            .the("campo para ingresar password")
            .located(cssSelector("input-atom[input-id='password-input']"));

    public static final Target LOGIN_BUTTON = Target
            .the("boton para iniciar sesion")
            .located(cssSelector("button#login-submit"));
}
