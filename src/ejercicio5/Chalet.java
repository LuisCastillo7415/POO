/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Luis
 */
public class Chalet extends Vivienda{
    private int numParcela; 
    private boolean conPiscina; 

    public Chalet(int numParcela, boolean conPiscina, String calle, int superficieEnMetros) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
    }
    public double calcularPrecio(){
   double po = getSuperficieEnMetros() * 1300; 
   return po; 
    }

    @Override
    public String toString() {
        return super.toString() + "Chalet{" + "numParcela=" + numParcela + ", conPiscina=" + conPiscina + '}';
    }
    
}
