# Proyecto 2 - Lenguajes y Máquinas

Este repositorio contiene un programa GOLD que compila un par Codificador-Decodificador. Ambos corresponden a Autómatas con Respuesta (Transducidores) que aceptan cadenas específicas.

El Codificador recibe una cadena sobre el alfabeto {a,b,c,d} separada en un número par de subcadenas de longitud 3 divididas por el símbolo '!' y finalizada con el símbolo '#'. A la salida, imprime una cadena en la cual las subcadenas pares que coincidan con la subcadena impar inmediatamente anterior son reemplazadas por el símbolo '*'. Las subcadenas pares no repetidas y las impares pasan sin modificación por el Codificador.

El Decodificador recibe la cadena salida del Codificador y realiza el proceso inverso. Es decir, retorna la cadena original a partir de una entrada que puede tener subcadenas pares como '*'. En ambos casos, los autómatas verifican la paridad de las subcadenas y la longitud 3 de cada una. En el caso del Decodificador, también se verifica que sólo subcadenas pares puedan ser '*' y que no haya inconsistencias respecto a la repetición en posiciones pares o la presencia de un asterisco en posiciones impares.

## Cómo Ejecutar

1. **Abrir el Programa en Eclipse Kepler**

   Se debe correr necesariamente sobre el programa Eclipse Kepler que contiene una versión del lenguaje GOLD 3.

2. **Correr Main.gold Sin Argumentos**

   Debido a la forma en que está programado el proyecto, al ejecutar el archivo Main.gold con la opción SIN ARGUMENTOS, se iniciarán el Codificador y el Decodificador por consola. Se puede ingresar una cadena de prueba y seleccionar la opción deseada para que se ejecute.

3. **Correr Coder.gold Sin Argumentos**

   Si se desea correr exclusivamente el Codificador, se deberá ejecutar Coder.gold SIN ARGUMENTOS.

4. **Correr Decoder.gold Sin Argumentos**

   Si se desea correr exclusivamente el Decodificador, se deberá ejecutar Decoder.gold SIN ARGUMENTOS.


## Acerca del Programa

Este programa tiene un alfabeto {a,b,c,d} base predefinido. Sin embargo, el Codificador también admite cualquier alfabeto que ingrese por parámetro cuando se corre CON ARGUMENTOS.

## Autores

Carol Florido - 202111430
Nicolás Rincón - 202021963