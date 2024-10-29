/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Luis
 */
public class CopiarDatosDeUnArray {
    public static void main(String[] args) {
            /*Si tenemos de inicio un array int[] miarray = {8,2,5,4,9,1,0,8,9,3}
             construir un programa que copie miarray en otro array llamado copiaDeDatos,
             pero sumando 2 a cada elemento, y que escriba el array copiaDeDatos por pantalla,
             esto es, que salga : "el elemento 1 de copiadedatos es 10"
        */
        int[] miarray = {8,2,5,4,9,1,0,8,9,3};
        int [] copiaDeDatos = new int[miarray.length]; 
        
        for(int i = 0; i < miarray.length; i++){
            copiaDeDatos[i] = miarray[i] + 2; 
        }
         for(int i = 0; i < copiaDeDatos.length; i++){
             System.out.println("el elemento elemento " + (i) + " de copia de datos es " + copiaDeDatos[i]);
         }   
    }
}
