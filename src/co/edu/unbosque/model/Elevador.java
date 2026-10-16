package co.edu.unbosque.model;

public class Elevador {
    private int numeroPiso;

    public Elevador() {
        this.numeroPiso = 0; // piso inicial
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}