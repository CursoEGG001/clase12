/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
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
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
