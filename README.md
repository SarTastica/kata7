Kata 7: Despliegue Nativo
> **El reto:** *Crear un instalador profesional.*

El paso final: Distribución. Usamos **Maven Shade Plugin** para crear un "Fat JAR" con todas las dependencias y la herramienta **`jpackage`** para generar un `.exe` nativo.
* La aplicación incluye su propio **Java Runtime (JRE)** reducido.
* Incluye icono personalizado y gestión de recursos externos.
* **Resultado:** Un software instalable que funciona en cualquier PC sin requisitos previos.
