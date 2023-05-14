/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author crocks 
 */
public class Fabricante {
    private String nom;
    private String origen;
    
    public Fabricante() {
        nom = "NN";
        origen = "AA";
    }
    
    public Fabricante(String n, String ciud){
        nom = n;
        origen = ciud;    
    }
    
    
    public void establecerNombre(String n){
        nom = n;
    }
    
    public void establecerCiudadOrigen(String n){
        origen = n;
    }
    
    
    public String obtenerNombre(){
        return nom;
    }
    
    public String obtenerCiudadOrigen(){
        return origen;
    }
}
