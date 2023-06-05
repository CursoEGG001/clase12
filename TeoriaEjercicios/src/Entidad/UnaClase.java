/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class UnaClase implements laInterfaz {
    
    @Override
    public void unMetodo(){
        System.out.println("El método...implementado.");
    }

    @Override
    public int unaSuma() {
        int suma = 2 + 2;
        return suma;
    }
}
