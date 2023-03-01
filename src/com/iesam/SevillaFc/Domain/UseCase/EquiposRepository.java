package com.iesam.SevillaFc.Domain.UseCase;

import com.iesam.SevillaFc.Domain.Models.Equipos;

import java.util.List;

public interface EquiposRepository {

    public void save(Equipos equipos);

    public void delete(Integer equiposId);

    public Equipos findById(Integer equiposId);

    public List<Equipos> getAll();
}
