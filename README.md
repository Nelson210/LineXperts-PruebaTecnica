# Prueba Técnica
Este repositorio contiene la solución a los dos objetivos planteados en la prueba técnica.

## Requisitos

- Java 11 o superior
- Maven 3.6.3 o superior
- Clonar el repositorio y entrar en la carpeta del repositorio:

   ```sh
   git clone https://github.com/Nelson210/LineXperts-PruebaTecnica.git
   cd LineXperts-PruebaTecnica
  
## Objetivo de la Prueba Técnica 1:

Este proyecto demuestra cómo consumir una API externa utilizando Spring Boot. Incluye configuración de RestTemplate, manejo global de excepciones y pruebas unitarias con JUnit 5 y Mockito.

# Configuración del Proyecto
1. Abre una terminal y cambia a la rama que contiene el objetivo 1:
   ```sh
   git fetch origin
   git checkout -b objetivo1 origin/objetivo1

2. Abre el proyecto en un IDE, limpia y compila el proyecto.

3. Para ejecutar el proyecto, corre el archivo LinexpertsAppApplication.java desde el IDE o desde una terminal con el siguiente comando:
   ```sh
   mvn spring-boot:run

4. Desde Postman o cualquier otra herramienta, realiza la siguiente petición:
   ```sh
   GET http://localhost:8080/users

5. Para ejecutar las pruebas unitarias, utiliza el siguiente comando en la terminal:
   ```sh
   mvn test

6.  Para ver los resultados de las pruebas unitarias, navega a:
    ```sh
    target/surefire-reports

## Objetivo de la Prueba Técnica 2:

Este proyecto demuestra cómo verificar si un texto es un palíndromo, cuántos caracteres tiene y si contiene caracteres especiales.

# Configuración del Proyecto
1. Abre una terminal y cambia a la rama que contiene el objetivo 2:
   ```sh
   git fetch origin
   git checkout -b objetivo2 origin/objetivo2

2. Abre el proyecto en un IDE, limpia y compila el proyecto.

3. Para ejecutar el proyecto, corre el archivo LinexpertsAppApplication.java desde el IDE o desde una terminal con el siguiente comando:
   ```sh
   mvn spring-boot:run

4. Desde Postman o cualquier otra herramienta, realiza la siguiente petición (el cuerpo debe estar en formato JSON):
   ```sh
   POST http://localhost:8080/api/verificarPalindromo
   {
      "palindromo" : "anita lava la tina"
   }
