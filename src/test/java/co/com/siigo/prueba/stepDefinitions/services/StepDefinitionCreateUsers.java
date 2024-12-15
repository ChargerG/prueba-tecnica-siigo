package co.com.siigo.prueba.stepDefinitions.services;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class StepDefinitionCreateUsers {

    @Dado("que tengo la API disponible en {businessParameter}")
    public void queTengoLaAPIDisponibleEn(String endpoint) {
    }

    @Cuando("realizo una solicitud POST a {businessParameter} con el siguiente cuerpo: {businessParameter}")
    public void realizoUnaSolicitudPOSTAConElSiguienteCuerpoNameMorpheusJobLeader(String resource, String jsonResponse) {

    }

    @Entonces("la respuesta tiene un código de estado {businessParameter}")
    public void laRespuestaTieneUnCódigoDeEstado(int statusCode) {

    }

    @Y("el cuerpo de la respuesta contiene los campos {businessParameter}, {businessParameter}, {businessParameter} y {businessParameter}")
    public void elCuerpoDeLaRespuestaContieneLosCamposY(String arg0, String arg1, String arg2, String arg3) {

    }

    @Y("el campo {businessParameter} tiene el valor {businessParameter}")
    public void elCampoTieneElValor(String field, String value) {
    }
}
