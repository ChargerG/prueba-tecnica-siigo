package co.com.siigo.prueba.stepDefinitions.services;

import co.com.siigo.prueba.questions.services.reqres.ResponseContains;
import co.com.siigo.prueba.questions.services.reqres.ResponseContainsExpected;
import co.com.siigo.prueba.questions.services.reqres.StatusCodeIs;
import co.com.siigo.prueba.questions.ui.reqres.StatusCodeIsVisible;
import co.com.siigo.prueba.tasks.services.reqres.CreateNew;
import co.com.siigo.prueba.tasks.services.reqres.UpdateUser;
import co.com.siigo.prueba.tasks.ui.NavigateTo;
import co.com.siigo.prueba.tasks.ui.reqres.ConsumePut;
import co.com.siigo.prueba.utils.KeyToRemember;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class StepDefinitionCreateUsers {

    @Dado("que tengo la API disponible en {businessParameter}")
    public void queTengoLaAPIDisponibleEn(String endpoint) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(endpoint));
    }

    @Cuando("realizo una solicitud POST a {businessParameter} con el siguiente cuerpo: {businessParameter}")
    public void realizoUnaSolicitudPOSTAConElSiguienteCuerpoNameMorpheusJobLeader(String resource, String body) {
        CreateNew.user(resource, body).performAs(theActorInTheSpotlight());
    }

    @Entonces("la respuesta tiene un codigo de estado {businessParameter}")
    public void laRespuestaTieneUnCodigoDeEstado(String statusCode) {
        theActorInTheSpotlight().should(
                seeThat("El codigo de repsuesta es " + statusCode,
                        StatusCodeIs.success(), equalTo(Integer.valueOf(statusCode)))
        );
    }

    @Y("el cuerpo de la respuesta contiene los campos {businessParameter}, {businessParameter}, {businessParameter} y {businessParameter}")
    public void elCuerpoDeLaRespuestaContieneLosCamposY(String name, String job, String createdAt, String id) {
        List.of(name, job, createdAt, id).forEach(field ->
                theActorInTheSpotlight().should(
                        seeThat("el campo " + field + " esta en la respuesta",
                                ResponseContains.theFields(), hasKey(field))
                )
        );
    }

    @Y("el campo name contiene el valor {businessParameter}, y el campo job contiene el valor {businessParameter}")
    public void elCampoNameContieneElValorNameYElCampoJobContieneElValorJob(String nameValue, String jobValue) {
        theActorInTheSpotlight().should(
                seeThat("el campo name de la respuesta contiene el valor " + nameValue,
                        ResponseContainsExpected.values("name"), equalTo(nameValue)),

                seeThat("el campo job de la respuesta contiene el valor " + jobValue,
                        ResponseContainsExpected.values("job"), equalTo(jobValue))
        );
    }

    @Dado("que estoy en Reqres")
    public void queEstoyEnReqres() {
        NavigateTo.url(theActorInTheSpotlight().recall(KeyToRemember.URL.name())).performAs(theActorInTheSpotlight());
    }

    @Cuando("consumo la peticion PUT para actualizar un usuario")
    public void consumoLaPeticionPUTParaActualizarUnUsuario() {
        ConsumePut.consumePut().performAs(theActorInTheSpotlight());
    }

    @Entonces("se visualiza status code 200")
    public void seVisualizaStatusCode() {
        theActorInTheSpotlight().should(
                seeThat("El codigo 200 es visible en la respuesta",
                        StatusCodeIsVisible.forUser(), equalTo(Boolean.TRUE))
        );
    }

    @Pero("si consumo la API directamente con los datos que se visualizan en el request")
    public void siConsumoLaAPIDirectamenteConLosDatosQueSeVisualizanEnElRequest() {
        theActorInTheSpotlight().whoCan(CallAnApi.at("https://reqres.in/api"));
        UpdateUser.information("/users/2").performAs(theActorInTheSpotlight());
    }

    @Entonces("la respuesta es la misma")
    public void laRespuestaEsLaMisma() {
        theActorInTheSpotlight().should(
                seeThat("El status code que devuelve la API es igual al obtenido de Reqres",
                        StatusCodeIs.success(), equalTo(theActorInTheSpotlight().recall(KeyToRemember.STATUS_CODE.name()))
                )
        );
    }
}
