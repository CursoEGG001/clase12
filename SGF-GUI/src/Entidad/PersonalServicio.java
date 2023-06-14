/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione la información sobre las
 * personas vinculadas con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio.
 * A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 *
 *
 * • Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...).
 *
 * Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 *
 * @author pc
 */
public class PersonalServicio extends Empleado {

    protected String seccion;

    public PersonalServicio(String seccion, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.seccion = seccion;
    }

    public PersonalServicio(String seccion, String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, int yearIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil, yearIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public PersonalServicio() {;
    }

    public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tPersonalServicio: " + "\n\t Sección: " + seccion;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Sección: " + seccion);
    }
}
