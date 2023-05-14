/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author crocks
 */
public class Automotor {
   /* Un automotor tiene entre sus características, cédula del dueño, 
fabricante de vehículo, 
año de fabricación, valor de vehículo y valor de la matricula. El valor de 
la matricula es igual al 0.002% del valor de vehículo por el número de años de 
antiguedad del vehiculo.*/
    private String ced;
    private Fabricante fabricante;
    private int anioF;
    private double valorV;
    private double vMatricula;
   
    public Automotor(String c, int a) {
        ced = c;
        anioF = a;
    }

    public Automotor(String c, int a, double v, Fabricante fab) {
        ced = c;
        anioF = a;
        valorV = v;
        fabricante = fab;
    }

// Establecer de cda variable 
    public void establecerCedula(String c) {
        ced = c;
    }

    public void establecerAnio(int a) {
        anioF = a;
    }

    public void establecerValorVehiculo(double v) {
        valorV = v;
    }

    public void establecerFabricante(Fabricante f) {
        fabricante = f;
    }

    public void calcularValorMatricula() {
        vMatricula = (0.00002 * valorV) * (2023 - anioF);
    }
// Obtener de cada variable

    public String obtenerCedula() {
        return ced;
    }

    public int obtenerAnio() {
        return anioF;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public double obtenerValorVehiculo() {
        return valorV;
    }

    public double obtenerValorMatricula() {
        return vMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Cedula: %s
                                      Año de Fabricacion: %d
                                      Valor del Vehiculo: %.2f
                                      Valor de la Matricula: %.2f
                                      Nombre de fabricante: %s
                                      Ciudad de origen: %s
                                      """,
                obtenerCedula(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                obtenerValorMatricula(),
                fabricante.obtenerNombre(),
                fabricante.obtenerCiudadOrigen());
        
        return cadena;

    }
}
