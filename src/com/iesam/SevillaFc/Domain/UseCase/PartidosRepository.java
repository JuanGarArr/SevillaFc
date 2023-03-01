package com.iesam.SevillaFc.Domain.UseCase;

import com.iesam.SevillaFc.Domain.Models.Partidos;

import java.util.List;

public interface PartidosRepository {

    public void save(Partidos partidos);

    public void delete(Integer partidoId);

    public Partidos findById(Integer partidoId);

    public List<Partidos> getAll();
}
