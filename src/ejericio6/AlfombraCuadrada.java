/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio6;

/**
 *
 * @author Luis
 */
public class AlfombraCuadrada extends Alfombra {
    private int lado; 

    public AlfombraCuadrada(int lado, String color, int precioPorMetro) {
        super(color, precioPorMetro);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularSuperficie() {
        return this.lado * this.lado; 
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioPorMetro(); 
   }

    @Override
    public String toString() {
        return super.toString() + "AlfombraCuadrada{" + "lado=" + lado + '}';
    }
    
    
}
