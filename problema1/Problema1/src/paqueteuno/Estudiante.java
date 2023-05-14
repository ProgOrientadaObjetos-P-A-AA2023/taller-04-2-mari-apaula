/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Universidad;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombre;
    private double m1;
    private double m2;
    private double m3;
    private double promedio;
    private Universidad universidad;
    
    public Estudiante() {
        nombre = " Juan Escobar";
    }

    public Estudiante(String nom, double mt1, double mt2, double mt3, Universidad u) {
        nombre = nom;
        m1 = mt1;
        m2 = mt2;
        m3 = mt3;
        universidad = u;
    }

    public void establecerNombre(String nom) {
        this.nombre = nom;
    }

    public void establecerMateria1(double mt1) {
        m1 = mt1;
    }

    public void establecerMateria2(double mt2) {
        m2 = mt2;
    }

    public void establecerMateria3(double mt3) {
        m3 = mt3;
    }
    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }
    public void calcularPromedio() {
        promedio = (m1 + m2 + m3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return m1;
    }

    public double obtenerMateria2() {
        return m2;
    }

    public double obtenerMateria3() {
        return m3;
    }
    public Universidad obtenerUniversidad() {
        return universidad;
    }
    public double obtenerPromomedio() {
        return promedio;
    }

    
    public String toString() {

        String cadena = String.format("""
                                      Nombre: %s
                                      Materia Uno: %.2f
                                      Materia Dos: %.2f
                                      Materia Tres: %.2f
                                      Promedio Total: %.2f
                                      Nombre de Universidad: %s
                                      Direccion: %s
                                      """,
                obtenerNombre(),
                obtenerMateria1(),
                obtenerMateria2(),
                obtenerMateria3(),
                obtenerPromomedio(),
                universidad.obtenerNomUni(),
                universidad.obtenerDireccion());
        return cadena;
    }
}
