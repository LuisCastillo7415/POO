/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentasdeahorro;

/**
 *
 * @author Luis
 */
public class CuentaAhorros extends Cuenta {
    private double saldoMinimo; 

    public CuentaAhorros(double saldoMinimo, int numeroCuenta, Persona cliente) {
        super(numeroCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    
    public void retirar(double x){
    if(x > 0){
        if(x < getSaldo()){
    
        if((getSaldo() -x) > this.saldoMinimo ){
            super.retirar(x);
        }
        else{
            System.out.println("Valor sobrepasa el saldo minimo ");
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
        return "CuentaCorriente{" + "saldoMinimo=" + saldoMinimo + '}' + "Cuenta{" + "numeroCuenta=" + getNumeroCuenta() + ", saldo=" + getSaldo() + ", cliente=" + getCliente() + '}';
    } 
    
}
