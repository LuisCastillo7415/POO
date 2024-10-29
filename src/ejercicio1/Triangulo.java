/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Luis
 */
public class Triangulo extends Forma {
    private double base; 
    private double altura;

    public Triangulo(double base, double altura, String nombre, double posicionX, double posicionY, String color) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (this.altura * this.base)/2;
        
        return area; 
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}' + "Forma{" + "nombre=" + getNombre() + ", posicionX=" + getPosicionX() + ", posicionY=" + getPosicionY() + ", color=" + getColor() + '}';
    }

}
