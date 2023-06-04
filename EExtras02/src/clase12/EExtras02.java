/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;
import java.util.List;

/**
 * Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase edificio tendrá como
 * métodos: • Método calcularSuperficie(): calcula la superficie del edificio. • Método calcularVolumen(): calcula el volumen
 * del edifico. Estos métodos serán abstractos y los implementarán las siguientes clases: • Clase Polideportivo con su nombre
 * y tipo de instalación que puede ser Techado o Abierto, esta clase implementará los dos métodos abstractos y los atributos
 * del padre. • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas por oficina y número de
 * pisos. Esta clase implementará los dos métodos abstractos y los atributos del padre. De esta clase nos interesa saber
 * cuántas personas pueden trabajar en todo el edificio, el usuario dirá cuántas personas entran en cada oficina, cuantas
 * oficinas y el número de piso (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
 * cuantas personas entrarían en un piso y cuantas en todo el edificio. Por último, en el main vamos a crear un ArrayList de
 * tipo Edificio. El ArrayList debe contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y
 * ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la superficie y el volumen
 * de cada edificio. Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son techados y
 * cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los resultados de
 * cada edificio de oficinas.
 *
 * @author pc
 */
/**
 * @param args the command line arguments
 */

public class EExtras02 {

    public static void main(String[] args) {

        // Crear lista de objetos edificio
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Agrega polideportivos a la lista
        edificios.add(new Polideportivo(10, 10, 10, "Polideportivo 1", "Techado"));
        edificios.add(new Polideportivo(20, 20, 20, "Polideportivo 2", "Abierto"));

        //Agregar Oficinas a la lista
        edificios.add(new EdificioDeOficinas(10, 10, 10, 10, 5, 2));
        edificios.add(new EdificioDeOficinas(20, 20, 20, 20, 10, 3));

        // Itera en ArrayList y calcula la superficie y volumen de cada edificio
        for (Edificio edificio12 : edificios) {
            double superficie = edificio12.calcularSuperficie();
            double volumen = edificio12.calcularVolumen();
            System.out.println("Superficie de " + edificio12.getClass().getSimpleName() + ": " + superficie);
            System.out.println("Volumen de " + edificio12.getClass().getSimpleName() + ": " + volumen);
        }

        // Cuenta cubiertos y abiertos
        int cubiertos = 0;
        int alAire = 0;
        for (Edificio building : edificios) {
            if (building instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) building;
                if (polideportivo.getTipo().equals("Techado")) {
                    cubiertos++;
                } else {
                    alAire++;
                }
            }
        }
        System.out.println("Numero de Polideportivos cubiertos: " + cubiertos);
        System.out.println("Numero de Polideportivos abiertos: " + alAire);

        // Llama cantPersonas() en cada edificio de oficinas y muestra los resultados.
        for (Edificio edificio1 : edificios) {
            if (edificio1 instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficinas = (EdificioDeOficinas) edificio1;
                System.out.println("Numero de personas en  " + oficinas.getNumeroOficinas() + " oficinas: " + oficinas.cantPersonas());
            }

        }

    }
}
