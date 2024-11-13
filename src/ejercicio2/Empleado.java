/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Luis
 */
public class Empleado {
    private String nombre; 
    private String dni; 
    private int edad; 
    private boolean casado; 
    private double salario; 

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        
        this.nombre = nombre;
        this.dni = dni;
        //Validar edad
        if(edad > 18 || edad < 45){
       this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }
        
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { 
      if(edad < 18 || edad >45){
       this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String clasificar(){
    String clasificacion = null;
    if(this.edad <= 21){
    clasificacion = "Principiante "; 
    }
    if(edad > 21 ||edad <= 35){
        clasificacion = "Intermedio";
    
    }
    if(edad > 35){
        clasificacion = "Senior"; 
    }
    return clasificacion; 
    }
    public int subirSalario(int x){
    int subirSalario = (int) (this.salario * x);
    return subirSalario; 
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    
}
