/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Empleado extends Persona {

    protected int yearIncorporacion;
    protected int numeroDespacho;

    public Empleado(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
            int yearIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.yearIncorporacion = yearIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignarDespacho(int nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Año de incorporación: " + yearIncorporacion);
        System.out.println("Número de despacho: " + numeroDespacho);
    }
}
