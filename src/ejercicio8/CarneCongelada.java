/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class CarneCongelada extends Carne{
    private String InfoEmpresaDistribuidora; 

    public CarneCongelada(String InfoEmpresaDistribuidora, String origen, String nombre, double peso, double precioKilo) {
        super(origen, nombre, peso, precioKilo);
        this.InfoEmpresaDistribuidora = InfoEmpresaDistribuidora;
    }

    public String getInfoEmpresaDistribuidora() {
        return InfoEmpresaDistribuidora;
    }

    public void setInfoEmpresaDistribuidora(String InfoEmpresaDistribuidora) {
        this.InfoEmpresaDistribuidora = InfoEmpresaDistribuidora;
    }
    
}
