/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Camping extends AlojamientoExtraHotelero {

    private int capacidadMaximaCarpas;
    private int cantidadBanos;
    private boolean tieneRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int capacidadMaximaCarpas, int cantidadBanos, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanos = cantidadBanos;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public boolean tieneRestaurante() {
        return tieneRestaurante;
    }

    @Override
    public double calcularPrecioHabitacion() {
        // No se aplica para Camping
        return 0;
    }
}
