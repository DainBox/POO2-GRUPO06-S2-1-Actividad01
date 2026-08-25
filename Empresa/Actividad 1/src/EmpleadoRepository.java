public class EmpleadoRepository {
    public void guardarEnBaseDeDatos(Empleado empleado) {
        System.out.println("Guardando empleado " + empleado.getNombre() + " en la base de datos...");
    }
}