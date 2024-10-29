/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Luis
 */
public class Math2 implements IExtremos{

    @Override
    public int min(int[] a) {
        int minimo = a[0];
        for(int numeros : a){
        if(numeros < minimo){
        minimo = numeros; 
        }
        }
        return minimo; 
    }

    @Override
    public int max(int[] a) {
        int maximo = a[0]; 
        for(int numero : a){
        if(numero > maximo){
        maximo = numero; 
        }
        }
        return maximo; 
    }

    @Override
    public double min(double[] a) {
        double minimoDouble = a[0]; 
        for(double numero : a){
        if(numero < minimoDouble){
        minimoDouble= numero; 
        }
        }
        return minimoDouble; 
   }

    @Override
    public double max(double[] a) {
        double maximoDouble = a[0]; 
        for(double numero : a){
        if(numero > maximoDouble){
        maximoDouble= numero; 
        }
        }
        return maximoDouble; 
    }
    
}
