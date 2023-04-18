/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio540;

/**
 *
 * @author jhoannparroter
 */
public class Numero {
    protected double valor;
    
    //Constructor
    public Numero(double valor){
        this.valor = valor;
    }

    //Operaciones raiz cuadrada, cuadrado y cubo, mediante metodos
    public double raiz(){
        return Math.sqrt(valor);
    }
    public double cuadrado(){
        return Math.pow(valor, 2);
    }
    public double cubo(){
        return Math.pow(valor, 3);
    }
    
}
