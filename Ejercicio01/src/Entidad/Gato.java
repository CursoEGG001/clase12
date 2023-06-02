/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Gato extends Animal {

    private String raza;

    public Gato(String nombre, String tipoAlimento, int cantidadAlimento, String raza) {
        super(nombre, tipoAlimento, cantidadAlimento);
        this.raza = raza;
    }
}
