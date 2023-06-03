/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import Entidad.Animal;
import Entidad.Gato;
import Entidad.Perro;
import Entidad.estaClase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class TeoriaEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Animal> losAnimalitos = new ArrayList<>();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        losAnimalitos.add(a);
        losAnimalitos.add(b);
        losAnimalitos.add(c);
        
        for (Animal losAnimalito : losAnimalitos) {
            losAnimalito.hacerRuido();
        }
        
        estaClase haceCosas = new estaClase();
        
        haceCosas.suMetodo();
    }

}
