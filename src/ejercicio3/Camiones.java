/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luis
 */
public class Camiones extends Vehiculo {
    private int numeroDeEjes; 
    private double tamañoDelRemolque; 

    public Camiones(int numeroDeEjes, double tamañoDelRemolque, double precioCompra, String marca, double precioVenta) {
        super(precioCompra, marca, precioVenta);
        this.numeroDeEjes = numeroDeEjes;
        this.tamañoDelRemolque = tamañoDelRemolque;
    }

    @Override
    public double precioVenta() {
       double precioVenta = (getPrecioCompra() + (getPrecioCompra() * 0.6)) * this.numeroDeEjes;
       return precioVenta; 
    }

    @Override
    public String toString() {
        return "Camiones{" + "numeroDeEjes=" + numeroDeEjes + ", tama\u00f1oDelRemolque=" + tamañoDelRemolque + '}' + "precioCompra=" + getPrecioCompra() + ", marca=" + getMarca() + ", precioVenta=" + getPrecioVenta() + '}';
    }
    
}
