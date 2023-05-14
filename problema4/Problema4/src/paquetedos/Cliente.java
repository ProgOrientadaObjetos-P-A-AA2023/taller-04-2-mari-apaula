/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Usuario
 */
public class Cliente {
/*cliente (este atributo se considera como un 
objeto de tipo Cliente, que tiene como atributos: nombres, apellidos, cédula)*/
    private String nom;
    private String app;
    private String ced;
    
    public Cliente() {
        nom = "NN";
        app = "AA";
        ced = "CC";
    }
    
     public Cliente(String n, String a, String c){
        nom = n;
        app = a;
        ced = c;
    }
    
    
    public void establecerNombre(String n){
        nom = n;
    }
    
    public void establecerApellido(String n){
        app = n;
    }
    
    public void establecerCedula(String n){
        ced = n;
    }
    
    public String obtenerNombre(){
        return nom;
    }
    
    public String obtenerApellido(){
        return app;
    }
    
    public String obtenerCedula(){
        return ced;
    }
}
