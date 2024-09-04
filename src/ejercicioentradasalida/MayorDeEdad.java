/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioentradasalida;
import java.util.Scanner;
// .
public class MayorDeEdad {
    public static void main(String[] args) {
        /** pide un nombre y una edad. Luego nos dice por consola: "El señor/a XXXXX hace YYYY años
         * que es mayor de edad".
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = in.nextLine();
        
                System.out.println("Ingrese su edad: ");
                int edad = in.nextInt();
                
                int años = edad - 18; 
              
       if (años>0){
           System.out.println("El señor/a " + nombre + " Lleva " + años + " años siendo mayor de edad");
       }  
       else {
           System.out.println("Aun no es mayor de edad ");
       }
          
    }
          
}
