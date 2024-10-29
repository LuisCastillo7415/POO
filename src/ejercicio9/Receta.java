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
public abstract class Receta implements IFastFood {
    private String nombre;
    private ArrayList<String> ingredientes = new ArrayList<String>();
    private ArrayList<String> pasosPreparacion = new ArrayList<String>();
    
public Receta(String nombre,ArrayList<String> ingredientes,ArrayList<String> pasosPreparacion){
this.nombre = nombre;
this.ingredientes = ingredientes;
this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }

}