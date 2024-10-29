package ejercicodeclases3;
/**
 *
 * @author ESTUDIANTES
 */
public class CocheE {
    private String marca; 
    private String color; 
    private int km; 
    private double precio; 
    private double factorContaminacion; 
    private int anio; 
    private String matricula; 
    private double impuestoMatriculacion;
    private String dniTitular; 
    
    public CocheE(String marca, String color, double precio, double factorContaminacion, int anio){
    
    this.marca = marca; 
    this.color = color; 
    this.precio = precio; 
    this.factorContaminacion = factorContaminacion; 
    this.anio = anio; 
    this.km = 0; 
    
    }
 
    //Marca
    public String getMarca() {
        return marca;
    }

    //Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //kilometros
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
      //Verificar que solo cambie el valor si se incrementa
        if(this.km < km){
        this.km = km; 
        }else{
            System.out.println("km no valido (km <)");
        }
       
    }

    //Precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Factor de contaminación
    public double getFactorContaminacion() {
        return factorContaminacion;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnio() {
        return anio;
    }
    
    
    
}

