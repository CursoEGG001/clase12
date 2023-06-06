/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Estudiante;
import Entidad.PersonalServicio;
import Entidad.Profesor;

/**
 * * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione la información sobre las
 * personas vinculadas con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio.
 * A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 * 
 * El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A continuación, debe
 * programar las clases definidas en las que, además de los constructores, hay que desarrollar los métodos correspondientes a
 * las siguientes operaciones: 
 * • Cambio del estado civil de una persona. 
 * • Reasignación de despacho a un empleado.
 * • Matriculación de un estudiante en un nuevo curso.
 * • Cambio de departamento de un profesor.
 * • Traslado de sección de un empleado del personal de servicio.
 * • Imprimir toda la información de cada tipo de individuo.
 * 
 * Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 *
 * @author pc
 */
public class SGF {

    public static void inicio() {
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", "Soltero", "Ingeniería Informática");
        estudiante.imprimirInformacion();

        estudiante.cambiarEstadoCivil("Casado");
        
        Profesor profesor = new Profesor("María", "González", "987654321", "Casada", 2005, 102, "Matemáticas");
        profesor.imprimirInformacion();
    
        profesor.cambiarDepartamento("Cálculo");
        profesor.reasignarDespacho(101);
        profesor.imprimirInformacion();

        PersonalServicio personalServicio = new PersonalServicio("Pedro", "López", "456789123", "Soltero", 2010, 205, "Biblioteca");
        personalServicio.imprimirInformacion();
        
        personalServicio.cambiarSeccion("Aulas");
        personalServicio.reasignarDespacho(305);
        
    }


}
