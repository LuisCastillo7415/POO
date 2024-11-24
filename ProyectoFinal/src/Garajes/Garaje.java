/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Garajes;

import Excepciones.SinEspaciosDisponiblesException;
import Excepciones.LimiteDeMotosException;
import Excepciones.LimiteDeCamionesException;
import Excepciones.VehiculoNoEncontradoException;
import Vehiculos.Camion;
import Vehiculos.Camioneta;

import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Garaje implements IGaraje{
    private String departamento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String email;
    private String nombreAdministrador;
    
private ArrayList<Vehiculo> vehiculos; 
public int numeroDeEspacios; 

    public Garaje(String departamento, String ciudad, String direccion, String telefono, String email, String nombreAdministrador, ArrayList<Vehiculo> vehiculos, int numeroDeEspacios) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.nombreAdministrador = nombreAdministrador;
        this.vehiculos = new ArrayList<>();
        this.numeroDeEspacios = numeroDeEspacios;
    }


   
    public boolean alquilarEspacios(Vehiculo v) throws SinEspaciosDisponiblesException, LimiteDeMotosException, LimiteDeCamionesException{
    if(vehiculos.size() > numeroDeEspacios ){
      SinEspaciosDisponiblesException sinespacios = new SinEspaciosDisponiblesException(); 
      throw sinespacios; 
    }
    if(v instanceof Moto && calcularOcupacionPorTipoVehiculo(v) > (numeroDeEspacios * 0.20)){
    LimiteDeMotosException errormotos = new LimiteDeMotosException(); 
    throw errormotos; 
        
    }
    if(v instanceof Camion && (numeroDeEspacios < 100? calcularOcupacionPorTipoVehiculo(v) > 10 : calcularOcupacionPorTipoVehiculo(v)> 20) ){
    LimiteDeCamionesException errorcamion = new LimiteDeCamionesException(); 
    throw errorcamion; 
    }
    vehiculos.add(v); 
    return true; 
    
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
   
    //Metodo para ver la posicion de un vehiculo
    public int buscarVehiculo(Vehiculo v)throws VehiculoNoEncontradoException{
        if(vehiculos.indexOf(v) == -1){
        VehiculoNoEncontradoException errorbuscar = new VehiculoNoEncontradoException(); 
        throw errorbuscar; 
        }
    return vehiculos.indexOf(v);
    }
    
   
    //Metodo para calcular ocupacion por tipo de camion
     public void calcularOcupacionPorTipoDeCamion() {
        int contadorCamionSencillo = 0;
        int contadorCamionDoble = 0; 
        for(Vehiculo vh : vehiculos){
        if(vh instanceof Camion){
            if(((Camion) vh).getTipoDeCamion().equalsIgnoreCase("Sencillo"))
        contadorCamionSencillo ++; 
        }else if(((Camion) vh).getTipoDeCamion().equalsIgnoreCase("Doble")){
        contadorCamionDoble ++; 
        }
        }
         System.out.println("Cantidad de camiones sencillo: " + contadorCamionSencillo);
         System.out.println("Cantidad de camiones Dobles: " + contadorCamionDoble);
        }
     
     //Metodo para ver la cantidad de espacios disponibles 
     public int cantidadDePlazasDiponibles(){
     return numeroDeEspacios - vehiculos.size(); 
     }
    
     public void calcularOcupacionPorTipoDeCamioneta(){
     int contadorSuv = 0;
     int contadorCarga = 0; 
     int contadorPickup = 0;
     int contadorOtro = 0; 
     for(Vehiculo vh : vehiculos){
     if(vh instanceof Camioneta){
      if(((Camioneta)vh).getTipoDeServicio().equalsIgnoreCase("SUV")){
        contadorSuv++;
        }else if(((Camioneta) vh).getTipoDeServicio().equalsIgnoreCase("Carga")){
        contadorCarga++;
        }else if(((Camioneta) vh).getTipoDeServicio().equalsIgnoreCase("Pickup")){
        contadorPickup++;
        }else if(((Camioneta) vh).getTipoDeServicio().equalsIgnoreCase("Otro")){
        contadorOtro++;
        }
     
     }
         
     }
     
         System.out.println("Cantidad de camionetas SUV: " + contadorSuv);
         System.out.println("Cantidad de camionetas Carga: " + contadorCarga);
         System.out.println("Cantidad de camionetas Pickup: " + contadorPickup);
         System.out.println("Cantidad de camionetas Otro: " + contadorOtro);
     
     }
    
}
