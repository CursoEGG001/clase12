/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculaFormas;

/**
 *
 * @author pc
 */
public class Forma {

    private static final double PI = 3.14;

    public interface CalculoFormas {

        double getArea();

        double getPerimeter();
    }

    public static class Circulo implements CalculoFormas {

        private double radius;

        public Circulo(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return PI * radius * radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * PI * radius;
        }
    }

    public static class Rectangulo implements CalculoFormas {

        private double base;
        private double height;

        public Rectangulo(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return base * height;
        }

        @Override
        public double getPerimeter() {
            return (base + height) * 2;
        }
    }

}
