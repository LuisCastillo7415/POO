/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Excepciones.LimiteDeCamionesException;
import Excepciones.LimiteDeMotosException;
import Excepciones.SinEspaciosDisponiblesException;
import Excepciones.VehiculoNoEncontradoException;
import Garajes.Garaje;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luis
 */
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        Garaje garaje = new Garaje("", "", "", "", "", "", new ArrayList<>(), 20); 
        int opcion; 
        
        do{
        System.out.println("    Menu del Garaje");
        System.out.println("1.-Alquilar un espacio");
        System.out.println("2.- Retirar Vehiculo");
        System.out.println("3.- Consular ingresos mensuales");
        System.out.println("4.- Consultar proporcion Autos/Motos/Camiones/Camionetas");
        System.out.println("5.- Listado de matrículas, cuota mensual y tipo vehículo");
            System.out.println("6.- Buscar vehiculo");
            System.out.println("7.- Ver cantidad por tipo de camion");
            System.out.println("8.- Ver la cantidad de espacios disponibles ");
            System.out.println("9.- Consultar la cantidad de vehiculos de un tipo");
            System.out.println("10.- Consulatar cantidad de caionetas por tipo de servicio");
        System.out.println("0.- Salir");
        opcion = in.nextInt(); 
        in.nextLine(); 
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el tipo de vehiculo: ");
                String tipoVehiculo = in.nextLine(); 
                System.out.println("Ingrese la amarca: ");
                String marca = in.nextLine(); 
                System.out.println("Ingrese el precio: ");
                double precio = in.nextDouble();
                System.out.println("Ingrese el cilindraje: ");
                int cilindraje = in.nextInt(); 
                if(tipoVehiculo.equalsIgnoreCase("Moto")){
                    System.out.println("¿Tiene sidecar? (ingrese true o false)");
                    boolean tieneSidecar = in.nextBoolean(); 
                    Moto m = new Moto(tieneSidecar, marca, precio, cilindraje);
                    in.nextLine(); 
                    
                    System.out.println("Ingrese la matricula del vehiculo: ");
                    String matricula = in.nextLine(); 
                    if(m.matricular(matricula)){
                        try {
                            if(garaje.alquilarEspacios(m)){
                                System.out.println("Espacio alquilado correctamente");
                            }   } catch (SinEspaciosDisponiblesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeMotosException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeCamionesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        System.out.println("Matricula no valida");
                    }
                
                }else if(tipoVehiculo.equalsIgnoreCase("Auto")){
                    System.out.println("¿Tiene radio? (ingrese true or false)");
                    boolean tieneRadio = in.nextBoolean(); 
                    System.out.println("¿Tiene navegador? (ingrese true o false)");
                    boolean tieneNavegador = in.nextBoolean(); 
                    Auto a = new Auto(tieneRadio, tieneNavegador, marca, precio, cilindraje);
                    in.nextLine(); 
                    
                    System.out.println("Ingrese la matricula del vehiculo: ");
                    String matricula = in.nextLine(); 
                    if(a.matricular(matricula)){
                        try {
                            if(garaje.alquilarEspacios(a)){
                                System.out.println("Espacio alquilado correctamente");
                            }   } catch (SinEspaciosDisponiblesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeMotosException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeCamionesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        System.out.println("Matricula no valida");
                    }
                 
                    //Agrego camion a los tipos de vehiculo que se pueden ingresar por el usuario
                }else if(tipoVehiculo.equalsIgnoreCase("Camion")){
                    in.nextLine();
                    System.out.println("Ingrese el tipo de camion (Sencillo o doble): ");
                    String tipoDeCamion = in.nextLine(); 
                    System.out.println("Ingrese el numero de ejes: ");
                    int numeroDeEjes = in.nextInt(); 
                    System.out.println("Ingrese la capacidad de carga: ");
                    double capacidadDeCarga = in.nextDouble(); 
                    Camion cam = new Camion(numeroDeEjes, tipoDeCamion, capacidadDeCarga, marca, precio, cilindraje);
                     in.nextLine(); 
                     
                    //Aplico el metoco matricular a camion
                    System.out.println("Ingrese la matricula del vehiculo: ");
                    String matricula = in.nextLine(); 
                    if(cam.matricular(matricula)){
                        try {
                            if(garaje.alquilarEspacios(cam)){
                                System.out.println("Espacio alquilado correctamente");
                            }else{
                                System.out.println("Sin espacios disponibles :( ");
                            }   } catch (SinEspaciosDisponiblesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeMotosException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LimiteDeCamionesException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }else{
                        System.out.println("Matricula no valida");
                    }
                    
                    
                }else if(tipoVehiculo.equalsIgnoreCase("Camioneta")){
                in.nextLine();
                    System.out.println("Ingrese el tipo de servicio (SUV, Carga, Pickup u otro): ");
                String tipoDeServicio = in.nextLine(); 
                    System.out.println("Ingrese el numero de pasajeros: ");
                    int numeroDePasajeros = in.nextInt();
                    in.nextLine(); 
                    System.out.println("Tiene remolque? (true o false): ");
                    boolean tieneRemolque = in.nextBoolean(); 
                    Camioneta cmt = new Camioneta(tipoDeServicio, numeroDePasajeros, tieneRemolque, marca, precio, cilindraje);
                    in.nextLine();
                    
                     System.out.println("Ingrese la matricula del vehiculo: ");
                    String matricula = in.nextLine(); 
                    if(cmt.matricular(matricula)){
                    try {
                        if(garaje.alquilarEspacios(cmt)){
                            System.out.println("Espacio alquilado correctamente");
                        }else{
                            System.out.println("Sin espacios disponibles :( ");
                        }
                    } catch (SinEspaciosDisponiblesException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LimiteDeMotosException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LimiteDeCamionesException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }else{
                        System.out.println("Matricula no valida");
                    }
                    
                }else{
                    System.out.println("Tipo de vehiculo no valido");
                }
                break; 
            case 2: 
                System.out.println("Introduce la placa del vehiculo que desea retirar: ");
               String placaVehiculoRetirar = in.nextLine(); 
               for(Vehiculo v : garaje.getVehiculos()){
                   if(v.getPlaca().equals(placaVehiculoRetirar)){
                   if(garaje.retirarVehiculos(v)){
                       System.out.println("Vehiculo retirado exitosamente");
                       break; 
                   } 
                   }else 
                       System.out.println("No se pudo retirar");
               
               }
               break; 
            case 3: 
                System.out.println("Los ingresos mensuales son: " + garaje.calcularIngresos());
                break; 
                
            case 4: 
                int cantidadDeMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto(false, "", 0, 0));
                int cantidadDeAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto(false, false, "", 0, 0));
                
                //Agrego camion a la proporcion de autos/motos, siend ahora autos/motos/camion
                int cantidadDeCamiones = garaje.calcularOcupacionPorTipoVehiculo(new Camion("", 0, 0));
                int cantidadDeCamionetas = garaje.calcularOcupacionPorTipoVehiculo(new Camioneta("", 0 , 0)); 
                System.out.println("La proporcion autos/motos/camiones/Camionetas es:  " + cantidadDeAutos + "/" + cantidadDeMotos + "/" + cantidadDeCamiones + "/" + cantidadDeCamionetas);
                break; 
            case 5: 
                System.out.println("Listado de Vehiculos: ");
                garaje.lista();
                break;
                
                //Agrego la opcion buscar vehiculo
            case 6: 
                 System.out.println("Introduce la placa del vehiculo que desea buscar: ");
               String placaVehiculoBuscar = in.nextLine(); 
               for(Vehiculo v : garaje.getVehiculos()){
                   if(v.getPlaca().equals(placaVehiculoBuscar)){
                    
                       try {
                           System.out.println("Vehiculo en posicion: " + garaje.buscarVehiculo(v)); 
                           break;
                       } catch (VehiculoNoEncontradoException ex) {
                           Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                       }
                   }else
                       System.out.println("-99");
               }
                   
                       break;
            case 7: 
                garaje.calcularOcupacionPorTipoDeCamion();
                break; 
            case 8: 
                System.out.println("Cantidad de espacios disponibles: " + garaje.cantidadDePlazasDiponibles());
                
                break; 
            case 9: 
                int cantidadIndividualMotos = garaje.calcularOcupacionPorTipoVehiculo(new Moto(false, "", 0, 0));
                int cantidadadIndividualAutos = garaje.calcularOcupacionPorTipoVehiculo(new Auto(false, false, "", 0, 0));
               int cantidadIndividualCamiones = garaje.calcularOcupacionPorTipoVehiculo(new Camion( "", 0, 0));
                int cantidadIndividualCamionetas = garaje.calcularOcupacionPorTipoVehiculo(new Camioneta("", 0, 0)); 
                System.out.println("Ingrese el tipo de vehiculo: ");
                String claseDelVehiculo = in.nextLine(); 
                if(claseDelVehiculo.equalsIgnoreCase("Moto")){
                    System.out.println("Cantidad de motos: " + cantidadIndividualMotos);
                }else if(claseDelVehiculo.equalsIgnoreCase("Auto")){
                    System.out.println("Cantidad de autos: " + cantidadadIndividualAutos);
                }else if(claseDelVehiculo.equalsIgnoreCase("Camion")){
                    System.out.println("Cantidad de camiones: " + cantidadIndividualCamiones );
                }else if(claseDelVehiculo.equalsIgnoreCase("Camioneta")){
                    System.out.println("CAntidad de camionetas: " + cantidadIndividualCamionetas );
                
                }else{
                    System.out.println("Tipo de vehiculo no valido");
                }
                break; 
            case 10: 
                garaje.calcularOcupacionPorTipoDeCamioneta();
                break; 
           
            case 0: 
                System.out.println("Cerrando el programa...");
        }
        }while(opcion != 0); 
        
     
    }
}
