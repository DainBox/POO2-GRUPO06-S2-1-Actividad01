public class Practicante extends Empleado {
    public Practicante(String nombre, double salarioBase) { 
        super(nombre, salarioBase); 
    }
    
    @Override
    public double calcularPago() { 
        return salarioBase * 0.5; 
    }
}
