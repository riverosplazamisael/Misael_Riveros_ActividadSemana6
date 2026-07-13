# Llanquihue Tour

Aplicacion de escritorio desarrollada en Java para registrar y mostrar entidades relacionadas con una agencia turistica llamada **Llanquihue Tour**. El proyecto aplica conceptos de programacion orientada a objetos como clases, herencia, interfaces, polimorfismo y colecciones dinamicas.

## Funcionalidades

- Registro de guias turisticos, vehiculos y colaboradores externos desde una interfaz grafica.
- Validacion de campos obligatorios antes de guardar una entidad.
- Visualizacion de las entidades registradas en una lista dentro de la ventana.
- Carga inicial de servicios turisticos y entidades de ejemplo.
- Recorrido polimorfico de servicios turisticos mediante una coleccion dinamica.

## Tecnologias utilizadas

- Java
- Swing
- Maven
- Programacion orientada a objetos

## Estructura del proyecto

```text
src/
+-- data/
|   +-- GestorServicios.java
+-- gui/
|   +-- Ventanatour.java
+-- interfaces/
|   +-- Registrable.java
+-- model/
|   +-- ColaboradorExterno.java
|   +-- ExcursionCultural.java
|   +-- GuiaTuristico.java
|   +-- PaseoLacustre.java
|   +-- RutaGastronomica.java
|   +-- ServicioTuristico.java
|   +-- Vehiculo.java
+-- ui/
    +-- Main.java
```

## Clases principales

### `Ventanatour`

Clase ubicada en el paquete `gui`. Extiende de `JFrame` y construye la ventana principal de la aplicacion. Permite seleccionar el tipo de entidad, ingresar sus datos y guardarlos en memoria.

Entidades que permite registrar:

- Guia Turistico: nombre y especialidad.
- Vehiculo: patente y tipo.
- Colaborador Externo: nombre y rol.

### `GestorServicios`

Clase ubicada en el paquete `data`. Administra las colecciones del sistema:

- `List<ServicioTuristico>` para servicios turisticos.
- `List<Registrable>` para entidades registrables.

Tambien carga datos iniciales para demostrar el funcionamiento del sistema.

### `Registrable`

Interfaz ubicada en el paquete `interfaces`. Define el metodo `mostrarResumen()`, implementado por las clases que pueden registrarse en el sistema.

### `ServicioTuristico`

Clase base para los servicios turisticos. De ella heredan:

- `RutaGastronomica`
- `PaseoLacustre`
- `ExcursionCultural`

Cada clase hija sobrescribe `mostrarInformacion()` para mostrar sus propios datos.

## Conceptos de POO aplicados

- **Encapsulamiento:** los atributos de las clases se mantienen privados y se accede a ellos mediante metodos.
- **Herencia:** las clases de servicios turisticos heredan de `ServicioTuristico`.
- **Polimorfismo:** se recorren servicios mediante referencias de tipo `ServicioTuristico`.
- **Interfaces:** `GuiaTuristico`, `Vehiculo` y `ColaboradorExterno` implementan `Registrable`.
- **Colecciones dinamicas:** se utilizan listas `ArrayList` para almacenar servicios y entidades.

## Como ejecutar el proyecto

### Opcion 1: desde IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el SDK de Java este configurado.
3. Ejecutar la clase `Main.java`, ubicada en `src/ui/Main.java`.

### Opcion 2: desde terminal

Compilar:

```bash
javac -encoding UTF-8 -d target/classes src/interfaces/*.java src/model/*.java src/data/*.java src/gui/*.java src/ui/*.java
```

Ejecutar:

```bash
java -cp target/classes ui.Main
```

## Uso de la aplicacion

1. Seleccionar el tipo de entidad en el menu desplegable.
2. Ingresar el nombre o patente.
3. Ingresar la especialidad, tipo o rol.
4. Presionar **Guardar**.
5. Revisar el listado de entidades en el area central de la ventana.
6. Usar **Limpiar** para borrar los campos del formulario.

## Autor

Proyecto academico desarrollado para la asignatura de Desarrollo Orientado a Objetos.
