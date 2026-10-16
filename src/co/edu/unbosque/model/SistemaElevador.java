package co.edu.unbosque.model;

public class SistemaElevador {

    private static final int PISO_MIN = 0;
    private static final int PISO_MAX = 30;

    public void subirPiso(Elevador elevador) {
        int actual = elevador.getNumeroPiso();
        if (actual < PISO_MAX) {
            elevador.setNumeroPiso(actual + 1);
        }
    }

    public void bajarPiso(Elevador elevador) {
        int actual = elevador.getNumeroPiso();
        if (actual > PISO_MIN) {
            elevador.setNumeroPiso(actual - 1);
        }
    }
    
    public void irAPiso(int pisoDestino, Elevador elevador) {
        if (pisoDestino >= PISO_MIN && pisoDestino <= PISO_MAX) {
            elevador.setNumeroPiso(pisoDestino);
        } else {
            // Si está fuera de rango, no cambia el piso
        }
    }
}
