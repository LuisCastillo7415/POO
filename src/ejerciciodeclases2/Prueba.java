/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodeclases2;
import java.util.Scanner; 
/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo(); 
        
        triangulo1.altura = 5; 
        triangulo1.base = 4; 
        System.out.println("Base: " + triangulo1.base);
        System.out.println("Altura " + triangulo1.altura);
        
        System.out.println("Area: " + triangulo1.hallarArea());
        
        do{
        System.out.print("Ingrse un valor para la altura: ");
        
        triangulo1.darValorDeLaAltura(in.nextInt());
        
        System.out.print("Ingrese un valor para la base: ");
        triangulo1.darValorDeLaBase(in.nextInt());
        
        System.out.println("El nuevo area es: " + triangulo1.hallarArea());
        
            System.out.println("Desea ingreser un nuevo trianulo? (1.Si, 2.No)");
            int continuar = in.nextInt(); 
            if(continuar == 1){
                System.out.println("\n Ingrse un nuevo triangulo: ");
            }else if(continuar == 2){
            break; 
            }else{
                System.out.println("Dato no valido");
                break; 
            }
        }while(true); 
    }
    
}
