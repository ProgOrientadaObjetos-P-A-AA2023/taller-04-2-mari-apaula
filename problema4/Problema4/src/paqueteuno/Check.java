/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;
import paquetedos.Banco;
import paquetedos.Cliente;
/**
 *
 * @author croks
 */
public class Check {
   /*En una entidad financiera se requiere manejar los cheques. Cada check 
tiene las siguientes propiedades: cliente (este atributo se considera como un 
objeto de tipo Cliente, que tiene como atributos: nombres, apellidos, cédula), 
banco (este atributo se considera como un objeto de tipo Banco, que tiene como 
atributos: nombre de Banco y número de sucursales), valor del cheque y comisión 
que cobra el banco. La comisión del banco es igual al valor del cheque por 
el 0,003%.*/
    private Cliente cliente;
    private Banco banco;
    private double vCheque;
    private double comision;
    
    public Check(Cliente c, double v) {
        cliente = c;
        vCheque = v;
    }

    public Check(Cliente c, Banco b, double v) {
        cliente = c;
        banco = b;
        vCheque = v;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public void establecerValor(double v) {
        vCheque = v;
    }

    public void calcularComision() {
        comision = vCheque * 0.00003;
    }


    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenertBanco() {
        return banco;
    }

    public double obtenerValor() {
        return vCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Nombre de cliente: %s
                                      Apellido del cliente: %s
                                      Cedula del cliente: %s
                                      Nombre del Banco: %s
                                      Numero de sucursales del banco: %s
                                      Valor del cheque: %.2f
                                      Comision: %.2f
                                      """, 
                cliente.obtenerNombre(),
                cliente.obtenerApellido(),
                cliente.obtenerCedula(),
                banco.obtenerNombreBanco(),
                banco.obtenerNumeroSucursales(),
                vCheque,
                comision);

        return cadena;
    }
}
