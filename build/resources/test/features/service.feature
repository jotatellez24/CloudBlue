#language: es
Característica:Historia de Usuario

  Antecedentes:Ingresar al Login de la pagina salesforce
    Dado el usuario accede a la pagina
    Cuando el usuario ingresa su usuario test.qa.cloudblue@gmail.com y contraseña T3stQ4CB2023

  @HistoriaUno
  Escenario: Despues de ingresar correctamente a la app
    Y estoy en la app deseo Seleccionar el menu Service
    Entonces Deseo validar los tableros en el dashBoard

  @HistoriaDos
  Esquema del escenario: Escenario: Despues de ingresar correctamente a la app
    Y estoy en la app deseo Seleccionar el menu Marketing
    Entonces Debo visualizar la lista de contactos creados
    Y Valido que exista el usuario <Nombre>,<Telefono>,<Correo>
    Ejemplos:
      | Nombre     | Telefono       | Correo                |
      | Andy Young | (785) 241-6200 | a_young@dickenson.com |







