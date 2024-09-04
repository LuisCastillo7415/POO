/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promociondellantas;
import java.util.Scanner; 

/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class PromocionDeLlantas {

    /**
     * En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
     * del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
     * 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
     * a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
     * 40% de descuento. El precio de cada computadora es de U$500.
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Ingrese el numero de computares comprados: ");
        
        int computadores = in.nextInt(); 
        
        if (computadores < 5){
            System.out.println("Se aplica un 10% de descuento: ");
            int precio = computadores * 500; 
            double descuento = precio * 0.10; 
            double total = precio - descuento; 
            System.out.println("el precio total de su compra es de " + precio + " Menos el 10% de descuento da un total de: " + total);
        } else if (computadores >= 5) {
            if (computadores < 10 ){
                System.out.println("Se aplica un 20% de descuento");
                int precio1 = computadores* 500; 
                double descuento1 = precio1 * 0.20; 
                double total1 = precio1 - descuento1; 
                System.out.println("el precio total de su compra es es de " + precio1 + " Menos el 20% de descuento da un total de " + total1);
                
            }else{
                System.out.println("Se aplica un 40% de descuento");
                int precio2 = computadores * 500; 
            double descuento2 = precio2 * 0.40; 
            double total2 = precio2 - descuento2;
             System.out.println("el precio total de su compra es es de " + precio2 + " Menos el 40% de descuento da un total de " + total2);
                
            }
            
        }
    }
    
    
}
