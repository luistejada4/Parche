package com.luistejada.Parche;

/**
 * Created by luistejada on 06/12/16.
 */
public class Jugador {

    private String nombre;
    private Jugador siguiente;
    private Ficha[] fichas;
    private int color;

    public Jugador(String nombre, Jugador siguiente, Ficha[] fichas, int color) {

        this.nombre = nombre;
        this.siguiente = siguiente;
        this.fichas = fichas;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }

    public Ficha[] getFichas() {
        return fichas;
    }

    public void setFichas(Ficha[] fichas) {
        this.fichas = fichas;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
