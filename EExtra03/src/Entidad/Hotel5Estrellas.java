/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Hotel5Estrellas extends Hotel4Estrellas {

    protected int cantidadSalonesConferencia;
    protected int cantidadSuites;
    protected int cantidadLimosinas;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasio, nombreRestaurante, capacidadRestaurante);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    @Override
    public double calcularPrecioHabitacion() {
        double precioHabitacion = super.calcularPrecioHabitacion();
        double valorAgregadoGimnasio = 50 * (gimnasio.equals("A") ? 1 : 0);
        double valorAgregadoLimosinas = 15 * cantidadLimosinas;

        return precioHabitacion + valorAgregadoGimnasio + valorAgregadoLimosinas;
    }
}
