/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        //Ejercicio 8.a.4. Proyecto coches Matriculados.
        
        Coche a = new Coche("Nissan", "Blanco", 10000, 10, 10, "BSA124", "265543"); 
        System.out.println(a.toString());
        Coche b = new Coche("BMW", "Rojo", 20000, 20, 30, "LVP456", "33452"); 
        System.out.println(b.toString());
        System.out.println("El dueño de coche b compra el coche a ");
        a.comprarCoche(b);
        System.out.println(a.toString());
        CocheMatriculado cm = new CocheMatriculado(12, 5, "Toyota", "Azul", 50000, 15, 20, "LCK342", "4435");
        System.out.println("\n Coche matriculado");
        System.out.println(cm.toString());
        System.out.println("Impuesto de matriculacion: " + cm.calcularImpuestoMatriculacio());
        
    }
}
