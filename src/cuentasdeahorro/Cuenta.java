/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasdeahorro;

/**
 *
 * @author Luis
 */
public abstract class Cuenta {
    private int numeroCuenta;
    private double saldo = 0; 
    private Persona cliente; 

    public Cuenta(int numeroCuenta, Persona cliente) {
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    public void ingresar(double x){
    if(x>0){
        this.saldo += x; 
        }
    else{
        System.out.println("No se puede ingresar el valor: " + x);
    }
    }
    
    public void retirar(double x){
    if(x > 0){
        if(x <= this.saldo){
        this.saldo -= x; 
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    else{
        System.out.println("No se puede retirar el valor " + x);
    }
    }
}
