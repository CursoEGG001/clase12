package Barcos;

public class Velero extends Bote {

    private int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora, int AnioFabricacion) {
        super(matricula, eslora, AnioFabricacion);
        this.numMastiles = numMastiles;
    }

   

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + '}';
    }

}
