/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Luis
 */
public class Cuadrado extends Forma {
    private double lado; 

    public Cuadrado(double lado, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = this.lado * this.lado; 
        return area; 
    }
    
    public double calcularPerimetro(){
    double perimetro = this.lado + this.lado + this.lado + this.lado;
    return perimetro; 
    
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}' + "Forma{" + "nombre=" + getNombre() + ", posicionX=" + getPosicionX() + ", posicionY=" + getPosicionY() + ", color=" + getColor() + '}';
    
    }
    
}
