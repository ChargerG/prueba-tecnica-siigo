# language: es
@FeatureName:UsersService

Característica: Crear, actualizar, y eliminar informacion de un usuario

  Esquema del escenario: Crear un usuario con name: <name> y job: <job>
    Dado que tengo la API disponible en https://reqres.in/api
    Cuando realizo una solicitud POST a /users con el siguiente cuerpo: { "name": "<name>", "job": "<job>" }
    Entonces la respuesta tiene un codigo de estado 201
    Y el cuerpo de la respuesta contiene los campos name, job, createdAt y id
    Y el campo name contiene el valor <name>, y el campo job contiene el valor <job>

    Ejemplos:
      | name       | job                 |
      | morpheus   | leader              |
      | tigerman   | automation engineer |
      | lionman    | developer           |
      | leopardman | scrum master        |