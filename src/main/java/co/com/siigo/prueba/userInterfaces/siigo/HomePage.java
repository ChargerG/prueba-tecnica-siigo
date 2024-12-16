package co.com.siigo.prueba.userInterfaces.siigo;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

import static org.openqa.selenium.By.cssSelector;

public class HomePage {

    public static final Target CREATE_OPTION = Target
            .the("boton de crear")
            .located(ByShadow.cssSelector("siigo-button-atom[data-id='header-create-button']",
            "siigo-header-molecule[class*='data-siigo-five9']"));

    public static final Target CLIENT_OPTIONS = Target
            .the("opcion de clientes")
            .located(ByShadow.cssSelector("siigo-header-create-button-dropdown li [data-value='Clientes']",
                    "siigo-header-molecule[class*='data-siigo-five9']"));

    public static final Target BASIC_DATA_FORM = Target
            .the("formulario de datos basicos")
            .located(cssSelector("app-third-party-detail > div > div:nth-child(5) > div.is-6:nth-child(1)"));

    public static final Target BILLING_INFORMATION_FORM = Target
            .the("formulario de datos de facturacion y envio")
            .located(cssSelector("app-third-party-detail > div > div:nth-child(5) > div.is-6:nth-child(2)"));
}
