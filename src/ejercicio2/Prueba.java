/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        Empleado jose = new Empleado("Jose Ivan", "123", 21, false, 123.4);
        System.out.println(jose.toString());
        System.out.println("Clasificacion segun edad: " + jose.clasificar());
        System.out.println("Aumento de salario: " + jose.subirSalario(5));
        
        Programador brandon = new Programador(50, "C++", "Brandon Sanchez", "342", 40, false, 123.4);
        System.out.println(brandon.toString());
        System.out.println("Clasificacion segun edad: " +brandon.clasificar());
        System.out.println("Salario de programador: " + brandon.calcularSalario());
    }
}
