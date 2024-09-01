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
public class SumaDeDosNumeros {
    public static void main(String[] args) {
        
        /**
         * crea un programa que pide dos números por Scanner y escribe en consola la suma de ambos, con el
         * texto “XX mas YY son ZZ”
         */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros: ");
        int numero = in.nextInt();
        int numero2 = in.nextInt();
        
        int suma = numero + numero2; 
        
        System.out.println(numero + " mas " + numero2 + " es igual a: " + suma);
        
    }
    
}
