/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        // Ejercicio 8.a.1. Crea una clase llamada Forma:
        
        Triangulo tl = new Triangulo(4, 5, "Triangulo", 1, 2, "azul"); 
        System.out.println("Triangulo: ");
        System.out.println(tl.toString());
    
        System.out.println("El area es: " + tl.calcularArea());
        
        Cuadrado cu = new Cuadrado(4, "Cuadrado", 1, 2, "Rojo");
        System.out.println("\nCuadrado");
        System.out.println(cu.toString());
        System.out.println("El area es: " + cu.calcularArea());
        System.out.println("El perimetro es" + cu.calcularPerimetro());
    }
}
