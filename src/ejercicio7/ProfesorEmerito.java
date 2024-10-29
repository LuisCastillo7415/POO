/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Luis
 */
public class ProfesorEmerito extends Profesor {
    private int añosEmerito;

    public ProfesorEmerito(int añosEmerito, String nombre, int edad, int añosConsolidados) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }
    public double obtenerSalarioBase(){
    return 925 + añosConsolidados * 12.25 + 23.40 * añosEmerito;
    }

    @Override
    public String toString() {
        return super.toString() + "ProfesorEmerito{" + "a\u00f1osEmerito=" + añosEmerito + '}';
    }
    
    
}
