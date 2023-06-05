/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Hotel4Estrellas extends Hotel {
   protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    @Override
    public double calcularPrecioHabitacion() {
        double precioHabitacion = super.calcularPrecioHabitacion();
        double valorAgregadoRestaurante = 0;

        if (capacidadRestaurante < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAgregadoRestaurante = 30;
        } else if (capacidadRestaurante > 50) {
            valorAgregadoRestaurante = 50;
        }

        return precioHabitacion + valorAgregadoRestaurante;
    }
}