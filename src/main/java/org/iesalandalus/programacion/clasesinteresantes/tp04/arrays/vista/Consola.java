package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.vista;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola(){

    }
    public static int leerNumeroIntegrantes(){
        int numeroIntegrantes;
        do {
            System.out.print("Dime el número de integrantes de cada ejercito: ");
            numeroIntegrantes = Entrada.entero();
        } while (numeroIntegrantes <= 0);
        return numeroIntegrantes;
    }
}
