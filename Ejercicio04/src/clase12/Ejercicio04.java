/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import CalculaFormas.Forma.Circulo;
import CalculaFormas.Forma.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double radius = leer.nextDouble();

        System.out.println("Ingrese la base del rectangulo: ");
        double base = leer.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        double height = leer.nextDouble();

        Circulo circulo = new Circulo(radius);
        Rectangulo rectangulo = new Rectangulo(base, height);

        System.out.println("Area del circulo: " + circulo.getArea());
        System.out.println("Perimetro del circulo: " + circulo.getPerimeter());
        System.out.println("Area del rectangulo: " + rectangulo.getArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.getPerimeter());
    }
    
}
