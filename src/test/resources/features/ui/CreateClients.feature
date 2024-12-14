# language: es
@FeatureName:CreateClients

Característica: Crear clientes

  Antecedentes:
    Dado que Camilo ha iniciado sesion

  Escenario: Crear Cliente
    Cuando accede a la opcion de crear clientes
    Y diligencia los formularios
    Entonces crea un cliente exitosamente