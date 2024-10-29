/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        
        Coches co = new Coches(4, 200, "Nissan", 300); 
        System.out.println(co.toString());
        System.out.println("Precio real de venta:  " + co.precioVenta());
        
        Furgonetas fu = new Furgonetas(20, 300, "Chevrolet", 400); 
        System.out.println(fu.toString());
        System.out.println("Precio real de venta: " + fu.precioVenta());
        
        Camiones ca = new Camiones(3, 16.5, 350, "BMW", 450); 
        System.out.println(ca.toString());
        System.out.println("Precio real de venta: " + ca.precioVenta());
    }
}
