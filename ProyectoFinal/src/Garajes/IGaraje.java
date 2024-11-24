/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Garajes;

import Vehiculos.Vehiculo;

/**
 *
 * @author Luis
 */
public interface IGaraje {
  double calcularIngresos();
  int calcularOcupacionPorTipoVehiculo(Vehiculo v);
}
