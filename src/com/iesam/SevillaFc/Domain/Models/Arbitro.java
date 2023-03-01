package com.iesam.SevillaFc.Domain.Models;

public class Arbitro {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String fechaNaz;
    private String categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNaz() {
        return fechaNaz;
    }

    public void setFechaNaz(String fechaNaz) {
        this.fechaNaz = fechaNaz;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
