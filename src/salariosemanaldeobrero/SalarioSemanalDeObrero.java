/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariosemanaldeobrero;
import java.util.Scanner; 
/**
 *
 * @author Luis Fernado Castillo  20241222068
 */
public class SalarioSemanalDeObrero {

    /**
    * Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
    • Si trabaja 40 horas o menos se le paga $5000 por hora
    • Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
    aumento del 20% por cada hora extra.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Ingrese el numero de horas trabajadas: ");
        double horas = in.nextDouble(); 
        
        if(horas <= 40){
            double salario = horas * 5000; 
            System.out.println("Su salario de este semana fue: " + salario );
                     
        }else{
            double horasextra = horas - 40; 
            double salariobase = 40 * 5000; 
            double salarioextra = (horasextra * 5000) + (5000 * 0.20);
            double total = salariobase + salarioextra; 
            System.out.println("Su salario de esta semana mas horas extra fue: " + total);
        }
    }
    
}
