/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Servicio {
    public static void iniciar() {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
        
         List<Electrodomestico> electrodomesticos = new ArrayList<>();
        
        // Crear y agregar electrodomesticos al ArrayList
        Electrodomestico electrodomestico1 = new Lavadora(150000, "negro", 'C', 20, 40);
        electrodomesticos.add(electrodomestico1);
        
        Electrodomestico electrodomestico2 = new Lavadora(100000, "blanco", 'A', 15, 35);
        electrodomesticos.add(electrodomestico2);
        
        Electrodomestico electrodomestico3 = new Televisor(200000, "azul", 'B', 10, 50, true);
        electrodomesticos.add(electrodomestico3);
        
        Electrodomestico electrodomestico4 = new Televisor(300000, "gris", 'D', 12, 55, false);
        electrodomesticos.add(electrodomestico4);
        
        // Calcular precioFinal() de cada electrodomestico y mostrar los resultados
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;
            
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
        }
        
        System.out.println("Precio de los electrodomesticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio de los televisores: $" + precioTotalTelevisores);
    }
}