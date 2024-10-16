/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Luis
 */
public class NotasDeEstudisntes {
    public static void main(String[] args) {
        /*
        Dados estos arrays
String [] nombreDeCadaAlumno = {"Eva","Jose","Pepa","Ana","Juanjo"}
int[] notasDeCadaAlumno = {8,2,5,4,9};
donde cada posición de un alumno corresponde con la posición de su nota, hacer un bucle que nos
diga los nombres de los alumnos que han aprobado y su nota, esto es, debe escribir en la consola:
        */
        
    String [] nombreDeCadaAlumno = {"Eva","Jose","Pepa","Ana","Juanjo"};
    int[] notasDeCadaAlumno = {8,2,5,4,9}; 
    
    for(int i = 0; i < nombreDeCadaAlumno.length; i++){
        if(notasDeCadaAlumno[i] > 5){
            System.out.println("El alumno " + nombreDeCadaAlumno[i] + " aprobo con una nota de " + notasDeCadaAlumno[i]);
        }else{
            System.out.println("El alumno " +  nombreDeCadaAlumno[i] + " reprobo con una nota de " + notasDeCadaAlumno[i]);
        }
    }
    }
}
