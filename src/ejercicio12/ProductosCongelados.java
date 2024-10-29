/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public abstract class ProductosCongelados extends Productos {
    private int fechaDeEnvasado; 
    private double tempatura; 
    private String paisDeOrigen; 

    public ProductosCongelados(int fechaDeEnvasado, double tempatura, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeCaducidad, numeroDeLote);
        this.fechaDeEnvasado = fechaDeEnvasado;
        this.tempatura = tempatura;
        this.paisDeOrigen = paisDeOrigen;
    }

    public int getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }

    public void setFechaDeEnvasado(int fechaDeEnvasado) {
        this.fechaDeEnvasado = fechaDeEnvasado;
    }

    public double getTempatura() {
        return tempatura;
    }

    public void setTempatura(double tempatura) {
        this.tempatura = tempatura;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductosCongelados{" + "fechaDeEnvasado=" + fechaDeEnvasado + ", tempatura=" + tempatura + ", paisDeOrigen=" + paisDeOrigen + '}';
    }
    
}
