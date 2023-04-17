/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio423;

/**
 *
 * @author jhoannparroter
 */
public class polinomio {
    protected int grado = 2;
    protected double[] coeficientes = new double[grado + 1];

    public polinomio(double a, double b, double c) {
        coeficientes[0] = a;
        coeficientes[1] = b;
        coeficientes[2] = c;
    }

    public double[] calcular_raices(){
        double[] raices = new double[2];
        double discriminante = Math.pow(coeficientes[1], 2) - 4 * coeficientes[0] * coeficientes[2];
        if (discriminante >= 0){
            raices[0] = (-coeficientes[1] + Math.sqrt(discriminante)) / (2 * coeficientes[0]);
            raices[1] = (-coeficientes[1] - Math.sqrt(discriminante)) / (2 * coeficientes[0]);
        }
        return raices;
    }

}
