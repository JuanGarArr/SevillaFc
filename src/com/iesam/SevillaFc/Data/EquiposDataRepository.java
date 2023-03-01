package com.iesam.SevillaFc.Data;
import com.iesam.SevillaFc.Data.Local.EquiposFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

import java.util.List;

public class EquiposDataRepository implements EquiposRepository {

    private EquiposFileLocalDataSource localDataSource;

    public EquiposDataRepository(EquiposFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }


    @Override
    public void save(Equipos equipos) {
        this.localDataSource.save(equipos);
    }

    @Override
    public void delete(Integer equiposId) {
        this.localDataSource.delete(equiposId);
    }

    @Override
    public Equipos findById(Integer equiposId) {
        return this.localDataSource.findById(equiposId);
    }

    @Override
    public List<Equipos> getAll() {
        return this.localDataSource.findAll();
    }

}
