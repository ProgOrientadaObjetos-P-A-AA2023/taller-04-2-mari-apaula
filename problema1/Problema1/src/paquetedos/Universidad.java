/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Usuario
 */
public class Universidad {
    private String nomUni;
    private String direccion;
    
    public Universidad(){
        nomUni = "NN";
        direccion = "AA";
    }
    
    public Universidad(String n, String d){
        nomUni = n;
        direccion = d;
    }
    
    
    public void establecerNomUni(String n){
        nomUni = n;
    }
    
    public void establecerDireccion(String n){
        direccion = n;
    }
    
    public String obtenerNomUni(){
        return nomUni;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
}
