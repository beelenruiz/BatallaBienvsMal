package org.iesalandalus.programacion.clasesinteresantes.tp04.arrays.modelo;

public enum RazaBondadosa {
    PELOSO("Peloso", 1),
    SURENO_BUENO("Sureño bueno", 2),
    ENANO("Enano", 3),
    NUMENOREANO("Númenóneano", 4),
    ELFOS("Elfo", 5);
    private final String nombre;
    private final int valentia;

    private RazaBondadosa(String nombre, int valentia) {
        this.nombre = nombre;
        this.valentia = valentia;
    }

    public int getValentia(){
        return valentia;
    }

    public String toString() {
        return nombre;
    }
}
