/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Luis
 */
public class Empleado {
    private String nombre; 
    private String telefono; 
    private static int numeroDeEmpleados = 0; 

    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroDeEmpleados++; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
}
