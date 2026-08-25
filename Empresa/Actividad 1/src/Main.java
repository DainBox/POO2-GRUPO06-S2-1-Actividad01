public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Juan", 5000);
        Empleado desarrollador = new Desarrollador("Ana", 3000);
        Empleado practicante = new Practicante("Luis", 1000);

        SistemaGestionEmpleados sistema = new SistemaGestionEmpleados(
            new EmpleadoRepository(),
            new ReporteService()
        );

        sistema.procesarEmpleado(gerente);
        sistema.procesarEmpleado(desarrollador);
        sistema.procesarEmpleado(practicante);
    }
}
