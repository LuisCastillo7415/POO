/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicoenclaseswitch;
import java.util.Scanner; 
/**
 *
 * @author Luis Fernando Castillo 20241222068 
 */
public class EjercicoEnClaseSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int opcion;
        
        System.out.println("Menu areas");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.println("Ingrese la opcion deseada");
        opcion = in.nextInt(); 
        
        switch (opcion){
            case 1: 
                System.out.println("Rectangulo");
                System.out.println("Ingrese el valor de la base");
               int base = in.nextInt(); 
                System.out.println("Ingrese el valor de la altular ");
                int altura = in.nextInt(); 
                int area = base * altura; 
                System.out.println("El area del rectangulos es: " + area);
                break; 
            case 2: 
                int base2, altura2; 
                System.out.println("Triangulo");
                System.out.println("Ingrese el valor de la base: ");
                base2 = in.nextInt();
                System.out.println("Ingrese el valor de la altura: ");
                altura2 = in.nextInt(); 
                int area2 = (base2 * altura2)/2; 
                System.out.println("El area del trianulo es: " + area2);
                break; 
            case 3: 
                double radio; 
                System.out.println("Circulo ");
                System.out.println("Ingrese el valor del radio: ");
                radio = in.nextDouble(); 
                double area3 = (double) ((radio*radio)*3.1416); 
                System.out.println("El area del circulo es: " + area3);
                break; 
            case 4: 
                int baset, baset2, alturat; 
                
                System.out.println("Trapecio");
                System.out.println("Ingrese el valor de la base 1: ");
                baset = in.nextInt(); 
                System.out.println("Inrese el valor de la base 2: ");
                baset2 = in.nextInt(); 
                System.out.println("Ingrese la altura: ");
                alturat = in.nextInt(); 
                int areat = ((baset + baset2)* alturat)/2; 
                System.out.println("El area del trapecio es " + areat);
                break; 
            case 5: 
                System.out.println("salida");
                break; 
        }
    }
    
}
