/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Estudiante;
import Entidad.PersonalServicio;
import Entidad.Profesor;

/**
 *
 * @author pc
 */
public class SGF {

    public static void inicio() {
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "123456789", "Soltero", "Ingeniería Informática");
        estudiante.imprimirInformacion();

        Profesor profesor = new Profesor("María", "González", "987654321", "Casada", 2005, 102, "Matemáticas");
        profesor.imprimirInformacion();

        PersonalServicio personalServicio = new PersonalServicio("Pedro", "López", "456789123", "Soltero", 2010, 205, "Biblioteca");
        personalServicio.imprimirInformacion();
    }


}
