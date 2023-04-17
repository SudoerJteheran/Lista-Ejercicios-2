/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio47;

/**
 *
 * @author jhoannparroter
 */
public class comparador {
    protected double a, b;

    public comparador(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String comparar() {
        if (a > b) {
            return "A es mayor que B";
        } else if (a == b) {
            return "A es igual que B";
        } else { 
            return "A es menor que B";}
    }

    
}
