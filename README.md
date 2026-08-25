# POOII-GRUPO06-S2-1-Actividad1

# Actividad 1: Identificación y Corrección de Infracciones a los Principios SOLID

### Integrantes
- *CAJA CORRALES, DAIN JAIR(DainBox)*
- *RETES GUTIERREZ, PIERO FERNANDO (Pieroretes27)*
- *SOSA TACO, CELINA OLENKA (Olenkasosa)*
- *YURIVILCA LAUREANO, STEFFI IRENE (IreYuri)*

## Objetivo: El objetivo de esta actividad es que los estudiantes analicen un código fuente que infringe los principios SOLID, identifiquen las violaciones y propongan soluciones para corregirlas aplicando los principios de SOLID.
## Problema: Un sistema de gestión de empleados en una empresa tiene varias violaciones de los principios SOLID.
## Código Fuente:

<img width="714" height="580" alt="WhatsApp Image 2026-08-24 at 10 33 00 AM" src="https://github.com/user-attachments/assets/98427394-dd47-41cc-8ac4-1cd5e836a6b5" />

<img width="698" height="594" alt="WhatsApp Image 2026-08-24 at 10 34 01 AM" src="https://github.com/user-attachments/assets/d6c065c0-687e-41ba-8a5e-53badb1925c4" />


## Instrucciones:
1.	*Identificar las violaciones de los principios SOLID.*

_Respuesta:_

Al revisar el código fuente podemos encontrar varias partes que no cumplen correctamente con los principios SOLID.
-	La clase Empleado se encarga de demasiadas cosas. No solo contiene los datos del empleado y calcula su pago, sino que también guarda información en la base de datos y genera reportes. Lo ideal sería separar estas funciones en diferentes clases para que cada una tenga una responsabilidad específica.
-	En el método calcularPago() se utilizan varios if-else para determinar cuánto debe recibir cada tipo de empleado. El problema aparece cuando queremos agregar un nuevo tipo de empleado, ya que tendríamos que modificar este método. Esto hace que el código sea menos flexible.
-	El código no está diseñado para trabajar con diferentes tipos de empleados mediante una estructura común. En lugar de eso, utiliza un atributo de tipo String para saber si el empleado es gerente, desarrollador o practicante. Esto dificulta que el sistema pueda trabajar con diferentes comportamientos de manera más organizada.


2.	*Proponer soluciones para corregir las violaciones.*

_Respuesta:_

Para mejorar el código, primero debemos separar las diferentes responsabilidades que actualmente están dentro de la clase Empleado. Esta clase debería encargarse únicamente de almacenar la información básica del empleado, como su nombre y salario.

Para solucionar el problema del cálculo de pagos, podemos crear una interfaz llamada CalculadorPago y luego crear una clase diferente para cada tipo de empleado, como PagoGerente, PagoDesarrollador y PagoPracticante. De esta forma, si en el futuro aparece un nuevo tipo de empleado, simplemente podemos crear una nueva clase sin tener que modificar el código que ya existe.

También podemos crear interfaces separadas para las otras funciones, por ejemplo, RepositorioEmpleado para guardar los empleados y ReporteEmpleado para generar sus reportes. De esta manera, cada clase o interfaz se encargará de una tarea específica.

Finalmente, SistemaGestionEmpleados trabajará con estas interfaces en lugar de depender directamente de una implementación determinada. Esto permite que el sistema sea más flexible y facilita realizar cambios en el futuro, por ejemplo, cambiar la forma de guardar los empleados o generar los reportes sin modificar toda la lógica del sistema.

3. *Implementar las soluciones en el código.*
   
5. *Finalmente, subir este ejercicio a su repositorio GitHub con el siguiente nombre POOIIGRUPOX-S2-2, este repositorio debe ser público. Enviar el repositorio de esta primera a actividad.*






