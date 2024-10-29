/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class CarnePiezaTroceada extends CarneCongelada {
    private int numeroDePiezas; 

    public CarnePiezaTroceada(int numeroDePiezas, String InfoEmpresaDistribuidora, String origen, String nombre, double peso, double precioKilo) {
        super(InfoEmpresaDistribuidora, origen, nombre, peso, precioKilo);
        this.numeroDePiezas = numeroDePiezas;
    }

    public int getNumeroDePiezas() {
        return numeroDePiezas;
    }

    public void setNumeroDePiezas(int numeroDePiezas) {
        this.numeroDePiezas = numeroDePiezas;
    }
    
}
