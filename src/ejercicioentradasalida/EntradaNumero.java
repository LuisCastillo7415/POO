/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioentradasalida;
import java.util.Scanner; 
/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class EntradaNumero {
    public static void main(String[] args) {
        
        // Crear un programa que pide un número por Scanner y escribe en consola “el numero es XX”
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        
        int numero = in.nextInt();
        
        System.out.println("El numero es: " + numero);
    }
    
}
