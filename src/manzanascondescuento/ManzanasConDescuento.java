/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manzanascondescuento;
import java.util.Scanner; 

/**
 *
 * @author Luis Fernando Castillo Salazar 20241222068
 */
public class ManzanasConDescuento {

    /**
     * Una frutería ofrece las manzanas con descuento según la siguiente tabla:
       NUM. DE KILOS COMPRADOS % DESCUENTO
       0 - 2                        0%
       2.01 - 5                     10%
       5.01 - 10                    15%
       10.01 en adelante            20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
* Tomando como precio por kilo 2$ 
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de kilos de manzana comprados: ");
        double kilos = in.nextDouble(); 
        
        if(kilos <= 2){
            System.out.println("No se aplica descuento");
            double precio = kilos * 2; 
            
            System.out.println("El total de su compra es: " + precio);
        }else if (kilos >= 2.01){
           
            if(kilos <= 5){
                
                System.out.println("Se aplica un 10% de descuento");
                
                double precio1 = kilos * 2;
                double descuento = precio1 * 0.10;
                double total = precio1 - descuento; 
                
                System.out.println("El total de su compra con descuento es: " + total);
            }else if(kilos >= 5.01){
           
                if(kilos < 10){ 
                   System.out.println("Se aplica un 15% de descuento"); 
                   
                   double precio2 = kilos * 2;
                   double descuento2 = precio2 * 0.25; 
                   double total2 = precio2 - descuento2; 
                    System.out.println("El total de su compra con descuento es: " + total2);
                }else {
                    
                    System.out.println("Se aplica un 20% de descuento");
                    
                    double precio3 = kilos *2; 
                    double descuento3 = precio3 * 0.20; 
                    double total3 = precio3 - descuento3; 
                    
                    System.out.println("El total de su compra con descuento es: " + total3);
                }
                
                 
                }
        }
        
    }
    
}
