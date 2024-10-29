/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class CongeladosPorNitrogeno extends ProductosCongelados {
    private String metodoDeCongelacion; 
    private double tiempoEmpleado; 

    public CongeladosPorNitrogeno(String metodoDeCongelacion, double tiempoEmpleado, int fechaDeEnvasado, double tempatura, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeEnvasado, tempatura, paisDeOrigen, fechaDeCaducidad, numeroDeLote);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoEmpleado = tiempoEmpleado;
    }

    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }

    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public double getTiempoEmpleado() {
        return tiempoEmpleado;
    }

    public void setTiempoEmpleado(double tiempoEmpleado) {
        this.tiempoEmpleado = tiempoEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + "CongeladosPorNitrogeno{" + "metodoDeCongelacion=" + metodoDeCongelacion + ", tiempoEmpleado=" + tiempoEmpleado + '}';
    }
    
}
