public class Empleado {
    private String nombre;
    private int id;
    private double salarioMensual;

    public Empleado(String nombre, int id, double salarioMensual) {
        this.nombre = nombre;
        this.id = id;
        this.salarioMensual = salarioMensual;
    }
    
    public double calcularSalarioAnual() {
        return this.salarioMensual * 12;
    }

    public void aplicarAumento(double porcentaje) {
        if (porcentaje > 0) {
            this.salarioMensual += this.salarioMensual * (porcentaje / 100);
            System.out.println("¡Aumento aplicado con éxito a " + nombre + "!");
        }
    }

    public void mostrarInformacion() {
        System.out.println("=== Información del Empleado ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Mensual: $" + salarioMensual);
        System.out.println("Salario Anual: $" + calcularSalarioAnual());
        System.out.println("================================\n");
    }
}
