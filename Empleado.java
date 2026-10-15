/**
 * Clase que representa la plantilla o molde base para la gestión de un Empleado.
 * Implementa conceptos fundamentales de la Programación Orientada a Objetos (POO)
 * como el encapsulamiento de datos, constructores y métodos de comportamiento.
 * 
 * @author Brenda Elizabeth Salazar Ramirez
 * @version 1.0
 */
public class Empleado {
    
    // =========================================================================
    // 1. DEFINICIÓN DE ATRIBUTOS (CONCEPTO: ENCAPSULAMIENTO)
    // =========================================================================
    
    /** Nombre completo del empleado */
    private String nombre;
    
    /** Identificador único o número de nómina del empleado */
    private int id;
    
    /** Remuneración económica base percibida de forma mensual */
    private double salarioMensual;

    // =========================================================================
    // 2. CONSTRUCTOR DE LA CLASE
    // =========================================================================

    /**
     * Constructor parametrizado. Se encarga de inicializar el estado del objeto
     * asignando valores obligatorios en el momento exacto de su instanciación.
     * 
     * @param nombre         El nombre completo del trabajador.
     * @param id             El número de identificación asignado.
     * @param salarioMensual El sueldo mensual con el que ingresa al sistema.
     */
    public Empleado(String nombre, int id, double salarioMensual) {
        // El uso de 'this' resuelve la ambigüedad entre atributos y parámetros
        this.nombre = nombre;
        this.id = id;
        this.salarioMensual = salarioMensual;
    }
    
    // =========================================================================
    // 3. MÉTODOS DE COMPORTAMIENTO (LÓGICA DE NEGOCIO)
    // =========================================================================

    /**
     * Calcula la proyección del ingreso del empleado a lo largo de un año.
     * 
     * @return double Representa el salario mensual multiplicado por los 12 meses.
     */
    public double calcularSalarioAnual() {
        return this.salarioMensual * 12;
    }

    /**
     * Modifica el estado del atributo salarioMensual aplicando un incremento
     * porcentual en base a una regla de validación condicional lógica.
     * 
     * @param porcentaje Valor numérico que dicta el porcentaje a aumentar (Ej: 10 para 10%).
     */
    public void aplicarAumento(double porcentaje) {
        // Control de errores: Se valida que el porcentaje ingresado sea un valor positivo
        if (porcentaje > 0) {
            this.salarioMensual += this.salarioMensual * (porcentaje / 100);
            System.out.println("¡Aumento aplicado con éxito a " + nombre + "!");
        } else {
            System.out.println("Error: El porcentaje de aumento debe ser mayor a cero.");
        }
    }

    /**
     * Método de salida encargado de imprimir de forma estructurada y legible
     * en la consola de comandos el estado actual de todas las variables del objeto.
     */
    public void mostrarInformacion() {
        System.out.println("=== Información del Empleado ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Mensual: $" + salarioMensual);
        // Invocación interna del método de cálculo para reutilización de código
        System.out.println("Salario Anual: $" + calcularSalarioAnual());
        System.out.println("================================\n");
    }
}
