/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio6;

/**
 *
 * @author Luis
 */
public class AlfombraRedonda extends Alfombra {
    private int radio; 

    public AlfombraRedonda(int radio, String color, int precioPorMetro) {
        super(color, precioPorMetro);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    

    @Override
    public double calcularSuperficie() {
        return 3.1416 * (this.radio * this.radio);
    }

    @Override
    public double calcularPrecio() {
   return calcularSuperficie() * getPrecioPorMetro();
    }

    @Override
    public String toString() {
        return super.toString() + "AlfombraRedonda{" + "radio=" + radio + '}';
    }
    
    
}
