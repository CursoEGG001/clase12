/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Estudiante;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SGF {

    public static void inicio() {

        Scanner entrada = new Scanner(System.in, "UTF-8").useDelimiter("\n");

        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", "Soltero", "Ingeniería Informática");
        estudiante.imprimirInformacion();

        System.out.println("Ingrese un nuevo estado civil:");
        estudiante.cambiarEstadoCivil(entrada.next());
        
        System.out.println("Ingrese un curso a inscribir");
        estudiante.matricularEnCurso(entrada.next());
        
        estudiante.imprimirInformacion();

        System.out.println();

        Profesor profesor = new Profesor("María", "González", "987654321", "Casada", 2005, 102, "Matemáticas");
        profesor.imprimirInformacion();
        
        System.out.println("Escriba el nuevo Departamentyo asignado:");
        profesor.cambiarDepartamento(entrada.next());
        
        System.out.println("Designe un despacho: ");
        profesor.reasignarDespacho(entrada.nextInt());
        
        System.out.println("Escriba el estado civil:");
        profesor.cambiarEstadoCivil(entrada.next());
        
        profesor.imprimirInformacion();

        System.out.println();

        PersonalServicio personalServicio = new PersonalServicio("Pedro", "López", "456789123", "Soltero", 2010, 205, "Biblioteca");
        personalServicio.imprimirInformacion();
        
        System.out.println("Ingrese una nueva Sección asignada:");
        personalServicio.cambiarSeccion(entrada.next());
        
        System.out.println("Escriba el estado civil: ");
        personalServicio.cambiarEstadoCivil(entrada.next());
        
        System.out.println("Asigne un despacho:");
        personalServicio.reasignarDespacho(entrada.nextInt());
        
        personalServicio.imprimirInformacion();
        
    }
}
