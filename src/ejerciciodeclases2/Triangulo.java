
package ejerciciodeclases2;

/*
 *
 * @author Luis
 */

/*
 *  Crear una clase Triangulo que representa un triángulo equilátero, 
    con los atributos enteros base y altura. Crear métodos para dar valor y 
    poder consultar los atributos, un método constructor, y un
    método para calcular el área del triángulo.
    Crear una clase Prueba que en su main cree varios objetos de Triángulo, 
    consulte sus atributos, cambie el valor nuevamente de los atributos y 
    pruebe su método.
 */

public class Triangulo {
    int base; 
    int altura; 
    
    public int hallarArea(){
    int area = (base * altura)/2; 
    return area; 
    
    }
    public void darValorDeLaAltura(int altura){
        this.altura = altura; 
        
    }
    public void darValorDeLaBase(int base){
    this.base = base; 
        
    }
    
}
