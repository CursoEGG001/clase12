package Barcos;

public class Yate extends BarcoMotor {

    private int numCamarotes;

    public Yate(int numCamarotes, double potenciaMotor) {
        super(potenciaMotor);
        this.numCamarotes = numCamarotes;
    }

    public Yate(int numCamarotes, double potenciaMotor, String matricula, double eslora, int AnioFabricacion) {
        super(potenciaMotor, matricula, eslora, AnioFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public Yate(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "numCamarotes=" + numCamarotes +", potenciaMotor="+ super.getPotenciaMotor()+ '}';
    }

}
