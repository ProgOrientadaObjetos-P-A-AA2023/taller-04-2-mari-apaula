/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Banco;
import paquetedos.Cliente;

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
        Banco banco = new Banco();
        banco.establecerNombreBanco("Banco Guayaquil");
        banco.establecerNumeroSucursales(3);
        
        Banco banco2 = new Banco();
        banco2.establecerNombreBanco("Banco de Pichincha");
        banco2.establecerNumeroSucursales(25);
        
        Cliente cliente1 = new Cliente();
        cliente1.establecerNombre("Romeo");
        cliente1.establecerApellido("Santos");
        cliente1.establecerCedula("1724687719");
        
        Cliente cliente2 = new Cliente();
        cliente2.establecerNombre("Franco");
        cliente2.establecerApellido("Escamilla");
        cliente2.establecerCedula("1104786315");
        
        Check cheque1 = new Check(cliente1, 52546);
        cheque1.establecerCliente(cliente1);
        cheque1.establecerBanco(banco);
        cheque1.calcularComision();
        
        Check cheque2 = new Check(cliente2, banco2, 45000);
        cheque2.calcularComision();
        
        System.out.println("Constructor Uno");
        System.out.println(cheque1);
        System.out.println("------------------------------------------\n");
        System.out.println("Constructor  Dos");
        System.out.println(cheque2);
    }
    
}
