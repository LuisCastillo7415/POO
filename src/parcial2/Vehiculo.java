/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author Luis
 */
public class Vehiculo {
   private String placa; 
   private String marca; 
   private double precio;
   private int cilindraje;
   private double impuestoCirculacion;
   private double cuotaMesGaraje;
   public static final double CUOTABASEMESGARAJE = 100 ; 

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.placa = null; 
        this.cuotaMesGaraje = CUOTABASEMESGARAJE; 
        calcularImpuestoCirculacion(); 
    }
  
    public void calcularImpuestoCirculacion(){
    this.impuestoCirculacion = this.precio * 0.02; 
    
    }
    
    public boolean matricular(String matricula){
    if(matricula.length() == 6){
    this.placa = matricula; 
    return true; 
    }
    return false; 
    }

 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if(cuotaMesGaraje > 0){
        this.cuotaMesGaraje = cuotaMesGaraje;
        }
    }
   
   
}
