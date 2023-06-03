/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Lavadora extends Electrodomestico {

    private double carga;
    
    public Lavadora() {
        super();
        this.carga = 0;
    }
    
    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    public double getCarga() {
        return carga;
    }
    
    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        crearElectrodomestico();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la carga de la lavadora: ");
        this.carga = leer.nextDouble();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if (this.carga > 30) {
            precioFinal += 500;
        }
        
        return precioFinal;
    }
}