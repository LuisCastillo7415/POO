/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicodeclases3;

/**
 *
 * @author ESTUDIANTES
 */
public class PruebaE {
    public static void main(String[] args) {
        
        CocheE ce = new CocheE("Nissan", "Gris", 12000, 12.5, 2023);
        CocheE ce2 = new CocheE("Toyota", "Rojo", 20000, 11.1, 2024);
        CocheE ce3 = new CocheE("Ford", "Blanco", 30000, 10.2, 2024);
        
        ce.setKm(150);
        ce2.setKm(200);
        ce3.setKm(300);
       
        
         System.out.println("Coche 1: " + ce.getMarca() + ", Color: " + ce.getColor() +
                ", Precio: " + ce.getPrecio() + ", km: " + ce.getKm() +
                ", Factor Contaminación: " + ce.getFactorContaminacion());
          System.out.println("\nCoche 2: " + ce2.getMarca() + ", Color: " + ce2.getColor() +
                ", Precio: " + ce2.getPrecio() + ", km: " + ce2.getKm() +
                ", Factor Contaminación: " + ce2.getFactorContaminacion());
           System.out.println("\nCoche 3: " + ce3.getMarca() + ", Color: " + ce3.getColor() +
                ", Precio: " + ce3.getPrecio() + ", km: " + ce3.getKm() +
                ", Factor Contaminación: " + ce3.getFactorContaminacion());
           ce.setColor("Azul");
           System.out.println("Nuevo color del coche 1: " + ce.getColor());
    }
        
        
    
}

