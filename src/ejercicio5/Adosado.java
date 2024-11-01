/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luis
 */
public class Adosado extends Vivienda{
    private int numPlantas; 

    public Adosado(int numPlantas, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    @Override
    public String toString() {
        return super.toString() + "Adosado{" + "numPlantas=" + numPlantas + '}';
    }
    
}
