/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Luis
 */
public class CarnePiezaEntera extends CarneCongelada {
    private boolean vieneEnBandeja; 

    public CarnePiezaEntera(boolean vieneEnBandeja, String InfoEmpresaDistribuidora, String origen, String nombre, double peso, double precioKilo) {
        super(InfoEmpresaDistribuidora, origen, nombre, peso, precioKilo);
        this.vieneEnBandeja = vieneEnBandeja;
    }

    public boolean isVieneEnBandeja() {
        return vieneEnBandeja;
    }

    public void setVieneEnBandeja(boolean vieneEnBandeja) {
        this.vieneEnBandeja = vieneEnBandeja;
    }
    
}
