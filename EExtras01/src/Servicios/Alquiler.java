package Servicios;

import Barcos.BarcoMotor;
import Barcos.Bote;
import Barcos.Velero;
import Barcos.Yate;
import java.time.LocalDate;

public class Alquiler {

    private String nomCliente;

    private int dniCliente;

    private LocalDate inicioAlquiler;

    private LocalDate finAlquiler;

    private int posAmarre;

    private Bote elBarco;

    public Alquiler() {
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquiler() {
        return finAlquiler;
    }

    public void setFinAlquiler(LocalDate finAlquiler) {
        this.finAlquiler = finAlquiler;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Bote getElBarco() {
        return elBarco;
    }

    public void setElBarco(Bote elBarco) {
        this.elBarco = elBarco;
    }

    //Esta es la función que determina el precio por el bote
    public double PrecioFinal() {
        double esteCalculo = elBarco.getEslora() * 10;

        if (elBarco instanceof Barcos.Velero) {
            esteCalculo += ((Velero) elBarco).getNumMastiles();

        }
        if (elBarco instanceof BarcoMotor) {
            esteCalculo += ((BarcoMotor) elBarco).getPotenciaMotor();
        }
        if (elBarco instanceof Yate) {
            esteCalculo += ((Yate) elBarco).getNumCamarotes();
        }

        esteCalculo *= (int) finAlquiler.toEpochDay() - inicioAlquiler.toEpochDay();

        return esteCalculo;
    }

    public Alquiler(String nomCliente, int dniCliente, LocalDate inicioAlquiler, LocalDate finAlquiler, int posAmarre, Bote elBarco) {
        this.nomCliente = nomCliente;
        this.dniCliente = dniCliente;
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquiler = finAlquiler;
        this.posAmarre = posAmarre;
        this.elBarco = elBarco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nomCliente=" + nomCliente + ", dniCliente=" + dniCliente + ", inicioAlquiler=" + inicioAlquiler + ", finAlquiler=" + finAlquiler + ", posAmarre=" + posAmarre + ", elBarco=" + elBarco + '}';
    }

}
