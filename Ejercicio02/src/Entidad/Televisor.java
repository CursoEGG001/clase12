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
public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;
    
    public Televisor() {
        super();
        this.resolucion = 0;
        this.sintonizadorTDT = false;
    }
    
    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public int getResolucion() {
        return resolucion;
    }
    
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor() {
        crearElectrodomestico();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la resolución del televisor (en pulgadas): ");
        this.resolucion = leer.nextInt();
        
        System.out.println("¿Tiene sintonizador TDT incorporado? (true/false): ");
        this.sintonizadorTDT = leer.nextBoolean();
    }
    
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        
        if (this.resolucion > 40) {
            precioFinal *= 1.3;
        }
        
        if (this.sintonizadorTDT) {
            precioFinal += 500;
        }
        
        return precioFinal;
    }
}
