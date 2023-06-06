/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class PersonalServicio extends Empleado {

    protected String seccion;

    public PersonalServicio(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil,
            int yearIncorporacion, int numeroDespacho, String seccion) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, yearIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio: " + "\n\t Sección: " + seccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
    }
}


