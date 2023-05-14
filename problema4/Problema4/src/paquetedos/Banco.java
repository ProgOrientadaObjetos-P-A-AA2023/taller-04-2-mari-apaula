/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author crocks
 */
public class Banco {
/*banco (este atributo se considera como un objeto de tipo Banco, que tiene como 
atributos: nombre de Banco y número de sucursales)*/
    private String nom;
    private int nSucursal;
    
    public Banco() {
        nom = "NN";
        nSucursal = 0;
    }
    
    public Banco(String n, int num ){
        nom = n;
        nSucursal = num;
    }
     
    public void establecerNombreBanco(String ban){
        nom = ban;
    }
    
    public void establecerNumeroSucursales(int num){
        nSucursal = num;
    }
  
    public String obtenerNombreBanco(){
        return nom;
    }
    
    public int obtenerNumeroSucursales(){
        return nSucursal;
    }
}
