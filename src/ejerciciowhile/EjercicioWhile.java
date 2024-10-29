/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciowhile;
import java.util.Scanner; 

/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class EjercicioWhile {

    /**
     * Pedir por teclado 10 números e indicar si cada uno de ellos es positivo o negativo y si es par o impar.
       MEJORA 1: No hay un número fijo de números, el programa pide repetidamente números hasta que
       se introduzca un 0.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Ingrese numeros para determinar si son positivos, negativos, pares o impares. Ingrese cero para finalizar");
        
        do{
            int numero = in.nextInt(); 
            if (numero == 0){
                break; 
            }
            if(numero > 0){
                System.out.println("El numero " + numero + " es positivo");
            }else{
                System.out.println("El numero " + " es negativo");
            }
            
            if (numero % 2 == 0){
                System.out.println("Y es par :D");
            }else{
                System.out.println("Y es impar :(");
            }
        }while(true);
    }
    
}
