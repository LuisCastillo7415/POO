/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author Luis
 */
public class Clase implements IRelaciones{
    private double numero; 

    public Clase(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }
    

    @Override
    public boolean esMayor(Object b) {
        if(b instanceof Clase){
        return this.numero> ((Clase) b).numero; 
        }
        return false; 
     }

    @Override
    public boolean esMenor(Object b) {
         if(b instanceof Clase){
        return this.numero < ((Clase) b).numero; 
        }
         return false; 
    }

    @Override
    public boolean esIgual(Object b) {
         if(b instanceof Clase){
        return this.numero == ((Clase) b).numero; 
        }
         return false; 
         
    }
}
