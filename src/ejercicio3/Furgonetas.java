/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luis
 */
public class Furgonetas extends Vehiculo {
    private double capaidadDeCarga; 

    public Furgonetas(double capaidadDeCarga, double precioCompra, String marca, double precioVenta) {
        super(precioCompra, marca, precioVenta);
        this.capaidadDeCarga = capaidadDeCarga;
    }

    @Override
    public double precioVenta() {
        double precioVenta;
        if(this.capaidadDeCarga > 10){
         precioVenta = (getPrecioCompra() + (getPrecioCompra() * 0.6)) + (getPrecioCompra() * 0.2) ;
        }else{
        precioVenta = getPrecioCompra() + (getPrecioCompra() * 0.6);
        }
          return precioVenta;   
    }

    @Override
    public String toString() {
        return "Furgonetas{" + "capaidadDeCarga=" + capaidadDeCarga + "precioCompra=" + getPrecioCompra() + ", marca=" + getMarca() + ", precioVenta=" + getPrecioVenta() + '}';
    }
    
    
}
