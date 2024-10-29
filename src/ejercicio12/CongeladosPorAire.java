/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class CongeladosPorAire extends ProductosCongelados {
    private double nivelDeNitrogeno; 
    private double nivelDeOxigeno; 
    private double nivelDeCO2; 
    private double vaporDeAgua; 

    public CongeladosPorAire(double nivelDeNitrogeno, double nivelDeOxigeno, double nivelDeCO2, double vaporDeAgua, int fechaDeEnvasado, double tempatura, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeEnvasado, tempatura, paisDeOrigen, fechaDeCaducidad, numeroDeLote);
        this.nivelDeNitrogeno = nivelDeNitrogeno;
        this.nivelDeOxigeno = nivelDeOxigeno;
        this.nivelDeCO2 = nivelDeCO2;
        this.vaporDeAgua = vaporDeAgua;
    }

    public double getNivelDeNitrogeno() {
        return nivelDeNitrogeno;
    }

    public void setNivelDeNitrogeno(double nivelDeNitrogeno) {
        this.nivelDeNitrogeno = nivelDeNitrogeno;
    }

    public double getNivelDeOxigeno() {
        return nivelDeOxigeno;
    }

    public void setNivelDeOxigeno(double nivelDeOxigeno) {
        this.nivelDeOxigeno = nivelDeOxigeno;
    }

    public double getNivelDeCO2() {
        return nivelDeCO2;
    }

    public void setNivelDeCO2(double nivelDeCO2) {
        this.nivelDeCO2 = nivelDeCO2;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(double vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }

    @Override
    public String toString() {
        return super.toString() + "CongeladosPorAire{" + "nivelDeNitrogeno=" + nivelDeNitrogeno + ", nivelDeOxigeno=" + nivelDeOxigeno + ", nivelDeCO2=" + nivelDeCO2 + ", vaporDeAgua=" + vaporDeAgua + '}';
    }
    
}

