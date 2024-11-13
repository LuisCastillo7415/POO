/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Luis
 */
public class Inicio {
    public static void main(String[] args) {
        //Ejercicio 8.a.8. Nuevos métodos tipo Math.

        
        Math2 m = new Math2(); 
     
        
        System.out.println("Array: ");
       int[] array = new int[10]; 
          for(int i = 0; i < array.length; i++){
              array[i] = i+1;
              System.out.print(array[i]+ ", ");
        }
          System.out.println("\nValor minimo: ");
        System.out.println(m.min(array)); 
        System.out.println("Valor maximo: ");
        System.out.println(m.max(array));
        
        System.out.println("\n Array con valores de tipo double");
        double [] array2 = new double[12]; 
        for(int i = 0; i < array2.length; i++){
        array2[i] = i+3*0.5; 
        System.out.print(array2[i]+ ", ");
        }
          System.out.println("\nValor minimo: ");
        System.out.println(m.min(array2)); 
        System.out.println("Valor maximo: ");
        System.out.println(m.max(array2));
    }
}
