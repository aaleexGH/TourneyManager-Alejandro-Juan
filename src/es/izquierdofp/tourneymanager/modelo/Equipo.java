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
public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    private int fundacion;
    private String logo;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String ciudad, int fundacion, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.logo = logo;
    }

    public Equipo(String nombre, String ciudad, int fundacion, String logo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.logo = logo;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return id == equipo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

