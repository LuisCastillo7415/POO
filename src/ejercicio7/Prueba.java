/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        // Ejercicio 8.a.11. Profesores eméritos.
    
    ProfesorEmerito jose = new ProfesorEmerito(5, "Jose Perez", 47, 25);
    
        System.out.println(jose.toString());
        System.out.println("Salario Base: " + jose.obtenerSalarioBase());
    }
}
