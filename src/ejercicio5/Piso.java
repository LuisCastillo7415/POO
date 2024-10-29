/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luis
 */
public class Piso extends Vivienda {
    private int planta;
    private int  puerta; 

    public Piso(int planta, int puerta, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.planta = planta;
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return super.toString() + "Piso{" + "planta=" + planta + ", puerta=" + puerta + '}';
    }
    
}
