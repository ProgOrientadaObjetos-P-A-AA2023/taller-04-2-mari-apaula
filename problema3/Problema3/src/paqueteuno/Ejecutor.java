/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author crocks
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fabricante fabricante1 = new Fabricante();
        fabricante1.establecerNombre("BMW GROUP");
        fabricante1.establecerCiudadOrigen("Leipzig");
        
        Fabricante fabricante2 = new Fabricante();
        fabricante2.establecerNombre("Enzo Ferrari");
        fabricante2.establecerCiudadOrigen("Maranello");
        
        Automotor auto1 = new Automotor("1105238685", 2014);
        auto1.establecerFabricante(fabricante1);
        auto1.establecerValorVehiculo(163300.00);
        auto1.calcularValorMatricula();
        
        Automotor auto2 = new Automotor("1105230027", 2020,  550000.00,fabricante2 );
        auto2.calcularValorMatricula();
        
        System.out.println("Consturctor Uno");
        System.out.println(auto1);
        System.out.println("------------------------------------------\n");
        System.out.println("Consturctor  Dos");
        System.out.println(auto2);
    }
    }
    