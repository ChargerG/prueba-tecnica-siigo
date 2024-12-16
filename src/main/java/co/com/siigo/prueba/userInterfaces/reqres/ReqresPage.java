package co.com.siigo.prueba.userInterfaces.reqres;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ReqresPage {

    public static final Target PUT_METHOD = Target
            .the("metodo PUT de la lista")
            .located(cssSelector("li[data-id='put']"));

    public static final Target BODY = Target
            .the("body con campos y valores")
            .located(cssSelector("pre[data-key='output-request']"));

    public static final Target STATUS_CODE = Target
            .the("codigo de la respuesta")
            .located(cssSelector("div.response p span"));
}
