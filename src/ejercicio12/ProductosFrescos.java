/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class ProductosFrescos extends Productos {
    private int fechaEnvasado; 
    private String paisDeOrigen; 

    public ProductosFrescos(int fechaEnvasado, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeCaducidad, numeroDeLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisDeOrigen = paisDeOrigen;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductosFrescos{" + "fechaEnvasado=" + fechaEnvasado + ", paisDeOrigen=" + paisDeOrigen + '}';
    }
    
}
