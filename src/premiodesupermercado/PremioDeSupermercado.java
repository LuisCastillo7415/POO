/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premiodesupermercado;
import java.util.Scanner; 

/**
 *
 * @author Luis Fernando Castillo 20241222068
 */
public class PremioDeSupermercado {

    /**
     * 13. Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
       de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
       otra canasta, los premios se dan bajo la siguiente tabla:
HOMBRES                         MUJERES
# Bolita Premio              # bolita Premio
1 Desodorante                1 Loción
2 Six-Pack de cerveza        2 Bikini
3 Camiseta                   3 Crema para la cara
4 Pantaloneta                4 Plancha para el cabello
5 Sudadera                   5 Esmalte de uñas
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        System.out.println("Genero del participante:  ");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer ");
        
        int genero = in.nextInt(); 
        
        switch (genero){
            case 1:
                System.out.println("Ingrese el numero obtenido: ");
                int numero = in.nextInt(); 
                
                switch (numero){
                    case 1: 
                        System.out.println("Has ganado un Desodorante!!");
                        break; 
                    case 2: 
                        System.out.println("Has ganado un six-pack!!");
                        break;
                    case 3: 
                        System.out.println("Has ganado una camiseta!!");
                        break;
                    case 4: 
                        System.out.println("Has ganado una pantaloneta!!");
                        break;
                    case 5: 
                        System.out.println("Has ganado una sudadera!!");
                        break;
                }
                break;
            case 2: 
                System.out.println("Ingrese el numero obtenido: ");
                int num = in.nextInt(); 
                
                switch (num){
                    case 1: 
                        System.out.println("Has ganado una loción!!");
                        break;
                    case 2:
                        System.out.println("Has ganado un bikini!!");
                        break;
                    case 3:
                        System.out.println("Has ganado una crema para la cara!!");
                        break;
                    case 4:
                        System.out.println("Has ganado una plancha para cabello!!");
                        break;
                    case 5: 
                        System.out.println("Has ganado un esmalte de uñas");
                        break;
                        
                }
               break;  
        }
         
    }
    
}
