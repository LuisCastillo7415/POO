/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;
import java.util.Scanner; 
/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        // Ejercicio 8.a.7. Crear una clase llamada Empleado
        
        Scanner in = new Scanner(System.in); 
        Empleado [] ep = new Empleado [4];
        for(int i = 0; i < ep.length; i++){
            System.out.print("Ingrese el nombre del empleado: ");
           String nombre = in.nextLine(); 
            System.out.print("Ingrese el numero de telefono del empleado: ");
            String numero = in.nextLine(); 
            
            ep[i] = new Empleado(nombre, numero);
        }
        System.out.println("\nDatos registrados de los empleados: ");
        for(Empleado em: ep){
            System.out.println(em);
            
        }
        System.out.println("\nAtributo estatico numero de empleados : " + Empleado.getNumeroDeEmpleados());
    }
 
}
