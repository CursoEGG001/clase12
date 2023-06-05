/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Residencia extends AlojamientoExtraHotelero {

    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean tieneCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, double metrosCuadrados, int cantidadHabitaciones, boolean descuentoGremios, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean tieneDescuentoGremios() {
        return descuentoGremios;
    }

    public boolean tieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    @Override
    public double calcularPrecioHabitacion() {
        // No se aplica para Residencia
        return 0;
    }
}
