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
//Punto numero 1: Crear una subclase de vehiculo llamada camion
public class Camion extends Vehiculo{
    private int numeroDeEjes; 
    private String tipoDeCamion; 
    private double capacidadDeCarga; 

    //Inciso a, constructor.
    public Camion(int numeroDeEjes, String tipoDeCamion, double capacidadDeCarga, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        
      //Inciso b. 
    //Validar que los ejes coincidan con el tipo de camion (sencillo tiene 2 y double entre 3 y 6)
        if(tipoDeCamion.equalsIgnoreCase("Sencillo")){
            if(numeroDeEjes == 2){
        this.numeroDeEjes = numeroDeEjes;
            }else{
                System.out.println("El numero de ejes no coincida con el tipo de camion");
            }
        }else if(tipoDeCamion.equalsIgnoreCase("Doble")){
        if(numeroDeEjes>=3 || numeroDeEjes<=6){
         this.numeroDeEjes = numeroDeEjes;
        }
        }else{
            System.out.println("El numero de ejes no coincida con el tipo de camion");
        }
        
      //Validar que el tipo de camion ingresado sea sencillo o doble
        if(tipoDeCamion.equalsIgnoreCase("Sencillo")){
        this.tipoDeCamion = tipoDeCamion;
        }else if(tipoDeCamion.equalsIgnoreCase("Doble")){
         this.tipoDeCamion = tipoDeCamion;
        }else{
            System.out.println("Tipo de camion no valido");
        }
        
        this.capacidadDeCarga = capacidadDeCarga;
        
        calcularImpuestoCirculacion(); 
        
        //Inciso d.
        //Aumentar la cuota mensual del garaje en relacion al tipo de camion
          if(tipoDeCamion.equalsIgnoreCase("Sencillo")){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.75)); 
        }else if(tipoDeCamion.equalsIgnoreCase("Doble")){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 1.25)); 
        }
    }
    //Inciso c.
    //Metodo impuesto circulacion para camion
     public void calcularImpuestoCirculacion(){
     setImpuestoCirculacion(getImpuestoCirculacion()+ (getImpuestoCirculacion() * 0.09));
     for(int i = 0; i < this.capacidadDeCarga; i +=5){
    setImpuestoCirculacion(getImpuestoCirculacion() + 10); 
     }
    
    }

    public int getNumeroDeEjes() {
        return numeroDeEjes;
    }

    public String getTipoDeCamion() {
        return tipoDeCamion;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public Camion(String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
    }

 
   
}
