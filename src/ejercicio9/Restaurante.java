/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class Restaurante {
   private HashMap<String, IFastFood> mapaRecetasRestaurante; 
   private Menu menu;

    public Restaurante() {
        this.mapaRecetasRestaurante = mapaRecetasRestaurante;
        this.menu = menu;
    }

    public HashMap<String, IFastFood> getMapaRecetasRestaurante() {
        return mapaRecetasRestaurante;
    }

    public Menu getMenu() {
        return menu;
    }
   
    public void ingresarRecetaAlMapa(IFastFood receta){
    mapaRecetasRestaurante.put("Nombre", receta);
    }
}
