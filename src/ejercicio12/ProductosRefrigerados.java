/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class ProductosRefrigerados extends Productos {
    private double codigoDeOsa; 
    private int fechaDeEnvasado; 
    private double temperatura; 
    private String paisDeOrigen; 

    public ProductosRefrigerados(double codigoDeOsa, int fechaDeEnvasado, double temperatura, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeCaducidad, numeroDeLote);
        this.codigoDeOsa = codigoDeOsa;
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.temperatura = temperatura;
        this.paisDeOrigen = paisDeOrigen;
    }

    public double getCodigoDeOsa() {
        return codigoDeOsa;
    }

    public void setCodigoDeOsa(double codigoDeOsa) {
        this.codigoDeOsa = codigoDeOsa;
    }

    public int getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(int fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductosRefrigerados{" + "codigoDeOsa=" + codigoDeOsa + ", fechaDeEnvasado=" + fechaDeEnvasado + ", temperatura=" + temperatura + ", paisDeOrigen=" + paisDeOrigen + '}';
    }
    
}
