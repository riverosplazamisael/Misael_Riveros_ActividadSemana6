# Llanquihue Tour App - Semana 7

## Descripción del Proyecto
Aplicación desarrollada en Java orientada a objetos para la gestión dinámica de los servicios turísticos de la agencia "Llanquihue Tour". En esta etapa se integró el concepto de **polimorfismo** y el uso de **colecciones dinámicas** para optimizar el recorrido y la escalabilidad del sistema.

## Cambios Implementados (Semana 7)
* **Colecciones Polimórficas**: Se reemplazó el almacenamiento estático por una estructura dinámica `List<ServicioTuristico>` implementada mediante `ArrayList` dentro de la clase `GestorServicios`.
* **Método mostrarInformacion()**: Se implementó y sobrescribió este método en la jerarquía de clases para desplegar los atributos específicos de cada servicio en consola de forma dinámica.
* **Recorrido Dinámico**: Se configuró un bucle `for-each` en la clase `Main` que demuestra el polimorfismo puro, eliminando la necesidad de utilizar condicionales de tipo o la instrucción `instanceof`.

## Instrucciones de Ejecución
1. Clonar el repositorio.
2. Compilar el proyecto desde la raíz.
3. Ejecutar la clase `Main.java` ubicada en el paquete `ui`.
