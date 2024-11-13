/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;
import java.util.Scanner; 
/**
 *
 * @author Luis
 */
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        Garaje garaje = new Garaje(); 
        int opcion; 
        
        do{
        System.out.println("    Menu del Garaje");
        System.out.println("1.-Alquilar un espacio");
        System.out.println("2.- Retirar Vehiculo");
        System.out.println("3.- Consular ingresos mensuales");
        System.out.println("4.- Consultar proporcion Autos/Motos");
        System.out.println("5.- Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("6.- Buscar vehiculo");
            System.out.println("7.- Ver cantidad por tipo de camion");
            System.out.println("8.- Ver la cantidad de espacios disponibles ");
        System.out.println("0.- Salir");
        opcion = in.nextInt(); 
        in.nextLine(); 
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el tipo de vehiculo: ");
                String tipoVehiculo = in.nextLine(); 
                System.out.println("Ingrese l amarca: ");
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
                    if(garaje.alquilarEspacios(m)){ 
                        System.out.println("Espacio alquilado correctamente");
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
                    if(garaje.alquilarEspacios(a)){
                        System.out.println("Espacio alquilado correctamente");
                    }
                    }else{
                        System.out.println("Matricula no valida");
                    }
                 
                    //Agrego camion a los tipos de vehiculo que se pueden ingresar por el usuario
                }else if(tipoVehiculo.equalsIgnoreCase("Camion")){
                    in.nextLine();
                    System.out.println("Ingrese el tipo de camion: ");
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
                    if(garaje.alquilarEspacios(cam)){
                        System.out.println("Espacio alquilado correctamente");
                    }else{
                        System.out.println("Sin espacios disponibles :( ");
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
                int cantidadDeCamiones = garaje.calcularOcupacionPorTipoVehiculo(new Camion(0, "", 0, "", 0, 0));
                System.out.println("La proporcion autos/motos/camiones es:  " + cantidadDeAutos + "/" + cantidadDeMotos + "/" + cantidadDeCamiones);
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
                    
                       System.out.println("Vehiculo en posicion: " + garaje.buscarVehiculo(v));
                   }else
                       System.out.println("-1");
               }
                   
                       break;
            case 7: 
                garaje.calcularOcupacionPorTipoDeCamion();
                break; 
            case 8: 
                System.out.println("Cantidad de espacios disponibles: " + garaje.cantidadDePlazasDiponibles());
                
                break; 
            case 0: 
                System.out.println("Cerrando el programa...");
        }
        }while(opcion != 0); 
        
    }
}
