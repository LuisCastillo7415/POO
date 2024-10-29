/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Luis
 */
public abstract class Vehiculo {
    private double precioCompra; 
    private String marca; 
    private double precioVenta; 

    public Vehiculo(double precioCompra, String marca, double precioVenta) {
        this.precioCompra = precioCompra;
        this.marca = marca;
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public abstract double precioVenta(); 

    @Override
    public String toString() {
        return "Vehiculo{" + "precioCompra=" + precioCompra + ", marca=" + marca + ", precioVenta=" + precioVenta + '}';
    }
    
}
