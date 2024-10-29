/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio6;

/**
 *
 * @author Luis
 */
public abstract class Alfombra implements IAlfombras {
    private String color; 
    private int precioPorMetro; 

    public Alfombra(String color, int precioPorMetro) {
        this.color = color;
        this.precioPorMetro = precioPorMetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecioPorMetro() {
        return precioPorMetro;
    }

    public void setPrecioPorMetro(int precioPorMetro) {
        this.precioPorMetro = precioPorMetro;
    }

    @Override
    public String toString() {
        return "Alfombra{" + "color=" + color + ", precioPorMetro=" + precioPorMetro + '}';
    }
    
    
}
