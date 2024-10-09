package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public class Batalla {
    private static EjercitoBien ejercitoBien;
    private static EjercitoMal ejercitoMal;

    public Batalla(int numeroIntegrantes) {
        ejercitoBien = new EjercitoBien(numeroIntegrantes);
        ejercitoMal = new EjercitoMal(numeroIntegrantes);
    }

    public static String getResultado() {
        int valentiaBien = ejercitoBien.getValentia();
        int valentiaMal = ejercitoMal.getValentia();

        if (valentiaBien > valentiaMal) {
            return "Gana el bien";
        } else if (valentiaBien < valentiaMal) {
            return "Gana el mal";
        } else {
            return "Empate";
        }
    }

    @Override
    public String toString() {
        return String.format("Ejército del Bien: " + ejercitoBien + "\nEjército del Mal: " + ejercitoMal);
    }
}
