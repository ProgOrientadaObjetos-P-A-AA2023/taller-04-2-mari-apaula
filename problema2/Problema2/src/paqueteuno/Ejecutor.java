/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Provincia;

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
        
        Provincia provincia1 = new Provincia();
        Provincia provincia2 = new Provincia();
        
        provincia1.establecerNombreProvincia("Loja");
        provincia1.establecerNumeroHabitantes(125009);
        provincia2.establecerNombreProvincia("Quito");
        provincia2.establecerNumeroHabitantes(56260519);
        
        Profesor profesor1 = new Profesor(817);
        profesor1.establecerNombre("Yanina");
        profesor1.establecerApellido("Garcia");
        profesor1.establecerCedula("1150238984");
        profesor1.establecerProvincia(provincia1);
        profesor1.calcularSueldoTotal();
        
        Profesor profesor2 = new Profesor("Rigoberto", "Lopez", 900, "1716320531", provincia2);
        profesor2.calcularSueldoTotal();
        
        System.out.println("Constructor Uno");
        System.out.println(profesor1);
        System.out.println("------------------------------------------\n");
        System.out.println("Constructor Dos");
        System.out.println(profesor2);
    }
    
}
