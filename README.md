# Java-Interfaces
Ejercicios de Interfaces con Java

Este ejercicio intente demostrar la forma en la cual las interfaces de java ayudan a que un objeto tenga más de una forma y pueda ser reutilizado el código.

Tenemos la intefaz de figurGeometrica: `figuraGeometrica` que es implementada por las clases:

- `Cuadrado`
- `Rectangulo`
- `Rombo`
- `Romboide`
- `Trapecio`
- `Triangulo`

La interfaz permite reutilizar una función para diferentes objetos, esto implica que cada objeto debe tener implementadas métodos específicos:

| Tipo de dato | Nombre             | Parametros  | Características  |
|:------------:|:------------------:|:-----------:|:-----------:|
| String       | getNombre          | n/a         |Devuelve el nombre del objeto|
| double       | calcularArea       | n/a         |Área basada en las propiedades|
| double       | calcularPerimetro  | n/a         |Perímetro basado en las propiedades|

Las interfaces no son una clase, son un mecánismo de Java para reutilizar métodos, es decir, implementar una interfaz significa que la clase que la implementa cuenta con los métodos requeridos (está obligada) por el bloque de código que se busca reutilizar, lo que permite que dicho bloque  funcione correctamente.

El archivo main.java continene instancias de objetos de distintas clases que implementan la interfaz `figuraGeometrica`, de la misma manera que el método definido recibe objetos del tipo de la interfaz.

![yupi](https://i.pinimg.com/736x/a6/df/03/a6df03afd8d7c4037afe3436e752c1da.jpg)