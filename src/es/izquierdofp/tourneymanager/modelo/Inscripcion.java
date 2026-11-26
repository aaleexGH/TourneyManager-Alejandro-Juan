/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.izquierdofp.tourneymanager.modelo;

/**
 *
 * @author 2DAM
 */
public class Inscripcion {
    private int id;
    private int equipoId;
    private int torneoId;
    private Integer posicion; // NULL si aún no se ha jugado

    public Inscripcion() {
    }

    public Inscripcion(int id, int equipoId, int torneoId, Integer posicion) {
        this.id = id;
        this.equipoId = equipoId;
        this.torneoId = torneoId;
        this.posicion = posicion;
    }

    public Inscripcion(int equipoId, int torneoId, Integer posicion) {
        this.equipoId = equipoId;
        this.torneoId = torneoId;
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(int equipoId) {
        this.equipoId = equipoId;
    }

    public int getTorneoId() {
        return torneoId;
    }

    public void setTorneoId(int torneoId) {
        this.torneoId = torneoId;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
}

