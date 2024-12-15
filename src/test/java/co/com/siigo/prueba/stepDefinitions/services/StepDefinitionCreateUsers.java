package co.com.siigo.prueba.stepDefinitions.services;

import co.com.siigo.prueba.tasks.services.CreateNew;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionCreateUsers {

    @Dado("que tengo la API disponible en {businessParameter}")
    public void queTengoLaAPIDisponibleEn(String endpoint) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(theActorInTheSpotlight().recall(endpoint)));
    }

    @Cuando("realizo una solicitud POST a {businessParameter} con el siguiente cuerpo: {businessParameter}")
    public void realizoUnaSolicitudPOSTAConElSiguienteCuerpoNameMorpheusJobLeader(String resource, String jsonResponse) {
        CreateNew.user(resource, jsonResponse).performAs(theActorInTheSpotlight());
    }

    @Entonces("la respuesta tiene un código de estado {businessParameter}")
    public void laRespuestaTieneUnCódigoDeEstado(int statusCode) {

    }

    @Y("el cuerpo de la respuesta contiene los campos {businessParameter}, {businessParameter}, {businessParameter} y {businessParameter}")
    public void elCuerpoDeLaRespuestaContieneLosCamposY(String name, String job, String createdAt, String id) {

    }

    @Y("el campo {businessParameter} tiene el valor {businessParameter}")
    public void elCampoTieneElValor(String field, String value) {
    }
}
