/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class Almacen {
    private Producto[] almacen; 
    private int contador ;
    private int capacidad;

    public Almacen(int capacidad) {
        almacen = new Producto[capacidad];
        this.contador = 0; 
        
    }
    public void añadirProductos(Producto pdo){
    if(contador < almacen.length){
    almacen[contador++] = pdo; 
    }else{
        System.out.println("No se pueden agregar más productos D:");
    }
    
   }
    
    public void lista(){
    for(int i = 0; i < contador; i++){
    Producto pr = almacen[i]; 
        System.out.println(pr.getNombre() +", Precio: " + pr.calcularPrecio());
    }
   }
    
    public void verCarnesEnPeligro(){
    for(int i = 0; i < contador; i++){
    if(almacen[i] instanceof CarneFresca){
    CarneFresca ca = (CarneFresca) almacen[i];
    if(ca.getDiasDeCaducidad() < 5){
    
        System.out.println(ca.getNombre() + "Caduca en: " + ca.getDiasDeCaducidad());
      }
     }
        
    }
   }
}
