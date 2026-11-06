# Mundo Animal 🐾

## Descripción
Proyecto individual desarrollado en Java que simula un sistema de información de animales, su sonido y su forma de desplazarse. El objetivo principal es poner en práctica los pilares de la Programación Orientada a Objetos (POO).

## Estructura del Proyecto
El código está organizado dentro del paquete `mx.com.animales` con la siguiente estructura de clases:
* `Animal.java` (Clase base abstracta)
* `Movible.java` (Interfaz de comportamiento)
* `Perro.java`, `Gato.java`, `Vaca.java` (Clases hijas que heredan de Animal e implementan Movible)
* `Main.java` (Clase principal para ejecutar el flujo polimórfico)

## Ejemplo de Salida Esperada
Nombre: Nina | Edad: 3 | Sonido: Guau | Movimiento: Corre
Nombre: Ricalde | Edad: 2 | Sonido: Miau | Movimiento: Camina
Nombre: Lola | Edad: 5 | Sonido: Muuu | Movimiento: Camina

## Preguntas de Reflexión

### 1. ¿Qué se reutiliza al heredar de Animal?
Se reutilizan los atributos de estado compartidos por todos los animales (`nombre` y `edad`), junto con el método concreto `mostrarInformacion()`. Esto evita la duplicación de código en las clases hijas.

### 2. ¿Qué hace super(nombre, edad)?
Invoca al constructor de la clase abstracta padre (`Animal`) desde las clases hijas para inicializar correctamente los atributos privados heredados, respetando el principio de encapsulamiento.

### 3. ¿Para qué sirve @Override?
Es una anotación de buena práctica que le indica al compilador que estamos sobrescribiendo intencionalmente un método de una clase superior o interfaz, ayudando a detectar errores de tipografía en tiempo de compilación.

### 4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?
Debido al polimorfismo dinámico. Java determina en tiempo de ejecución cuál es el tipo real del objeto instanciado (`Perro`, `Gato` o `Vaca`) y ejecuta la implementación específica del método correspondiente.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?
* Una **clase abstracta** define una relación de identidad ("es un") y permite heredar tanto estados (atributos) como métodos obligatorios u opcionales, estando limitada a la herencia simple.
* Una **interfaz** define un contrato de comportamiento ("puede hacer") enfocado en acciones puras. No almacena estados de instancia y una clase puede implementar múltiples interfaces a la vez.
