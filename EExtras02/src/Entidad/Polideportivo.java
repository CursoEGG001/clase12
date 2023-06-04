/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Polideportivo extends Edificio {
// Polideportivo class


    private String nombre;
    private String tipo;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * alto;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    @Override
    public double getLargo() {
        return largo;
    }

}
