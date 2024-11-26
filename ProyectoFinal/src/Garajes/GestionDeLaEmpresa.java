/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Garajes;

import Vehiculos.Auto;
import Vehiculos.Camion;
import Vehiculos.Camioneta;
import Vehiculos.Moto;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class GestionDeLaEmpresa {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        RedParqueaderos garajes = new RedParqueaderos(); 
        
        int opcion; 
        do{
        System.out.println("\nGestion de la empresa. Ingrese una opcion: ");
        System.out.println("1. Crear Garaje");
        System.out.println("2. Eliminar Garaje");
        System.out.println("3. Actualizar Garaje");
        System.out.println("4. Ver listado de garajes");
        System.out.println("5. Ingresar Vehiculo");
        System.out.println("6. Retirar Vehiculo");
        System.out.println("7. Informe de Ocupacion");
        System.out.println("8. Informe de Recaudo Mensual");
        System.out.println("9. Ocupacion por un tipo de vehiculo");
        System.out.println("0. Salir");
        System.out.println("Elija una opcion:");
            opcion = in.nextInt();
            in.nextLine();
            
            switch(opcion){
                case 1: 
                    System.out.println("Ingrese el departamento: ");  
                    String departamento = in.nextLine(); 
                    System.out.println("Ingrese la ciudad: ");
                    String ciudad = in.nextLine();
                    System.out.println("Ingrese la direccion: ");
                    String direccion = in.nextLine();
                    System.out.println("Ingrese el telefono: ");
                    String telefono = in.nextLine();
                    System.out.println("Ingrese el email: ");
                    String email = in.nextLine();
                    System.out.println("Ingrese el nombre del administrador: ");
                    String administrador = in.nextLine();
                    System.out.println("Ingrese el número de espacios: ");
                    int numeroEspacios = in.nextInt();
                    in.nextLine(); 
                    
                    Garaje g = new Garaje(departamento, ciudad, direccion, telefono, email, administrador, numeroEspacios); 
                    garajes.agregarGaraje(g); 
                    System.out.println("Garaje agregado ");
                    break;
                    
                case 2: 
                    System.out.println("Ingrese la posicion del garaje a eliminar");
                    int posicion = in.nextInt(); 
                  if(garajes.eliminarGaraje(garajes.getGarajes().get(posicion))){
                      System.out.println("Garaje eliminado");
                  
                  } else{
                      System.out.println("Garaje no encontrado");
                  }
                    break; 
                case 3:
                    System.out.println("Ingrese la posicion del garaje que desea actualizar: ");
                   int posicionActualizar = in.nextInt(); 
                   in.nextLine();
                   
                    System.out.println("Ingrese el nuevo departamento: ");
                    String nuevoDepartamento = in.nextLine();
                    System.out.println("Ingrese la nueva ciudad: ");
                    String nuevaCiudad = in.nextLine();
                    System.out.println("Ingrese la nueva direccion: ");
                    String nuevaDireccion = in.nextLine();
                    System.out.println("Ingrese el nuevo telefono: ");
                    String nuevoTelefono = in.nextLine();
                    System.out.println("Ingrese el nuevo email: ");
                    String nuevoEmail = in.nextLine();
                    System.out.println("Ingrese el nuevo nombre del administrador: ");
                    String nuevoAdministrador = in.nextLine();
                    System.out.println("Ingrese el nuevo numero de espacios: ");
                    int nuevoNumeroEspacios = in.nextInt();
                    in.nextLine();  
                    
                    Garaje nuevoGaraje = new Garaje(nuevoDepartamento,nuevaCiudad, nuevaDireccion,nuevoTelefono, nuevoEmail, nuevoAdministrador, nuevoNumeroEspacios ); 
                    garajes.actualizarGaraje(posicionActualizar, nuevoGaraje);
                    break; 
                case 4: 
                    System.out.println("\n Listado de Garajes");
                    garajes.lista();
                    break; 
                case 5: 
                    System.out.println("Ingrese la posicion del garaje: ");
                    int posicion1 = in.nextInt(); 
                    in.nextLine();
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
                        Garaje gj = garajes.getGarajes().get(posicion1);
                        garajes.agregarVehiculos(gj, m);
                        System.out.println("Espacio alquilado correctamente");
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
                        Garaje gj = garajes.getGarajes().get(posicion1);
                        garajes.agregarVehiculos(gj, a);
                        System.out.println("Espacio alquilado correctamente");
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
                        Garaje gj = garajes.getGarajes().get(posicion1);
                        garajes.agregarVehiculos(gj, cam);
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
                        Garaje gj = garajes.getGarajes().get(posicion1);
                        garajes.agregarVehiculos(gj, cmt);
                    }else{
                        System.out.println("Matricula no valida");
                    }
                    
                }else{
                    System.out.println("Tipo de vehiculo no valido");
                }
                break; 
                case 6: 
                    System.out.println("Ingrese la posicion del garaje: ");
                    int posicionRetirar = in.nextInt(); 
                    in.nextLine(); 
                    System.out.println("Introduce la placa del vehiculo que desea retirar: ");
               String placaVehiculoRetirar = in.nextLine(); 
               Garaje gaj = garajes.getGarajes().get(posicionRetirar); 
               garajes.retirarVehiculos(gaj, placaVehiculoRetirar);
               break; 
                case 7: 
                    garajes.reporteOcupacion();
                    break; 
                case 8: 
                    garajes.recaudoMensual();
                    break; 
                case 9: 
                    System.out.println("Ingrese la posicion del garaje: ");
                    int posicionn = in.nextInt(); 
                    in.nextLine(); 
                    Garaje j = garajes.getGarajes().get(posicionn);
                   
                      int cantidadIndividualMotos = garajes.ocupacion(j, new Moto(false, "", 0, 0));
                int cantidadadIndividualAutos = garajes.ocupacion(j,new Auto(false, false, "", 0, 0));
               int cantidadIndividualCamiones = garajes.ocupacion(j,new Camion( "", 0, 0));
                int cantidadIndividualCamionetas = garajes.ocupacion(j,new Camioneta("", 0, 0)); 
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

                case 0: 
                    System.out.println("Cerrando el programa :c");
                    
                    
            }
        }while(opcion != 0);
    }
}
