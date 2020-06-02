package com.example.appcursoandroidv2.beans;

import java.io.Serializable;

public class Usuario implements Serializable {

    private long id;
    private String nombre;
    private String dni;
    private String password;
    private long lastConn;
    private long currentConn;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String dni, String password, long lastConn) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.password = password;
        this.lastConn = lastConn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getLastConn() {
        return lastConn;
    }

    public void setLastConn(long lastConn) {
        this.lastConn = lastConn;
    }

    public long getCurrentConn() {
        return currentConn;
    }

    public void setCurrentConn(long currentConn) {
        this.currentConn = currentConn;
    }
}
