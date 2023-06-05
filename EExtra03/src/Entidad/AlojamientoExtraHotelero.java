/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean privado;
    protected double metrosCuadrados;

    public AlojamientoExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    @Override
    public double calcularPrecioHabitacion() {
        // No se aplica para Alojamientos Extra-hoteleros
        return 0;
    }
}
