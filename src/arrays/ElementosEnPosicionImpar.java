/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * Dado un array int[] vectorDeDatos = {8,2,5,4,9,1,0,8,9,3} escribir por consola solo los elementos de
posición impar, no los que tengan valor impar, sino los que están en posición (indice) impar
 */
public class ElementosEnPosicionImpar {
    public static void main(String[] args) {
        int[] vectorDeDatos = {8,2,5,4,9,1,0,8,9,3};
        System.out.println("Los elementos en posicion impar son: ");
        for(int i = 0; i < vectorDeDatos.length; i++){
            
            if(i % 2 != 0 ){
                
                System.out.print(vectorDeDatos[i] + " ");
            }
        }
        
        
    }
}
