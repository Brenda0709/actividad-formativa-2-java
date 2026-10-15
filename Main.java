/**
 * Clase de ejecución principal (Entry Point) que contiene el método main.
 * Coordina la inicialización de la aplicación, administra la instanciación de 
 * objetos reales en memoria física y realiza las pruebas de ejecución de los métodos.
 * 
 * @author Brenda Elizabeth Salazar Ramirez
 * @version 1.0
 */
public class Main {
    
    /**
     * Método principal que arranca la máquina virtual de Java (JVM).
     * 
     * @param args Arreglo de argumentos de tipo String heredados por consola.
     */
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE GESTIÓN DE EMPLEADOS ---\n");

        // =========================================================================
        // INSTANCIACIÓN DE OBJETOS A PARTIR DE LA CLASE EMPLEADO
        // =========================================================================
        // Se crean dos referencias independientes en memoria utilizando el constructor
        Empleado emp1 = new Empleado("Carlos Mendoza", 101, 1500.0);
        Empleado emp2 = new Empleado("Ana Gómez", 102, 2300.0);

        // =========================================================================
        // PRUEBA DE FUNCIONAMIENTO: ESTADO INICIAL
        // =========================================================================
        System.out.println("Estado inicial de los empleados:");
        emp1.mostrarInformacion();
        emp2.mostrarInformacion();

        // =========================================================================
        // EJECUCIÓN DE PROCESOS DE MODIFICACIÓN (LÓGICA OPERATIVA)
        // =========================================================================
        System.out.println("Modificando salarios por desempeño:");
        // Se simula la aprobación de un incremento del 10% para el primer empleado
        emp1.aplicarAumento(10); 

        // =========================================================================
        // PRUEBA DE FUNCIONAMIENTO: ESTADO FINAL
        // =========================================================================
        System.out.println("\nEstado final tras modificaciones:");
        // Se vuelve a invocar el reporte para verificar que los datos cambiaron en memoria
        emp1.mostrarInformacion();
    }
}
