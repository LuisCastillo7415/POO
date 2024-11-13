/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author Luis
 */
public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String marca, double precio, int cilindraje) {
        super(marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
        calcularImpuestoCirculacion(); 
        if(tieneSidecar == true){
        setCuotaMesGaraje(getCuotaMesGaraje() +(getCuotaMesGaraje() * 0.50)); 
        }
    }
    public void calcularImpuestoCirculacion(){
    if(tieneSidecar == false){
    super.calcularImpuestoCirculacion();
    }else{
    setImpuestoCirculacion(getImpuestoCirculacion()+(getImpuestoCirculacion() * 0.50));
    }
    
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
    
    
}
