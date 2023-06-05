/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4Estrellas;
import Entidad.Hotel5Estrellas;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pc
 */
public class HospedajeServicio {
    
    /**
     * @param args the command line arguments
     */
    public static void iniciar() {
        // Crear los alojamientos
        Hotel5Estrellas hotel1 = new Hotel5Estrellas("Hotel A", "Dirección 1", "Localidad 1", "Gerente A", 100, 200, 10, "A", "Restaurante A", 80, 5, 10, 3);
        Hotel4Estrellas hotel2 = new Hotel4Estrellas("Hotel B", "Dirección 2", "Localidad 2", "Gerente B", 80, 150, 8, "B", "Restaurante B", 50);
        Camping camping1 = new Camping("Camping A", "Dirección 3", "Localidad 3", "Gerente C", true, 2000, 50, 20, true);
        Residencia residencia1 = new Residencia("Residencia A", "Dirección 4", "Localidad 4", "Gerente D", false, 3000, 40, true, false);
        // Crear ArrayList de alojamientos
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(camping1);
        alojamientos.add(residencia1);
        // Consulta: todos los alojamientos
        System.out.println("Todos los alojamientos:");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.nombre);
        }
        // Consulta: todos los hoteles de más caro a más barato
        System.out.println("\nHoteles de más caro a más barato:");
        Collections.sort(alojamientos, (a1, a2) -> {
            double precio1 = a1.calcularPrecioHabitacion();
            double precio2 = a2.calcularPrecioHabitacion();
            return Double.compare(precio2, precio1);
        });
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                System.out.println(alojamiento.nombre + " - Precio habitación: $" + alojamiento.calcularPrecioHabitacion());
            }
        }
        // Consulta: todos los campings con restaurante
        System.out.println("\nCampings con restaurante:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.tieneRestaurante()) {
                    System.out.println(camping.nombre);
                }
            }
        }
        // Consulta: todas las residencias que tienen descuento
        System.out.println("\nResidencias con descuento:");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.tieneDescuentoGremios()) {
                    System.out.println(residencia.nombre);
                }
            }
        }
    }
    
}
