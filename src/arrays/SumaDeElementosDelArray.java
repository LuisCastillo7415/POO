/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;
import java.util.Scanner; 
/**
 *
 * @author Luis
 */
public class SumaDeElementosDelArray {
    public static void main(String[] args) {
        int[] array = new int[10]; 
        Scanner in = new Scanner(System.in); 
        System.out.println("Ingrese 10 numeros enteros: ");
        
       for(int i = 0; i < array.length; i++){
           System.out.println("Numero " + i + ":");
           array[i] = in.nextInt(); 
       }
       
       int sumaDePares = 0; 
       int sumaDeImpares = 0; 
       for(int elemento : array){
        if (elemento % 2 == 0){
            sumaDePares += elemento; 
            
        }else{
            sumaDeImpares += elemento; 
        }
    }
        System.out.println("Suma de pares = " + sumaDePares);
        System.out.println("Suma de impares = " + sumaDeImpares);
        
        if(sumaDePares > sumaDeImpares){
            System.out.println("La suma de numeros pares es mayor");
        }else if(sumaDePares < sumaDeImpares){
            System.out.println("La suma de numeros impares es mayor");
        }else{
            System.out.println("Las sumas son iguales");
        }
       
    }
    
}
