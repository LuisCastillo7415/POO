/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class ArrayConNumerosAleatorios {
    
   /*1. Crear un array de 15 enteros, rellenarlo con valores aleatorios, y escribe sus valores por pantalla
     2.Crear un array de 15 enteros, rellenarlo con valores aleatorios, y escribir el numero mayor 
       de ellos por consola
    */
    public static void main(String[] args) {
        
        int[] array = new int[15]; 
        int mayor = array[0];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * (50 - 0)) + 0; 
            System.out.print(array[i] + "  ");
            
            if(array[i] > mayor){
                mayor = array[i]; 
                
            }
        }
       System.out.println("\nEl numero mayor es: " + mayor); 
    }
}
