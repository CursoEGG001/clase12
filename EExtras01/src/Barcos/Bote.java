package Barcos;

public class Bote {

    private String matricula;

    private double eslora;

    private int AnioFabricacion;

    public Bote() {
    }

    public Bote(String matricula, double eslora, int AnioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.AnioFabricacion = AnioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return AnioFabricacion;
    }

    public void setAnioFabricacion(int AnioFabricacion) {
        this.AnioFabricacion = AnioFabricacion;
    }

    @Override
    public String toString() {
        return "Bote{" + "matricula=" + matricula + ", eslora=" + eslora + ", AnioFabricacion=" + AnioFabricacion + '}';
    }


}
