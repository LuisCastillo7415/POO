/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class Pescado extends Producto {
    private String tipoDePescado; 

    public Pescado(String tipoDePescado, String nombre, double peso, double precioKilo) {
        super(nombre, peso, precioKilo);
        this.tipoDePescado = tipoDePescado;
    }

    public String getTipoDePescado() {
        return tipoDePescado;
    }

    public void setTipoDePescado(String tipoDePescado) {
        this.tipoDePescado = tipoDePescado;
    }
    
}
