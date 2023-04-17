package ejercicio319;

/**
 *
 * @author Jteheranm
 */
public class triangulo {
    protected double lado;
    protected double perimetro;
    protected double altura;
    protected double area;
    
    public triangulo(double lado) {
        this.lado = lado;
        perimetro = lado * 3;
        altura = Math.sqrt((lado*lado) - ((lado/2)*(lado/2)));
        area = (lado * altura) / 2;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public double getAltura() {
        return altura;
    }
    public double getArea() {
        return area;
    }
  
}
