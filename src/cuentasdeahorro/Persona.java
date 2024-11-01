/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasdeahorro;

/**
 *
 * @author Luis
 */
public class Persona {
    private String nombre; 
    private String NIF; 
 

    public Persona(String nombre, String NIF){
    this.nombre = nombre;
    this.NIF = NIF; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", NIF=" + NIF + '}';
    }
    
    
    
}