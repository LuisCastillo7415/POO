/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioentradasalida;
import java.util.Scanner; 
/**
 *
 * @author Luis Fernando Castillo Salazar 20241222068
 */
public class NombreMasEdad {
    public static void main(String[] args) {
      /**
       * Crear un programa que pide dos valores, el nombre y la edad de una persona, y escribe en consola
       * “me llamo XXX y tengo FF años”
       */   
      
      Scanner in = new Scanner(System.in);
      
        System.out.println("ingrese su nombre: ");
        String nombre = in.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = in.nextInt();
        
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años ");
    }
    
}
