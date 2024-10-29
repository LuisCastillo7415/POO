/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasdeahorro;

/**
 *
 * @author Luis
 */
public class Prueba {
    public static void main(String[] args) {
        Persona cl = new Persona("Carlos", "123"); 
        
        
        
        CuentaCorriente cc = new CuentaCorriente(100, 345, cl); 
        System.out.println(cc.toString());
        cc.ingresar(1000);
        System.out.println(cc.toString());
        cc.retirar(200);
        System.out.println(cc.toString());
        cc.retirar(80);
        System.out.println(cc.toString());
        
        System.out.println("\nCuenta de ahorros");
        
        CuentaAhorros ca = new CuentaAhorros(50, 876, cl);
        System.out.println(ca.toString());
        ca.ingresar(1000);
        System.out.println(ca.toString());
        ca.retirar(980);
        System.out.println(ca.toString());
        ca.retirar(80);
        System.out.println(ca.toString());
        
    }
    
    
}
