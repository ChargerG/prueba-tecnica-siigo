# language: es
@FeatureName:UsersService

Característica: Crear, actualizar un usuario y validar respuesta.

  Esquema del escenario: Crear un usuario con name: <name> y job: <job> consumiendo la API
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

  Escenario: Actualizar un usuario consumiendo la petición desde Reqres
    Dado que estoy en Reqres
    Cuando consumo la peticion PUT para actualizar un usuario
    Entonces se visualiza status code 200
    Pero si consumo la API directamente con los datos que se visualizan en el request
    Entonces la respuesta es la misma y los campos name y job no difieren de sus valores

