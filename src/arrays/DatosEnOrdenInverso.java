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
public class DatosEnOrdenInverso {
  
    public static void main(String[] args) {
        
    int [] array = new int[5]; 
    Scanner in = new Scanner(System.in); 
        
    
        System.out.println("Ingrese 5 numeros enteros: ");
   for(int i = 0; i < array.length; i++){
       
       System.out.println("Elemeto " + i + " :");
       array[i] = in.nextInt(); 
   }
   for(int i = array.length - 1 ; i >= 0; i-- ){
       System.out.println("elemento " + i + " " + array[i]);
   }
 }
}
    