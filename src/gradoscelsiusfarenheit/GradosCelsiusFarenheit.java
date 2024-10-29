/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradoscelsiusfarenheit;
import java.util.Scanner; 

/**
 *
 * @author Luis
 */
public class GradosCelsiusFarenheit {

    /**
     * Escribir un programa que pide al usuario que introduzca el valor de una temperatura (un valor
     * double). Imaginamos que dicha temperatura esta en modo grados Celsius. Transformar este valor a
     * grados Fahrenheit, y mostrar el resultado por consola. Usar la fórmula : f = (9/5) * C + 32
     */
    public static void main(String[] args) {
       
        System.out.println("Ingrese grados celsius para convertir a farenheit: ");
         Scanner in = new Scanner(System.in);
        double celsius = in.nextDouble(); 
        
        double farenheit = (celsius * 9/5) + 32; 
        
        System.out.println(celsius + " grados celsius equivalen a " + farenheit + " grados farenheit");
    }
    
}
