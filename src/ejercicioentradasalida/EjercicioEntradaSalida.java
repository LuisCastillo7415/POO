/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioentradasalida;
import java.util.Scanner;

/**
 *
 * @author Luis Fernando Castillo Salazar 20241222068
 */
public class EjercicioEntradaSalida {

    /**
     * Crear un programa que pide un nombre por Scanner y escribe en consola “buenas tardes, Sr XX”
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
       String nombre = in.nextLine();
        System.out.println("Buenas tardes, sr "+ nombre);
    }
    
}
