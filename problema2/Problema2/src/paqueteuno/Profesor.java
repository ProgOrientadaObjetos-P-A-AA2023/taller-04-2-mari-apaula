/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Provincia;

/**
 *
 * @author crocks
 */
public class Profesor {
    /* El sueldo total es igual al sueldo básico más el 20% del sueldo básico.*/
    
    private String nom;
    private String app;
    private double sBasico;
    private double sTotal;
    private String ced;
    private Provincia pNacimiento;
    
     public Profesor(double sueldoBasico){
        sBasico = sueldoBasico;
    }
    
    public Profesor(String n, String a, double sb, String c, Provincia pro){
        nom = n;
        app = a;
        sBasico = sb;
        ced = c;
        pNacimiento = pro;
    }
    
    public void establecerNombre(String n) {
        nom = n;
    }
    
    public void establecerApellido(String a) {
        app = a;
    }
    public void establecerSueldoBasico(double sb) {
        sBasico = sb;
    }
    public void establecerCedula(String c) {
        ced = c;
    }
    public void establecerProvincia(Provincia proN) {
        pNacimiento = proN;
    }
    
    public void calcularSueldoTotal() {
        sTotal = sBasico + (sBasico * 0.20);
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
    public void obtenerProvincia(Provincia pro) {
        pNacimiento = pro;
    }
    public double obtenerSueldoBasico(){
        return sBasico;
    }
    public double obtenerSueldoTotal(){
        return sTotal;
    }
    public Provincia obtenerPorvinciaNacimiento(){
        return pNacimiento;
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("""
                                      Nombre: %s
                                      Apellido: %s
                                      Sueldo Basico: %.2f
                                      Sueldo Total: %.2f
                                      Cédula: %s
                                      Provincia: %s
                                      Numero de habitantes: %s
                                      """, 
                                            obtenerNombre(), 
                                            obtenerApellido(), 
                                            obtenerSueldoBasico(), 
                                            obtenerSueldoTotal(), 
                                            obtenerCedula(),
                                            pNacimiento.obtenerNombreProvincia(),
                                            pNacimiento.obtenerNumeroHabitantes());
        return cadena;
    }
}
