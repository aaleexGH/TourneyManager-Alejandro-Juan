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
public class Torneo {
    private int id;
    private String nombre;
    private int juegoId;
    private String fecha;  
    private double premio;
    private boolean online;

    public Torneo() {
    }

    public Torneo(int id, String nombre, int juegoId, String fecha, double premio, boolean online) {
        this.id = id;
        this.nombre = nombre;
        this.juegoId = juegoId;
        this.fecha = fecha;
        this.premio = premio;
        this.online = online;
    }

    public Torneo(String nombre, int juegoId, String fecha, double premio, boolean online) {
        this.nombre = nombre;
        this.juegoId = juegoId;
        this.fecha = fecha;
        this.premio = premio;
        this.online = online;
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

    public int getJuegoId() {
        return juegoId;
    }

    public void setJuegoId(int juegoId) {
        this.juegoId = juegoId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return nombre + " (" + fecha + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return id == torneo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

