package Servicios;

import Barcos.BarcoMotor;
import Barcos.Bote;
import Barcos.Velero;
import Barcos.Yate;
import java.time.LocalDate;
import java.util.Scanner;

public class ServicioAlquiler {

    private int diasOcupa;

    private double ModuloAmarre;
    
    private int posAmarre;

    public void paraBarco() {
        
        //Inicio de un nuevo alquiler
        Alquiler nuevo = new Alquiler();

        Bote chiquito = new Bote("AssaN22002", 13, 2010);
        Velero imponente = new Velero(2, "Amma3453", 7, 2012);
        BarcoMotor generoso = new BarcoMotor(23, "MSMT223", 11, 2000);
        Yate enorme = new Yate(3, 47, "LOM7689", 17, 2015);

        Scanner opc = new Scanner(System.in, "UTF-8").useDelimiter("\n");
        
        // Ingreso de los datos necesarios
        System.out.println("Ingrese los días por alquilar:");
        diasOcupa=opc.nextInt();
        System.out.println("Ingrese la posición a ocupar:");
        posAmarre=opc.nextInt();
        System.out.println("Ingrese el precio base del amarre:");
        ModuloAmarre=opc.nextDouble();
        
        //Bote temporal para hacer la selección
        Bote elegido;
        
        // Ingreso del cliente
        String nombre;
        int idCliente;

        do {

            System.out.println("Ingrese el nombre del cliente:");
            nombre=opc.next();
            System.out.println("Ingrese el documento del cliente:");
            idCliente=opc.nextInt();
            
            System.out.println("Elija una opción:");
            System.out.println("1. Chiquito"
                    + "\n2. Imponente"
                    + "\n3. Generoso"
                    + "\n4. Enorme"
                    + "\nOtro. Cancelar");
            switch (opc.nextInt()) {
                case 1:
                    elegido=chiquito;
                    break;
                case 2:
                    elegido=imponente;
                    break;
                case 3:
                    elegido=generoso;
                    break;
                case 4:
                    elegido=enorme;
                    break;
                default:
                    throw new AssertionError("No sigue con la selección",null);
            }
            System.out.println("Continuar?");
        } while (opc.next().equalsIgnoreCase("s"));
        nuevo.setElBarco(elegido);
        nuevo.setNomCliente(nombre);
        nuevo.setDniCliente(idCliente);
        nuevo.setPosAmarre(posAmarre);
        nuevo.setInicioAlquiler(LocalDate.now());
        nuevo.setFinAlquiler((LocalDate.now().plusDays(diasOcupa)));
        
        
        // Muestra el contenido para ser catalogado
        System.out.println("Este sería el aquiler:");
        System.out.println(nuevo);
        System.out.println("");
        System.out.println(ModuloAmarre+nuevo.PrecioFinal()*diasOcupa+" sería el total a abonar.");
    }

}
