/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luis
 */
public class Coches extends Vehiculo{
    private int numeroDePuertas; 

    public Coches(int numeroDePuertas, double precioCompra, String marca, double precioVenta) {
        super(precioCompra, marca, precioVenta);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public double precioVenta() {
       double precioVenta = getPrecioCompra() + (getPrecioCompra() * 0.6);
       return precioVenta; 
    }

    @Override
    public String toString() {
        return "Coches{" + "numeroDePuertas=" + numeroDePuertas + "precioCompra=" + getPrecioCompra() + ", marca=" + getMarca() + ", precioVenta=" + getPrecioVenta() + '}';
    }
    
    
}
