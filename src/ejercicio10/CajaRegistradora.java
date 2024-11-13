/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Luis
 */
public class CajaRegistradora implements ICajaRegistradora{
    private String nombre; 
    private int tipoDeMonedas; 
    private int unidadesTipoMoneda; 

    public CajaRegistradora(String nombre, int tipoDeMonedas, int unidadesTipoMoneda) {
        this.nombre = nombre;
        this.tipoDeMonedas = tipoDeMonedas;
        this.unidadesTipoMoneda = unidadesTipoMoneda;
    }

    public void setUnidadesTipoMoneda(int unidadesTipoMoneda) {
        this.unidadesTipoMoneda = unidadesTipoMoneda;
    }

    @Override
    public String getNombre() {
        return nombre; 
        }

    @Override
    public int getNumTipoMonedas() {
        return tipoDeMonedas; 
    }

    @Override
    public int getUnidadesTipoMoneda() {
      
        return unidadesTipoMoneda; 
       
     }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
       if(tipo < this.tipoDeMonedas){
       if(unidades > 0){
       return true; 
       }else{
           System.out.println("Cantidad invalida");
           return false; 
       }
       }else{
           System.out.println("Tipo de moneda no palido ");
       return false; 
       }
    }

    @Override
    public boolean monedaValida(double tipo) {
        return tipo < this.tipoDeMonedas;
        }

    @Override
    public boolean sacarMonedas(float tipo, int unidades) {
        if(unidades < this.unidadesTipoMoneda){
            return tipo < this.tipoDeMonedas; 
        }else{
           return false;      
                }
        
     }

    @Override
    public void vaciarCajaRegistradora() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double[] getTiposDeMonedas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "CajaRegistradora{" + "nombre=" + nombre + ", tipoDeMonedas=" + tipoDeMonedas + ", unidadesTipoMoneda=" + unidadesTipoMoneda + '}';
    }
    
}
