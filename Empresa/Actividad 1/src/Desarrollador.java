public class Desarrollador extends Empleado {
    public Desarrollador(String nombre, double salarioBase) { 
        super(nombre, salarioBase); 
    }
    
    @Override
    public double calcularPago() { 
        return salarioBase; 
    }
}
