package com.iesam.SevillaFc.Data;

import com.iesam.SevillaFc.Data.Local.PartidosFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Partidos;
import com.iesam.SevillaFc.Domain.UseCase.PartidosRepository;

import java.util.List;

public class PartidosDataRepository implements PartidosRepository {

    private PartidosFileLocalDataSource localDataSource;

    public PartidosDataRepository(PartidosFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void save(Partidos partidos) {
        this.localDataSource.save(partidos);
    }

    @Override
    public void delete(Integer partidoId) {
        this.localDataSource.delete(partidoId);
    }

    @Override
    public Partidos findById(Integer partidoId) {
        return this.localDataSource.findById(partidoId);
    }

    @Override
    public List<Partidos> getAll() {
        return this.localDataSource.findAll();
    }
}
