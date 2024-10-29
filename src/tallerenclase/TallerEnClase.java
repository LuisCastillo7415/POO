/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tallerenclase;
import java.util.Scanner;
/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class TallerEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Se declara el escaner y las variables que recibira la cantidad de camiones y el tipo de servicio 
        Scanner in = new Scanner(System.in);
        int cantidadCamiones;
        double tipoServicio;
        double suma = 0; 
        double perecederos = 0; 
         
        int menosDeDosHoras = 0; 
            System.out.println("Ingrese la cantidad de camiones: ");
            cantidadCamiones = in.nextInt();
            //cantidadCamiones = (int) (Math.random() * (100 - 1)) + 1;
            //System.out.println(cantidadCamiones);
            
            
            //Se declara el array 
            double[][] datosCamiones = new double[cantidadCamiones][6];
             //Se inicia un ciclo for para llenar el array
            for(int i = 0; i < datosCamiones.length; i++){
                System.out.println("\nIngrese el tipo de servicio(1- carga o 2- descarga)");
               // Validación del dato "tipo de servicio" 
                do{
                tipoServicio = in.nextDouble();
              if(tipoServicio ==1 || tipoServicio ==2){
                  break;
              }else{
                  System.out.println("Dato invalido");
             }
             }while(true);
                
             //tipoServicio = (int) (Math.random() * (2 - 1)) + 1;
                //System.out.println(tipoServicio);
                
                
               //Se inicia un switch ya que depiendo del tipo de servicio usaremos unos datos y otros no
               switch((int)tipoServicio){
                        case 1 -> {
                            System.out.println("Ingrese el tiempo de permanencia (horas): ");
                            datosCamiones[i][3] = in.nextDouble();
                            //datosCamiones[i][3] = (int) (Math.random() * (50 - 1)) + 1;
                            
                            System.out.println("Ingrese el largo del camion (metros): ");
                            datosCamiones[i][4]= in.nextDouble();
                            //datosCamiones[i][4] = (int) (Math.random() * (20 - 1)) + 1;
                            
                           //mediante if se determina el costo del parqueadero, 
                           //teniendo en cuenta que las dos primeras horas son gratis
                            if(datosCamiones[i][3]>2){
                                if(datosCamiones[i][4]>4){
                                    datosCamiones[i][5] = (datosCamiones[i][3]-2)*(4000 + (4000*0.25));
                                }else{
                                    datosCamiones[i][5] = (datosCamiones[i][3]-2)*4000;
                                }
                            }else{
                                menosDeDosHoras++;
                                System.out.println("Parqueadero Gratis");
                            }
                            
                            suma +=  datosCamiones[i][5]; 
                            
                }
                        case 2 -> {
                            System.out.println("Ingrese el tipo de producto (1- perecedero o 2- no perecedero)");
                            //validación del dato "tipo de producto"
                            do{
                            datosCamiones[i][1] = in.nextDouble();
                            //datosCamiones[i][1] = (int) (Math.random() * (2 - 1)) + 1;
                            
                            //Validación del dato "tipo de producto"
                            if(datosCamiones[i][1]==1 || datosCamiones[i][1]==2){
                            break; 
                            }else{
                                System.out.println("Dato no valido");
                            }
                            }while(true); 
                            
                            System.out.println("Ingrese el peso transportado (toneladas): ");
                            datosCamiones[i][2]= in.nextDouble();
                            //datosCamiones[i][2] = (int) (Math.random() * (50 - 1)) + 1;
                            
                            //Se determina el precio teniendo en cuenta el tipo de producto y el precio por cada tonelada
                            if(datosCamiones[i][1] == 1){
                                if(datosCamiones[i][2]<8){
                                    datosCamiones[i][5] = datosCamiones[i][2]*15000;
                                }
                                else{
                                    datosCamiones[i][5] = datosCamiones[i][2]*9000;
                                }
                                perecederos += datosCamiones[i][5]; 
                            }else{
                                if(datosCamiones[i][2]<8){
                                    datosCamiones[i][5] = 60000;
                                }else{
                                    datosCamiones[i][5] = 60000 + (datosCamiones[i][2]-10)*7000;
                                }
                               
                            }
                            suma += datosCamiones[i][5]; 
                }
            }
                System.out.println("servicio  producto   peso      tiempo      largo      costo");
       
               for(int c = 0; c < cantidadCamiones; c++){
                   System.out.println(" ");
               for(int d = 0; d < 6; d++){
                   
                   System.out.print(datosCamiones[c][d] + "        ");
               }
               }
            }
        double prom = suma/cantidadCamiones; 
       
        
        System.out.println("\nPromedio de precio para vehiculos: " + prom); 
        System.out.println("Vehiculos que duraron menos de dos horas: " + menosDeDosHoras);
        System.out.println("Valor total del costo para los vehiculos que descargaros prodectos perecederos: " + perecederos);
    }
}
    
