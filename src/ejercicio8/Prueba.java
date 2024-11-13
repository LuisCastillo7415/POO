/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;
import java.util.Scanner; 
/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        //Ejercicio 8.a.13. Se necesita hacer una aplicación que gestione el almacén de Mercaregala.
        
        Scanner in = new Scanner(System.in);
        Almacen almacen = new Almacen(10);
        int opcion;
        
        do{
        System.out.println("1. - añadir productos ");
        System.out.println("2. - Listar productos ");
        System.out.println("3. - Productos en peligro");
        System.out.println("0. - Cerrar aplicacion");
        opcion = in.nextInt(); 
        in.nextLine();
        
        switch(opcion){
            case 1 -> { 
                
                System.out.println("Tipo de producto (Carne o pescado)");
                String tipo = in.nextLine(); 
                if(tipo.equalsIgnoreCase("carne")){
                    System.out.println("Nombre del producto: ");
                    String nombre = in.nextLine();
                    System.out.println("Peso: ");
                    double peso = in.nextDouble();
                    System.out.println("Precio por kilo: ");
                    double precioKilo = in.nextDouble();
                    System.out.println("Origen (vacuno o avícola): ");
                    String origen = in.next();
                    System.out.print("Tipo de carne (fresca o congelada): ");
                    String tipoCarne = in.next();
                    if(tipoCarne.equalsIgnoreCase("Fresca")){
                        System.out.println("Ingrse los dias de cadicidad: ");
                        int caducidad = in.nextInt();
                        almacen.añadirProductos(new CarneFresca(caducidad, origen, nombre, peso, precioKilo));
                    }else if(tipoCarne.equalsIgnoreCase("Congelada")){
                        System.out.println("Ingrse la empresa distribuidora: ");
                        String distribuidora = in.nextLine();
                        System.out.println("Que tipo de carne congelada es (entera o troceada)");
                        String tipoDeCarneCongelada = in.nextLine();
                        if(tipoDeCarneCongelada.equalsIgnoreCase("Entera")){
                            System.out.println("Tiene bandeja(Ingrese true en caso de si  o false en caso de no)");
                            boolean bandeja = in.nextBoolean();
                            almacen.añadirProductos(new CarnePiezaEntera(bandeja, distribuidora, origen, nombre, peso, precioKilo ));
                        }else if(tipoDeCarneCongelada.equalsIgnoreCase("Troceada")){
                            System.out.println(" Ingrese el numero de piezas: ");
                            int numeroDePiezas = in.nextInt();
                            almacen.añadirProductos(new CarnePiezaTroceada(numeroDePiezas, distribuidora, origen, nombre, peso, precioKilo));
                            
                        }
                    }
                    
                }else if(tipo.equalsIgnoreCase("Pescado")){
                    System.out.println("Nombre del producto: ");
                    String nombre = in.nextLine();
                    System.out.println("Ingrese el peso: ");
                    double peso = in.nextDouble(); 
                    System.out.println("Ingrese el precio por kilo: ");
                    double precioKilo = in.nextDouble();
                    System.out.println("Ingrese el tipo de pescado: ");
                    String tipoDePescado = in.nextLine();
                    almacen.añadirProductos(new Pescado(tipoDePescado, nombre, peso, precioKilo));
                }
              
            }
            
            case 2 -> almacen.lista();
            case 3 -> almacen.verCarnesEnPeligro();
            case 0 -> System.out.println("Cerrando programa :C"); 
        }
      }while(opcion != 0);
       
        
}
    
    
}
