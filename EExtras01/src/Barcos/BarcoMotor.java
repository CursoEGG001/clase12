package Barcos;

public class BarcoMotor extends Bote {

    private double potenciaMotor;

    public BarcoMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoMotor(double potenciaMotor, String matricula, double eslora, int AnioFabricacion) {
        super(matricula, eslora, AnioFabricacion);
        this.potenciaMotor = potenciaMotor;
    }

    public BarcoMotor() {
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaMotor=" + potenciaMotor + '}';
    }


}
