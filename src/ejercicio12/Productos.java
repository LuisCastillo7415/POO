/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public abstract class Productos {
    private int fechaDeCaducidad; 
    private double numeroDeLote;

    public Productos(int fechaDeCaducidad, double numeroDeLote) {
        this.fechaDeCaducidad = fechaDeCaducidad;
        this.numeroDeLote = numeroDeLote;
    }

    @Override
    public String toString() {
        return  "fechaDeCaducidad=" + fechaDeCaducidad + ", numeroDeLote=" + numeroDeLote + '}';
    }
    
}
