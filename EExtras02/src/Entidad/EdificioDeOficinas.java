/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class EdificioDeOficinas extends Edificio {


    private int numeroOficinas;
    private int personasEnOficinas;
    private int numeroDePisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroOficinas, int personasEnOficinas, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasEnOficinas = personasEnOficinas;
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * alto * numeroDePisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo * numeroDePisos;
    }

    public int cantPersonas() {
        return numeroOficinas * personasEnOficinas;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasEnOficinas() {
        return personasEnOficinas;
    }

    public void setPersonasEnOficinas(int personasEnOficinas) {
        this.personasEnOficinas = personasEnOficinas;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    @Override
    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double getLargo() {
        return largo;
    }

    @Override
    public void setLargo(double largo) {
        this.largo = largo;
    }

}
