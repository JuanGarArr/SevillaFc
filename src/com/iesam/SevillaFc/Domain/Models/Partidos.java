package com.iesam.SevillaFc.Domain.Models;

public class Partidos {
    private Integer id;
    private Equipos eqLocal;
    private Equipos eqVistiante;
    private Arbitro arbitro;
    private String echaPartido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Equipos getEqLocal() {
        return eqLocal;
    }

    public void setEqLocal(Equipos eqLocal) {
        this.eqLocal = eqLocal;
    }

    public Equipos getEqVistiante() {
        return eqVistiante;
    }

    public void setEqVistiante(Equipos eqVistiante) {
        this.eqVistiante = eqVistiante;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public String getEchaPartido() {
        return echaPartido;
    }

    public void setEchaPartido(String echaPartido) {
        this.echaPartido = echaPartido;
    }
}
