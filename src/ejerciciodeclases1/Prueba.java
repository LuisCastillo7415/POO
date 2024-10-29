/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeclases1;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        Papel papel1 = new Papel(); 
        Papel papel2 = new Papel(); 
        Papel papel3 = new Papel();
        
        
        // Atributos de papel 1
        papel1.Color = "Blanco"; 
        papel1.Grosor = 20; 
        
        // Atributos de papel 2
        papel2.Color = "Cafe"; 
        papel2.Grosor = 120; 
        
        // Atributos de papel 3 
        papel3.Color = "Negro";
        papel3.Grosor = 700; 
        
        //Mostramos es pantalla
        System.out.println("Papel 1: ");
        System.out.println("Color: " + papel1.Color);
        System.out.println("Gramaje: " + papel1.Grosor);
      
        
        System.out.println("\nPapel 2: ");
        System.out.println("Color: " + papel2.Color);
        System.out.println("Gramaje: " + papel2.Grosor);
        
        
        
        System.out.println("\nPapel 3: ");
        System.out.println("Color: " + papel3.Color);
        System.out.println("Gramaje: " + papel3.Grosor);
       
    }
    
}
