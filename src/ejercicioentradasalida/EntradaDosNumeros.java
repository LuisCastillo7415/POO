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
public class EntradaDosNumeros {
    public static void main(String[] args) {
        
        //Crear un programa que pide dos numero por Scanner y escribe en consola “los números son X e Y”
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros: ");
        int numero = in.nextInt();
        int numero1 = in.nextInt();
        
        System.out.println("Los numeros son " + numero + " y " + numero1);
              
    }
}
