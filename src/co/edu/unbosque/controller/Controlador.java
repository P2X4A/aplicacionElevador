package co.edu.unbosque.controller;

import co.edu.unbosque.model.Elevador;
import co.edu.unbosque.model.SistemaElevador;
import co.edu.unbosque.view.Consola;

public class Controlador {

    private SistemaElevador sistemaElevador;
    private Consola consola;
    private Elevador elevador;

    public void ejecutar() {
        sistemaElevador = new SistemaElevador();
        consola = new Consola();
        elevador = new Elevador();

        int opcionConsola;

        do {
            // 1. Mostrar piso actual
            consola.mostrarMensaje("Piso actual: " + elevador.getNumeroPiso());

            // 2. Leer opción del menú
            opcionConsola = consola.bajarSubirPiso();

            // 3. Actuar según la opción
            switch (opcionConsola) {
                case 1 -> {
                    sistemaElevador.subirPiso(elevador);
                    consola.mostrarMensaje("Subiendo 1 piso");
                }
                case 2 -> {
                    sistemaElevador.bajarPiso(elevador);
                    consola.mostrarMensaje("Bajando 1 piso");
                }
                case 3 -> {
                    // Nuevo: ir directamente a un piso
                    int pisoDestino = consola.numeroDePiso();
                    sistemaElevador.irAPiso(pisoDestino, elevador);
                    consola.mostrarMensaje("Moviendo al piso " + pisoDestino);
                }
                case 4 -> {
                    consola.mostrarMensaje("Que vuelva pronto...");
                }
                default -> {
                    consola.mostrarMensaje("Ingrese una opción válida");
                }
            }

        } while (opcionConsola != 4); // Ahora sale con 4
    }
}
