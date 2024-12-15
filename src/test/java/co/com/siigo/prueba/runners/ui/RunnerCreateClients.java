package co.com.siigo.prueba.runners.ui;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ui/CreateClients.feature",
        glue = {"co.com.siigo.prueba.stepDefinitions",
                "co.com.siigo.prueba.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@FeatureName:CreateClients"
)
public class RunnerCreateClients {
}
