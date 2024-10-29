/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Luis
 */
public class CocheMatriculado extends Coche {
   private int aniomatriculacion;
   private int mesmatriculacion;
   private double impuestoMatriculacion;

    public CocheMatriculado(int aniomatriculacion, int mesmatriculacion, String marca, String color, double precio, double factorContaminacion, int anio, String matricula, String dniTitular) {
        super(marca, color, precio, factorContaminacion, anio, matricula, dniTitular);
        this.aniomatriculacion = aniomatriculacion;
        this.mesmatriculacion = mesmatriculacion;
        this.impuestoMatriculacion = calcularImpuestoMatriculacio(); 
    }

    public int getAniomatriculacion() {
        return aniomatriculacion;
    }

    public void setAniomatriculacion(int aniomatriculacion) {
        this.aniomatriculacion = aniomatriculacion;
    }

    public int getMesmatriculacion() {
        return mesmatriculacion;
    }

    public void setMesmatriculacion(int mesmatriculacion) {
        this.mesmatriculacion = mesmatriculacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }
    
   public double calcularImpuestoMatriculacio(){
   if(getAnio() < 10){
   return getPrecio()/20; 
   }else{
       System.out.println("Recargo de 100 euros por tener mas de diez años");
   return (getPrecio()/20) + 100; 
   }
   }

    @Override
    public String toString() {
        return super.toString() +  "CocheMatriculado{" + "aniomatriculacion=" + aniomatriculacion + ", mesmatriculacion=" + mesmatriculacion + ", impuestoMatriculacion=" + impuestoMatriculacion + '}';
    }
   
}
