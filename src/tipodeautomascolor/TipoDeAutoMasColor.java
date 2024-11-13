/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipodeautomascolor;
import java.util.Scanner; 
/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class TipoDeAutoMasColor {

    /**
     * Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
       camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
       Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
       de selección múltiple dentro de otra.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Seleccione el tipo de carro: ");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        
        int opcionauto = in.nextInt(); 
        
        switch (opcionauto){
            case 1: 
                 System.out.println("Seleccione el color: ");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        int opcioncolor = in.nextInt(); 
        
        switch (opcioncolor){
            case 1: 
                System.out.println("Auto Negro");
                break;
            case 2: 
                System.out.println("Auto Blanco");
                break; 
            case 3: 
                System.out.println("Auto Rojo");
                break; 
        }
        break;
        
            case 2: 
                  System.out.println("Seleccione el color: ");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        int opcioncolor2 = in.nextInt(); 
        
        switch (opcioncolor2){
            case 1: 
                System.out.println("SUV Negro");
                break;
            case 2: 
                System.out.println("SUV Blanco");
                break; 
            case 3: 
                System.out.println("SUV Rojo");
                break; 
            
        }
        break; 
            case 3: 
                System.out.println("Seleccione el color: ");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        int opcioncolor3 = in.nextInt(); 
        
        switch (opcioncolor3){
            case 1: 
                System.out.println("Camioneta Negra");
                break;
            case 2: 
                System.out.println("camioneta Blanca");
                break; 
            case 3: 
                System.out.println("camioneta Roja");
                break; 
            
        }
        break; 
        }
       
    }
    
}
