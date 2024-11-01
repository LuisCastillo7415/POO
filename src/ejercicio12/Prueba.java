/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        //8.a.6. Eva necesita gestionar una empresa agroalimentaria
        
        ProductosFrescos pf1 = new ProductosFrescos(20, "Afganistan", 30, 2234); 
          ProductosFrescos pf2 = new ProductosFrescos(20, "Noruega", 40, 3342); 
          System.out.println("Productos Frescos");
          System.out.println(pf1.toString());
          System.out.println("\n" + pf2.toString());
          
          ProductosRefrigerados rf1 = new ProductosRefrigerados(33454, 5, 24.4, "Peru", 30, 3224); 
           ProductosRefrigerados rf2 = new ProductosRefrigerados(55674, 10, 25.6, "Chile", 40, 5564); 
            ProductosRefrigerados rf3 = new ProductosRefrigerados(99987, 11, 30.1, "Argentina", 25, 7785 ); 
            System.out.println("\n Productos Refrigerados");
            System.out.println("\n" + rf1.toString());
            System.out.println("\n" + rf2.toString());
            System.out.println("\n" + rf3.toString());
            
            CongeladosPorAgua cd = new CongeladosPorAgua(34.5, 30, 20, "Venezuela", 10, 9983); 
             CongeladosPorAgua cd2 = new CongeladosPorAgua(40.5, 25, 15, "Italia", 20, 77652); 
             System.out.println("\nProductos Congelados por Agua");
             System.out.println("\n" + cd.toString());
             System.out.println("\n" + cd2.toString());
            
              CongeladosPorAire ca = new CongeladosPorAire(34.7, 25.4, 17.6, 30.2, 20, 34.5, "Australia", 40, 2232); 
             CongeladosPorAire ca2 = new CongeladosPorAire(28.5, 40.4, 36.6, 19.5, 30, 26.1, "Corea", 30, 5563); 
             System.out.println("\n Productos congelados por Aire");
             System.out.println("\n" + ca.toString());
             System.out.println("\n" + ca2.toString());
             
              CongeladosPorNitrogeno cn = new CongeladosPorNitrogeno("Congelado con Nitrogeno :v", 3600, 30, 5, "Marruecos", 35, 4453);
              System.out.println("\nProductos congelados por Nitrogeno");
              System.out.println("\n" + cn.toString());
              
              
    }
   
}
