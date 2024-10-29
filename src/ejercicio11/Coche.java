/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Luis
 */
public class Coche {
    private String marca; 
    private String color; 
    private int km = 0; 
    private double precio; 
    private double factorContaminacion; 
    private int anio; 
    private String matricula; 
    private String dniTitular;  

    public Coche(String marca, String color, double precio, double factorContaminacion, int anio, String matricula, String dniTitular) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factorContaminacion = factorContaminacion;
        this.anio = anio;
        this.matricula = matricula;
        this.dniTitular = dniTitular;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }
   
    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }
    
    
    public void comprarCoche(Coche otroCoche){
    setDniTitular(otroCoche.dniTitular); 
   
   }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", km=" + km + ", precio=" + precio + ", factorContaminacion=" + factorContaminacion + ", anio=" + anio + ", matricula=" + matricula + ", dniTitular=" + dniTitular + '}';
    }
    
    
}
