/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Universidad;

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
        
        Universidad unc = new Universidad();
        unc.establecerNomUni("Uiversidad Nacional del Cotopaxi");
        unc.establecerDireccion("Cotopaxi");
        
        Universidad utpl = new Universidad();
        utpl.establecerNomUni("Universidad Tecnica Particular de Loja");
        utpl.establecerDireccion("Loja");
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.establecerNombre("Daniela Mancilla");
        estudiante1.establecerMateria1(4.3);
        estudiante1.establecerMateria2(9);
        estudiante1.establecerMateria3(9.8);
        estudiante1.establecerUniversidad(unc);
        estudiante1.calcularPromedio();
        
        Estudiante estudiante2 = new Estudiante("Sebastian Mora", 8.5, 5.5, 10, utpl);
        estudiante2.calcularPromedio();
        
        System.out.println("Constructor Uno");
        System.out.println(estudiante1);
        System.out.println("------------------------------------------\n");
        System.out.println("Constructor  Dos");
        System.out.println(estudiante2);
        
    }
    
}
