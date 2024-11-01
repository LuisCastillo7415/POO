/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Pizza extends Receta {

    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return 2 + getNombre().length();
         }

    @Override
    public boolean isVegetariano() { 
        if( getIngredientes().contains("Carne")){
            return false; 
        }else{
        return true; 
        } 
     }

    @Override
    public String tipoPreparacion() {
        return "Horno";
   }
    
}
