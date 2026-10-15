public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE GESTIÓN DE EMPLEADOS ---\n");

        Empleado emp1 = new Empleado("Carlos Mendoza", 101, 1500.0);
        Empleado emp2 = new Empleado("Ana Gómez", 102, 2300.0);

        System.out.println("Estado inicial de los empleados:");
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        System.out.println("Modificando salarios por desempeño:");
        emp1.aplicarAumento(10); 

        System.out.println("\nEstado final tras modificaciones:");
        emp1.mostrarInformacion();
    }
}
