/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Luis
 */
public class Programador extends Empleado {
    private int lineasPorHora; 
    private String lenguajeDominante; 

    public Programador(int lineasPorHora, String lenguajeDominante, String nombre, String dni, int edad, boolean casado, double salario) {
        super(nombre, dni, edad, casado, salario);
        this.lineasPorHora = lineasPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    public double calcularSalario(){
        double aumentoSalario = getSalario() + (this.lineasPorHora * 10); 
        return aumentoSalario; 
    }

    @Override
    public String toString() {
        return "Programador{" + "lineasPorHora=" + lineasPorHora + ", lenguajeDominante=" + lenguajeDominante + '}'+ "Empleado{" + "nombre=" + getNombre() + ", dni=" + getDni() + ", edad=" + getEdad() + ", casado=" + isCasado() + ", salario=" + getSalario() + '}';
   
    }
    
    
}
