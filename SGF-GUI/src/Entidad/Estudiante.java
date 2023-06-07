/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 * * Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione la información sobre las
 * personas vinculadas con la misma y que se pueden clasificar en tres tipos: estudiantes, profesores y personal de servicio.
 * A continuación, se detalla qué tipo de información debe gestionar esta aplicación:
 * 

 * • En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados. 
 * • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento pertenecen (lenguajes, matemáticas, arquitectura, ...). 
 * • Sobre el personal de servicio, hay que conocer a qué sección están asignados (biblioteca, decanato, secretaría, ...).
 * 
 * 
 * Incluya un programa de prueba que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 *
 * @author pc
 */
public class Estudiante extends Persona {

    protected String curso;

    public Estudiante(String nombre, String apellidos, String numeroIdentificacion, String estadoCivil, String curso) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public void matricularEnCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tEstudiante :" + "\n\t Curso: " + curso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
