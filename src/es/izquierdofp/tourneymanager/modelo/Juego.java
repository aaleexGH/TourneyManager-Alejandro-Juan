/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.izquierdofp.tourneymanager.modelo;

import java.util.Objects;
/**
 *
 * @author 2DAM
 */
public class Juego {
    private int id;
    private String nombre;

    public Juego() {
    }

    public Juego(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Juego juego = (Juego) o;
        return id == juego.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

