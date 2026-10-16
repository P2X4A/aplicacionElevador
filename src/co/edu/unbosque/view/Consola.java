package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

    private Scanner consola = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int bajarSubirPiso() {
        System.out.println("""
        1. Subir de piso
        2. Bajar de piso
        3. Ingresar Numero De Piso
        4. Salir y cerrar elevador.
        """);
        return consola.nextInt();
    }
    
    public int numeroDePiso() {
    	System.out.println(""" 
    			Pisos: 1  2  3  4  5  6  7  8  9 10
    			       11 12 13 14 15 16 17 18 19 20
    			       21 22 23 24 25 26 27 28 29 30
    			""");
    	return consola.nextInt();
    }
}

