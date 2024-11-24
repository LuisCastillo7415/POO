/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Vehiculos.Vehiculo;

/**
 *
 * @author Luis
 */
public class Auto extends Vehiculo {
  private boolean tieneRadio; 
  private boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuestoCirculacion(); 
       if(cilindraje > 2499){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.20)); 
        }
         
    }
    public void calcularImpuestoCirculacion(){
    if(tieneRadio == true){
     setImpuestoCirculacion(getImpuestoCirculacion()+ (getImpuestoCirculacion() * 0.01));
    }else if(tieneNavegador == true){
         setImpuestoCirculacion(getImpuestoCirculacion() + (getImpuestoCirculacion() * 0.02));
    }else{
    super.calcularImpuestoCirculacion();
    }
    }

    public boolean isTieneRadio() {
        return tieneRadio;
    }

    public void setTieneRadio(boolean tieneRadio) {
        this.tieneRadio = tieneRadio;
    }

    public boolean isTieneNavegador() {
        return tieneNavegador;
    }

    public void setTieneNavegador(boolean tieneNavegador) {
        this.tieneNavegador = tieneNavegador;
    }
    
}
