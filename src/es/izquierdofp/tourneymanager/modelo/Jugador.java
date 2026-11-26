/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.izquierdofp.tourneymanager.modelo;

/**
 *
 * @author 2DAM
 */
public class Jugador {
    private int id;
    private int equipoId;
    private int rolId;
    private String nick;
    private String nombre;
    private int edad;

    public Jugador() {
    }

    public Jugador(int id, int equipoId, int rolId, String nick, String nombre, int edad) {
        this.id = id;
        this.equipoId = equipoId;
        this.rolId = rolId;
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Jugador(int equipoId, int rolId, String nick, String nombre, int edad) {
        this.equipoId = equipoId;
        this.rolId = rolId;
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
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

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nick + " (" + nombre + ")";
    }
}
