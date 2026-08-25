public class SistemaGestionEmpleados {
    private EmpleadoRepository repositorio;
    private ReporteService reportes;

    public SistemaGestionEmpleados(EmpleadoRepository repo, ReporteService reportes) {
        this.repositorio = repo;
        this.reportes = reportes;
    }

    public void procesarEmpleado(Empleado empleado) {
        double pago = empleado.calcularPago();
        System.out.println("Pago calculado: " + pago);
        repositorio.guardarEnBaseDeDatos(empleado);
        reportes.generarReporte(empleado);
    }
}
