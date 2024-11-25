/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Garajes;

import Excepciones.LimiteDeCamionesException;
import Excepciones.LimiteDeMotosException;
import Excepciones.SinEspaciosDisponiblesException;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class RedParqueaderos {
    private ArrayList<Garaje> garajes; 

    public RedParqueaderos() {
        this.garajes = new ArrayList<>();
    }
    
   public void agregarGaraje(Garaje g){
   garajes.add(g); 
   } 
   
   public boolean eliminarGaraje(Garaje g){
   return garajes.remove(g);
   }
   
   public  void actualizarGaraje(int posicion, Garaje g){
   if (posicion >= 0 && posicion < garajes.size()) {
            garajes.set(posicion, g);
        } else {
            System.out.println("Posicion incorrecta");
        }
   }
   
   //Reportes 
   public void reporteOcupacion(){
   for(Garaje g: garajes){
       System.out.println("\nCiudad del garaje: " + g.getCiudad() + ", Nombre del Administrador" + g.getNombreAdministrador() + ", Ocupacion: " + g.verOcupacion());
   }
   
   }
   public void recaudoMensual(){
   double total = 0; 
   for(Garaje g : garajes){
   double ingresos = g.calcularIngresos(); 
   total += ingresos;
   
   System.out.println("Ciudad del garaje: " + g.getCiudad() + ", Nombre del Administrador" + g.getNombreAdministrador() + ", Ingreso mensual " + ingresos);
  
   }
       System.out.println("Ingresos totales de todos los garajes: " + total );
   }
   public void lista(){
   for(Garaje v : garajes){
       System.out.println("Posicion: " + garajes.indexOf(v) + " Ubicacion: " +  v.getCiudad()+ "-" + v.getDepartamento() + " Administrador: " + v.getNombreAdministrador());
   }
   }
   
   public void agregarVehiculos(Garaje g, Vehiculo v){
        try {
            g.alquilarEspacios(v);
        } catch (SinEspaciosDisponiblesException ex) {
            System.out.println(ex.getMessage());
        } catch (LimiteDeMotosException ex) {
            System.out.println(ex.getMessage());
        } catch (LimiteDeCamionesException ex) {
            System.out.println(ex.getMessage());
        }
   }
   public void retirarVehiculos(Garaje g, String matricula){
   g.retirarVehiculos(matricula); 
   }

    public ArrayList<Garaje> getGarajes() {
        return garajes;
    }
   
}
