# Automatización Falabella

## Comenzando 🚀

_Estas instrucciones te permitirán ejecutar la automatización._

* _Realizar compra de articulo_

## Requisitos 🌎

* _JAVA 11+_
* _Gradle 8.1+_


## Ejecución de las Pruebas⛷️

Para la ejecución de la tarea debemos tener en cuenta el parámetro

* **projectName**: nombre del proyecto
* **buildName**: nombre del release o build

### Ejecución en Paralelo de las Pruebas

```
gradle clean clearReports test 

```

### Ejecución del set de Prueba de Onboarding Express

```
gradle clean clearReports test --tests *BuyProductTest*  -i

```

## Construido con 🏗️

_Herramientas utilizadas para crear el proyecto_

* [Gradle](https://gradle.org/) - Gradle es una herramienta de automatización de construcción de código abierto
  que está diseñada para ser lo suficientemente flexible como para construir casi cualquier tipo de software.

* [Serenity-BDD](https://serenity-bdd.github.io/) - Es una librería de código abierto que ayuda a escribir pruebas de
  aceptación automatizadas de mayor calidad y más rápido. Sus principales características son: Escribir test flexibles y
  fáciles de mantener.

## Versionado 📌

Usamos [Git Hub](https://BancoPichinchaEC@dev.azure.com/BancoPichinchaEC/CD-BreakingCash/_git/deuna-aut-ap-android) para el versionado del proyecto.

## Contribuir 💪 
Si deseas contribuir a este proyecto, sigue estos pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con tu nueva funcionalidad.
3. Haz tus cambios y realiza un pull request.
