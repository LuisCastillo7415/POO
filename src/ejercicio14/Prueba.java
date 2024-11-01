/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        // Ejercicio 8.b.7. Relaciones.
        
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero: ");
        int numero1 = in.nextInt(); 
        Clase a = new Clase(numero1);
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = in.nextInt(); 
        Clase b = new Clase(numero2);
        System.out.println(" a es mayor que b : " + a.esMayor(b));
        System.out.println("a es menor que b: " + a.esMenor(b));
        System.out.println("a es igual a b: " + a.esIgual(b));
    }
}
