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
public class Sandwich extends Receta {

    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int numeroVocales = (int) getNombre().chars().count();
        return 2 + numeroVocales; 
   }

    @Override
    public boolean isVegetariano() {
        return true; 
    }

    @Override
    public String tipoPreparacion() {
        return "Plancha";   
    }
    
}
