# language: es
@FeatureName:CreateUsers

Característica: Crear, actualizar, y eliminar informacion de un usuario

  Escenario: Crear un usuario
    Dado que tengo la API disponible en "https://reqres.in/api"
    Cuando realizo una solicitud POST a "/users" con el siguiente cuerpo: "{ "name": "morpheus", "job": "leader" }"
    Entonces la respuesta tiene un código de estado 201
    Y el cuerpo de la respuesta contiene los campos "name", "job", "createdAt" y "id"
    Y el campo "name" tiene el valor "morpheus"
    Y el campo "job" tiene el valor "leader"