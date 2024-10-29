/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luis
 */
public class Vivienda {
    private String calle; 
    private double precio; 
    private int superficieEnMetros; 

    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio(); 
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }

    public void setSuperficieEnMetros(int superficieEnMetros) {
        this.superficieEnMetros = superficieEnMetros;
    }
    
    public double calcularPrecio(){
   double po = this.superficieEnMetros * 1000; 
   return po; 
    }

    @Override
    public String toString() {
        return "Vivienda{" + "calle=" + calle + ", precio=" + precio + ", superficieEnMetros=" + superficieEnMetros + '}';
    }
    
}
