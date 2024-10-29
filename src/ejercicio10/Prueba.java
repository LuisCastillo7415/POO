/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        CajaRegistradora cr = new CajaRegistradora("Caja1", 5, 20); 
        Scanner in = new Scanner(System.in); 
        int opcion; 
        do{
        System.out.println("1. Ingresar monedas");
        System.out.println("2. Listar Contenido");
        System.out.println("3. Mostrar saldo");
        System.out.println("0. Salir");
        System.out.println("Ingrese su opcion: ");
        opcion = in.nextInt(); 
        in.nextLine(); 
        
        switch(opcion){
            case 1: 
                System.out.println("Ingrese la cantidad : ");
                int cantidad = in.nextInt();
                System.out.println("Ingrese el tipo (1, 2, 3, 4 o 5)");
                int tipo = in.nextInt(); 
                System.out.println(cr.meterMonedas(tipo, cantidad));
                cr.setUnidadesTipoMoneda(cr.getUnidadesTipoMoneda() + cantidad);
                break; 
            case 2: 
                System.out.println(cr.toString());
                break; 
            case 3: 
                System.out.println("Saldo: " + cr.getUnidadesTipoMoneda());
                break; 
        }
       }while(opcion != 0); 
    }
}
