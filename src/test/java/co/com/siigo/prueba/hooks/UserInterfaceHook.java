package co.com.siigo.prueba.hooks;

import co.com.siigo.prueba.utils.KeyToRemember;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserInterfaceHook {

    private final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    private final String siigoUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("siigo.url");

    private final String email = EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("siigo.email");

    private final String password = EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("siigo.password");

    private final String reqresUrl = EnvironmentSpecificConfiguration.from(environmentVariables)
            .getProperty("reqres.url");

    //region Siigo
    @Before("@FeatureName:CreateClients")
    public void setupSiigoEnvironmentVariables() {
        theActorInTheSpotlight().remember(KeyToRemember.URL.name(), siigoUrl);
        theActorInTheSpotlight().remember(KeyToRemember.EMAIL.name(), email);
        theActorInTheSpotlight().remember(KeyToRemember.PASSWORD.name(), password);
    }

    @After("@Logout")
    public void logout() {

    }
    //endregion Siigo

    //region Reqres
    @Before("@FeatureName:UsersService")
    public void setupReqresEnvironmentVariables() {
        theActorInTheSpotlight().remember(KeyToRemember.URL.name(), reqresUrl);
    }
    //endregion Reqres
}