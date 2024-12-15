package co.com.siigo.prueba.tasks.ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Logout implements Task {

    public static Logout siigo(){
        return new Logout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
