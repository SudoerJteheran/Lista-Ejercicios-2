/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio410;

/**
 *
 * @author jhoannparroter
 */
public class estudiante {
    // Atributos
    protected String nombres;
    protected String num_inscripcion;
    protected double patrimonio;
    protected int estrato;
    protected double pago_matricula;

    // Constructor
    public estudiante(String nombres, String num_inscripcion, double patrimonio, int estrato) {
        this.nombres = nombres;
        this.num_inscripcion = num_inscripcion;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        this.pago_matricula = 50000;
    }

    // Metodos

    public void calcular_matricula() {
        if (this.estrato > 3 && this.patrimonio > 2000000) {
            this.pago_matricula = this.pago_matricula + this.patrimonio * 0.03;

    }
  }
}
