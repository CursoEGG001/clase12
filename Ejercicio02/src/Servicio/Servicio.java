/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author pc
 */
public class Servicio {
    public static void iniciar() {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        
        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        
        System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
        System.out.println("Precio final del televisor: $" + televisor.precioFinal());
    }
}