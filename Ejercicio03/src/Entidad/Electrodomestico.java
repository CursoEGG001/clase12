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
public class Electrodomestico {
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }
    
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }
    
    private void comprobarColor(String color) {
        String colorLowerCase = color.toLowerCase();
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        
        for (String c : coloresDisponibles) {
            if (colorLowerCase.equals(c)) {
                colorValido = true;
                break;
            }
        }
        
        if (colorValido) {
            this.color = colorLowerCase;
        } else {
            this.color = "blanco";
        }
    }
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in,"UTF-8");
        
        System.out.println("Ingrese el precio del electrodoméstico "+ this.getClass().getSimpleName()+": ");
        this.precio = leer.nextDouble();
        
        System.out.println("Ingrese el color del electrodoméstico "+ this.getClass().getSimpleName()+": ");
        String colorAparato = leer.next();
        comprobarColor(colorAparato);
        
        System.out.println("Ingrese el consumo energético (letra A hasta F) del electrodoméstico "+ this.getClass().getSimpleName()+ ": ");
        char letra = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(letra);
        
        System.out.println("Ingrese el peso del electrodoméstico "+ this.getClass().getSimpleName()+": ");
        this.peso = leer.nextDouble();
    }
    
    public double precioFinal() {
        double precioFinal = this.precio;
        
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }
        
        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }
        
        return precioFinal;
    }
}