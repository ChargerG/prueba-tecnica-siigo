package co.com.siigo.prueba.tasks.ui.siigo;

import co.com.siigo.prueba.interactions.ui.siigo.SiigoUser;
import co.com.siigo.prueba.tasks.ui.NavigateTo;
import co.com.siigo.prueba.userInterfaces.LoginPage;
import co.com.siigo.prueba.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login implements Task {
    private final String email;
    private final String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Login siigo(String email, String password) {
        return new Login(email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavigateTo.url(actor.recall(KeyToRemember.URL.name())),
                SiigoUser.clickOnElement(LoginPage.EMAIL),
                SiigoUser.enterEmail(email),
                SiigoUser.clickOnElement(LoginPage.PASSWORD),
                SiigoUser.enterPassword(password),
                SiigoUser.clickOnLoginButton()
        );
    }
}
