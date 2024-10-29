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
public class NotasDeEstudintesPorTeclado {
    public static void main(String[] args) {
        /*
        Pedir por teclado las notas de 8 estudiantes y guardarlas en un array de notas.
        Las notas serán números decimales. Tras leer las notas en un bucle inicial, 
        procesar en otro bucle la información y mostrar por pantalla:
1. la nota más alta
2. la nota más baja
3. la nota media de todas las notas
4. el número de aprobados
5. el número de suspensos
        
        */
        Scanner in = new Scanner(System.in); 
        double[] notas = new double[8]; 
 
        
       for(int i = 0; i < notas.length; i++){
           System.out.print("Elemento " + i + ":");
           notas[i] = in.nextDouble(); 
       }
       
        double mayor = notas[0]; 
        double menor = notas[0]; 
        int aprobados = 0;
        int reprobados = 0; 
        double suma = 0; 
       
       for(int i = 0; i<notas.length; i++){
           if(notas[i]> mayor){
               mayor = notas[i]; 
           }
           if(menor > notas[i]){
               menor = notas[i]; 
           }
           suma += notas[i];
              
          if(notas[i]> 3){
              aprobados++; 
          }else{
              reprobados++; 
          }
          
          
       }
        double media = suma /notas.length;  
        System.out.println("La nota mayor es: " + mayor);
        System.out.println("La nota menor es: " + menor);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de reprobados: " + reprobados);
        System.out.println("La media de las notas: " + media);
    }
}
