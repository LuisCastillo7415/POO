/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class CarneFresca extends Carne {
    private int diasDeCaducidad; 

    public CarneFresca(int diasDeCaducidad, String origen, String nombre, double peso, double precioKilo) {
        super(origen, nombre, peso, precioKilo);
        this.diasDeCaducidad = diasDeCaducidad;
    }

    public int getDiasDeCaducidad() {
        return diasDeCaducidad;
    }

    public void setDiasDeCaducidad(int diasDeCaducidad) {
        this.diasDeCaducidad = diasDeCaducidad;
    }
    
    
}
