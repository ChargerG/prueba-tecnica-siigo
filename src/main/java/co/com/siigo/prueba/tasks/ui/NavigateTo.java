package co.com.siigo.prueba.tasks.ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {
    private final String url;

    public NavigateTo(String url) {
        this.url = url;
    }

    public static NavigateTo url(String url) {
        return new NavigateTo(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.url(url).performAs(actor);
    }
}
