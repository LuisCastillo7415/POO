/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Luis
 */
public class VehiculoYaRegistradoException extends Exception {
    public VehiculoYaRegistradoException(){
    super("Vehiculo ya registrado en otro garaje"); 
    }
}
