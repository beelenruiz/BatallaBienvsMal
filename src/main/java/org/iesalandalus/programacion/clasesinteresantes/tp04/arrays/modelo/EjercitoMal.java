package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

import java.util.Arrays;
import java.util.Random;

public class EjercitoMal {
    private Random generador  =new Random();
    private final RazaMalvada[] ejercitoMal;
    public EjercitoMal(int numeroIntegrantes){
        if (numeroIntegrantes < 1) {
            throw new IllegalArgumentException("Numero de integrantes no valido.");
        }

        ejercitoMal = new RazaMalvada[numeroIntegrantes];
        int numRandom;
        for (int i = 0; i < ejercitoMal.length; i++) {
            numRandom = generador.nextInt(RazaMalvada.values().length);
            ejercitoMal[i] = RazaMalvada.values()[numRandom];
        }
    }

    public int getValentia(){
        int valentiaTotal = 0;
        for (int i = 0; i < ejercitoMal.length; i++) {
            valentiaTotal += ejercitoMal[i].getValentia();
        }
        return valentiaTotal;
    }

    @Override
    public String toString() {
        return Arrays.toString(ejercitoMal);
    }
}
