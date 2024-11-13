/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        
        // Ejercicio 8.b.1. Recetas FastFood. 
        Restaurante rt = new Restaurante(); 
         ArrayList<String> ingredientesDeLaPizza = new ArrayList<>();
        ingredientesDeLaPizza.add("Queso");
        ingredientesDeLaPizza.add("Tomate");
        ingredientesDeLaPizza.add("Carne");
        ingredientesDeLaPizza.add("Piña");
        ArrayList<String> pasosPreparacionPizza = new ArrayList<>();
        pasosPreparacionPizza.add("Mezclar los ingredientes");
        pasosPreparacionPizza.add("Hornear"); 
        
        Pizza pz = new Pizza("Pizza con piña", ingredientesDeLaPizza, pasosPreparacionPizza); 
        
        ArrayList<String> ingredientesDelSandwich = new ArrayList<>();
        ingredientesDelSandwich.add("Pan");
        ingredientesDelSandwich.add("Lechuga");
        ingredientesDelSandwich.add("Tomate");
        ingredientesDelSandwich.add("Queso");
         ArrayList<String> pasosPreparacionSandwich = new ArrayList<>();
         pasosPreparacionSandwich.add("Poner los ingredientes uno sobre otro empezando por el pan");
        pasosPreparacionSandwich.add("Cerrar con un pan");
        
        Sandwich sa = new Sandwich("Sandiwch basico ", ingredientesDelSandwich, pasosPreparacionSandwich); 
        rt.ingresarRecetaAlMapa(pz);  
       rt.ingresarRecetaAlMapa(sa);
       
        for(IFastFood receta: rt.getMenu().getReceta()){
            System.out.println("Tiempo de preparacion: " + receta.tiempoDePreparacion());
            System.out.println("Tipo de preparacion: " + receta.tipoPreparacion());
            System.out.println("Es vegano: " + receta.isVegetariano());
        }
           
    }
}
