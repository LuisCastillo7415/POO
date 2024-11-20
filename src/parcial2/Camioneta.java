/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author Luis
 */
public class Camioneta extends Vehiculo {
    private String tipoDeServicio; 
    private int numeroDePasajeros; 
    private boolean tieneRemolque; 

    public Camioneta(String tipoDeServicio, int numeroDePasajeros, boolean tieneRemolque, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        //Valido los tipos de servicio 
        if(tipoDeServicio.equalsIgnoreCase("SUV")){
        this.tipoDeServicio = tipoDeServicio;
        }else if(tipoDeServicio.equalsIgnoreCase("Carga")){
        this.tipoDeServicio = tipoDeServicio;
        }else if(tipoDeServicio.equalsIgnoreCase("Pickup")){
        this.tipoDeServicio = tipoDeServicio;
        }else if(tipoDeServicio.equalsIgnoreCase("Otro")){
        this.tipoDeServicio = tipoDeServicio;
        }else{
            System.out.println("Tipo de servicio no valido ");
        }
        
        
       
       //Valido el numero de pasajeros con los parametros dados 
            if(this.tipoDeServicio.equalsIgnoreCase("Pickup")){
                if(this.numeroDePasajeros <= 2 || this.numeroDePasajeros >0){
        this.numeroDePasajeros = numeroDePasajeros;
                }else{
                    System.out.println("Numero de pasajeros no valido para este tipo de servicio");
                }
              }else if(this.tipoDeServicio.equalsIgnoreCase("Carga")){
                if(this.numeroDePasajeros <= 2 || this.numeroDePasajeros >0){
        this.numeroDePasajeros = numeroDePasajeros;
                }else{
                System.out.println("Numero de pasajeros no valido para este tipo de servicio");
                
                }
            }else{
              if(this.numeroDePasajeros > 0 || this.numeroDePasajeros <= 5){
              this.numeroDePasajeros = numeroDePasajeros;
              }else{
                  System.out.println("Cantidad de pasajeros no valida, numero negativo o mayor a 5");
              }
              
              }
       
        this.tieneRemolque = tieneRemolque;
        
        calcularImpuestoCirculacion(); 
        
        //Aumento la cuota mensual del garaje 
         if(tipoDeServicio.equalsIgnoreCase("SUV")){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.10)); 
        }else{
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.45)); 
        }
         
        if(numeroDePasajeros <= 2){
         setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.50)); 
        }else if(numeroDePasajeros > 2 ){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.60));
        }
        
        if(tieneRemolque == true){
        setCuotaMesGaraje(getCuotaMesGaraje() + (getCuotaMesGaraje() * 0.10));
        }
    }

    public Camioneta(String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
    }
    
     public void calcularImpuestoCirculacion(){
     setImpuestoCirculacion(getImpuestoCirculacion()+ (getImpuestoCirculacion() * 0.05));  
    
    }

    public String getTipoDeServicio() {
        return tipoDeServicio;
    }

    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }
     
     
  }

