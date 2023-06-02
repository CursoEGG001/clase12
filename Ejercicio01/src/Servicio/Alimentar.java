/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Animal;

public class Alimentar {
    public void alimentarAnimal(Animal animal) {
        System.out.println("Alimentando a " + animal.getClass().getSimpleName() + ": " + animal.getNombre());
        System.out.println("Tipo de alimento: " + animal.getTipoAlimento());
        System.out.println("Cantidad de alimento: " + animal.getCantidadAlimento() + " gramos");
        System.out.println("------------------------------");
    }

}
