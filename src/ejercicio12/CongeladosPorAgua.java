/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Luis
 */
public class CongeladosPorAgua extends ProductosCongelados{
    private double salinidadDelAgua; 

    public CongeladosPorAgua(double salinidadDelAgua, int fechaDeEnvasado, double tempatura, String paisDeOrigen, int fechaDeCaducidad, double numeroDeLote) {
        super(fechaDeEnvasado, tempatura, paisDeOrigen, fechaDeCaducidad, numeroDeLote);
        this.salinidadDelAgua = salinidadDelAgua;
    }

    public double getSalinidadDelAgua() {
        return salinidadDelAgua;
    }

    public void setSalinidadDelAgua(double salinidadDelAgua) {
        this.salinidadDelAgua = salinidadDelAgua;
    }

    @Override
    public String toString() {
        return super.toString() +  "CongeladosPorAgua{" + "salinidadDelAgua=" + salinidadDelAgua + '}';
    }
    
}
