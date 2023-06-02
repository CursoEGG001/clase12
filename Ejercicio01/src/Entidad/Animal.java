/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicio.Alimentar;

/**
 *
 * @author pc
 */
public class Animal {
    protected String nombre;
    protected String tipoAlimento;
    protected int cantidadAlimento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getCantidadAlimento() {
        return cantidadAlimento;
    }

    public void setCantidadAlimento(int cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public Animal() {
    }

    public Animal(String nombre, String tipoAlimento, int cantidadAlimento) {
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.cantidadAlimento = cantidadAlimento;
    }

    public void Alimentarse() {
        Alimentar servicioAlimentar = new Alimentar();
        servicioAlimentar.alimentarAnimal(this);
    }
}
