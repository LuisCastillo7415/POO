/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Garaje implements IGaraje{
private ArrayList<Vehiculo> vehiculos; 
public static final int NUMERODEESPACIOS = 20; 


    public Garaje() {
        this.vehiculos = new ArrayList<>();
    }
    public boolean alquilarEspacios(Vehiculo v){
    if(vehiculos.size() < NUMERODEESPACIOS || v.getPlaca() != null){
        if(v instanceof Moto){
               if( calcularOcupacionPorTipoVehiculo(v) < (NUMERODEESPACIOS * 0.80) ){
                   vehiculos.add(v); 
                   return true; 
        }
            //Punto 2, inciso b.
            //Valido que la cantidad de camiones no sobrepase el 10% de espacios
        if(v instanceof Camion){ 
            if((0.10 * NUMERODEESPACIOS) >= calcularOcupacionPorTipoVehiculo(v) ){
                vehiculos.add(v); 
                return true;
            }else{
                return false;
            }
        }else{
        return false; 
        }
        }else if(v instanceof Auto){
        vehiculos.add(v); 
           return true;
        }else{
        return false; 
        }
    }
    return false; 
    }

    @Override
    public double calcularIngresos() {
        int ingresos = 0; 
        for(Vehiculo vh : vehiculos){
        ingresos += vh.getCuotaMesGaraje(); 
        }
        return ingresos; 
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int contadorTipoVehiculo = 0;
        for(Vehiculo vh : vehiculos){
        if(vh.getClass() == v.getClass()){
        contadorTipoVehiculo++; 
        }
        }
        return contadorTipoVehiculo; 
        }
    public boolean retirarVehiculos(Vehiculo v){
    return vehiculos.remove(v); 
    }
    public void lista(){
    for(Vehiculo v : vehiculos){
        System.out.println("Tipo de Vehiculo:" + v.getClass().getSimpleName()+ ", Placa: " + v.getPlaca() + ", Cuota mensual del garaje: " + v.getCuotaMesGaraje());
    }
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    //Punto 2, inciso a.
    //Metodo para ver la posicion de un vehiculo
    public int buscarVehiculo(Vehiculo v){
    return vehiculos.indexOf(v);
    }
    
    //Punto 2, inciso d.
    //Metodo para calcular ocupacion por tipo de camion
     public void calcularOcupacionPorTipoDeCamion() {
        int contadorCamionSencillo = 0;
        int contadorCamionDoble = 0; 
        for(Vehiculo vh : vehiculos){
        if(vh instanceof Camion){
            if(((Camion) vh).getTipoDeCamion().equalsIgnoreCase("Sencillo"))
        contadorCamionSencillo ++; 
        }
        if(((Camion) vh).getTipoDeCamion().equalsIgnoreCase("Doble")){
        contadorCamionDoble ++; 
        }
        }
         System.out.println("Cantidad de camiones sencillo: " + contadorCamionSencillo);
         System.out.println("Cantidad de camiones Dobles: " + contadorCamionDoble);
        }
     //Punto 2, inciso e
     //Metodo para ver la cantidad de espacios disponibles 
     public int cantidadDePlazasDiponibles(){
     return NUMERODEESPACIOS - vehiculos.size(); 
     }
    
}
