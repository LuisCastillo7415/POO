/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericio6;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        AlfombraCuadrada ac = new AlfombraCuadrada(4, "Azul", 100);
        System.out.println("Alfombra Cuadrada");
        System.out.println(ac.toString());
        System.out.println("Superficie: " + ac.calcularSuperficie());
        System.out.println("Precio: " + ac.calcularPrecio());
        
        AlfombraRedonda ar = new AlfombraRedonda(2, "Rojo", 85);
        System.out.println("\nAlfombra Redonda");
        System.out.println(ar.toString());
        System.out.println("Superficie: " + ar.calcularSuperficie());
        System.out.println("Precio: " + ar.calcularPrecio());
    }
}
