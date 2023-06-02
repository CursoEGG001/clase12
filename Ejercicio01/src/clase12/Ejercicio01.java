/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase Animal tendrá como atributos el
 * nombre, alimento, edad y raza del Animal. Crear un método en la clase Animal a través del cual cada clase hija deberá
 * mostrar luego un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo siguiente:
 *
 * @author pc
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración del objeto Perro
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        
        //Declaración del objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
        
        //Declaración del objeto Perro
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
        
        //Declaración del objeto Perro
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
    }

}
