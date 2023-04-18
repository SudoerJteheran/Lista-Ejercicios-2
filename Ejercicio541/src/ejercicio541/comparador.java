/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio541;

/**
 *
 * @author jhoannparroter
 */
public class comparador {
    
    double[] elementos = new double[5];
    
    public comparador(double a, double b, double c, double d, double e) {
        this.elementos[0] = a;
        this.elementos[1] = b;
        this.elementos[2] = c;
        this.elementos[3] = d;
        this.elementos[4] = e;
    }
    
    public double mayor(){
    double mayor = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            if(elementos[i] > mayor) {
                mayor = elementos[i];
            }
        }
        return mayor;
    }
}