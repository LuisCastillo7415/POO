/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        
         Piso pi = new Piso(20, 2, "Calle #3", 60);
        Adosado ad = new Adosado(5, "Calle #5", 120);
        Chalet ch = new Chalet(23, true,"Calle #2", 150);
        
        System.out.println(pi.toString());
        System.out.println("Precio: " + pi.calcularPrecio());
        
        System.out.println(ad.toString());
        System.out.println("Precio: " + ad.calcularPrecio());
        
        System.out.println(ch.toString());
        System.out.println("Precio: " + ch.calcularPrecio());
    }
}
