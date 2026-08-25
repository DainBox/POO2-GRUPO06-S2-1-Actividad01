Integrantes: 
. CAJA CORRALES, DAIN JAIR(DainBox)
. RETES GUTIERREZ, PIERO FERNANDO (Pieroretes27)
. SOSA TACO, CELINA OLENKA (Olenkasosa)
. YURIVILCA LAUREANO, STEFFI IRENE (IreYuri)

Actividad 1

Instrucciones:
1.	Identificar las violaciones de los principios SOLID.
Al revisar el código fuente podemos encontrar varias partes que no cumplen correctamente con los principios SOLID.
-	La clase Empleado se encarga de demasiadas cosas. No solo contiene los datos del empleado y calcula su pago, sino que también guarda información en la base de datos y genera reportes. Lo ideal sería separar estas funciones en diferentes clases para que cada una tenga una responsabilidad específica.
-	En el método calcularPago() se utilizan varios if-else para determinar cuánto debe recibir cada tipo de empleado. El problema aparece cuando queremos agregar un nuevo tipo de empleado, ya que tendríamos que modificar este método. Esto hace que el código sea menos flexible.
-	El código no está diseñado para trabajar con diferentes tipos de empleados mediante una estructura común. En lugar de eso, utiliza un atributo de tipo String para saber si el empleado es gerente, desarrollador o practicante. Esto dificulta que el sistema pueda trabajar con diferentes comportamientos de manera más organizada.


2.	Proponer soluciones para corregir las violaciones.
Para mejorar el código, primero debemos separar las diferentes responsabilidades que actualmente están dentro de la clase Empleado. Esta clase debería encargarse únicamente de almacenar la información básica del empleado, como su nombre y salario.

Para solucionar el problema del cálculo de pagos, podemos crear una interfaz llamada CalculadorPago y luego crear una clase diferente para cada tipo de empleado, como PagoGerente, PagoDesarrollador y PagoPracticante. De esta forma, si en el futuro aparece un nuevo tipo de empleado, simplemente podemos crear una nueva clase sin tener que modificar el código que ya existe.

También podemos crear interfaces separadas para las otras funciones, por ejemplo, RepositorioEmpleado para guardar los empleados y ReporteEmpleado para generar sus reportes. De esta manera, cada clase o interfaz se encargará de una tarea específica.

Finalmente, SistemaGestionEmpleados trabajará con estas interfaces en lugar de depender directamente de una implementación determinada. Esto permite que el sistema sea más flexible y facilita realizar cambios en el futuro, por ejemplo, cambiar la forma de guardar los empleados o generar los reportes sin modificar toda la lógica del sistema.

3.	Implementar las soluciones en el código.
