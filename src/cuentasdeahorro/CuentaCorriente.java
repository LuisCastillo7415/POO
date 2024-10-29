/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasdeahorro;

/**
 *
 * @author Luis
 */
public class CuentaCorriente extends Cuenta {
    private double maximoRetirable; 
    
    public CuentaCorriente(double maximoRetirable, int numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
        this.maximoRetirable = maximoRetirable;
    }

    public double getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(double maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }
    
    public void retirar(double x){
    if(x > 0){
        if(x < getSaldo()){
    
        if(x <= this.maximoRetirable){
            super.retirar(x);
        }
        else{
            System.out.println("valor mayor que maximo retirable ");
        }
      }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    else{
        System.out.println("No se puede retirar el valor " + x);
    }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "maximoRetirable=" + maximoRetirable + '}' + "Cuenta{" + "numeroCuenta=" + getNumeroCuenta() + ", saldo=" + getSaldo() + ", cliente=" + getCliente() + '}';
    }
    
    
    
}
