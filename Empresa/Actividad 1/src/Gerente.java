public class Gerente extends Empleado {
    public Gerente(String nombre, double salarioBase) { 
        super(nombre, salarioBase); 
    }
    
    @Override
    public double calcularPago() { 
        return salarioBase + 1000; 
    }
}
