package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoBien {
    private Random generador = new Random();
    private final RazaBondadosa[] ejercitoBien;
    public EjercitoBien(int numeroIntegrantes){
        if (numeroIntegrantes < 1) {
            throw new IllegalArgumentException("Numero de integrantes no valido.");
        }

        ejercitoBien = new RazaBondadosa[numeroIntegrantes];
        int numRandom;
        for (int i = 0; i < numeroIntegrantes; i++) {
            numRandom = generador.nextInt(RazaBondadosa.values().length);
            ejercitoBien[i] = RazaBondadosa.values()[numRandom];
        }
    }

    public int getValentia(){
        int valentiaTotal = 0;
        for (int i = 0; i < ejercitoBien.length; i++) {
            valentiaTotal += ejercitoBien[i].getValentia();
        }
        return valentiaTotal;
    }

    @Override
    public String toString() {
        return Arrays.toString(ejercitoBien);
    }
}
