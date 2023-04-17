/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio422;

/**
 *
 * @author jhoannparroter
 */
public class empleado {

    protected String nombre;
    protected double salarioHora;
    protected int horasMensuales;
    protected double salarioMensual;

    public empleado(String nombre, double salarioHora, int horasMensuales) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horasMensuales = horasMensuales;
    }

    public void calcularSalarioMensual() {
        this.salarioMensual = this.salarioHora * this.horasMensuales;
    }
    
}
