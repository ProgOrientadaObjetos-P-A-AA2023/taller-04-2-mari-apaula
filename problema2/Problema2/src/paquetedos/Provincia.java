/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author crocks
 */
public class Provincia {
    /*este atributo se considera como un objeto de tipo Provincia, 
    que tiene como atributos: nombre de Provincia y número de habitantes).*/
    
    private String nomProv;
    private int numHabitantes;
    
    public Provincia() {
        nomProv = "NN";
        numHabitantes = 0;        
    }
    
    public Provincia(String n, int num){
        nomProv = n;
        numHabitantes = num;
    }
    
    
    public void establecerNombreProvincia(String n){
        nomProv = n;
    }
    
    public void establecerNumeroHabitantes(int n){
        numHabitantes = n;
    }
    
    public String obtenerNombreProvincia(){
        return nomProv;
    }
    
    public int obtenerNumeroHabitantes(){
        return numHabitantes;
    }
}
