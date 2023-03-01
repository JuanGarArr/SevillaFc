package com.iesam.SevillaFc.Data;

import com.iesam.SevillaFc.Data.Local.ArbitroFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;

import java.util.List;

public class ArbitroDataRepository implements ArbitroRepository {


        private ArbitroFileLocalDataSource localDataSource;

        public ArbitroDataRepository(ArbitroFileLocalDataSource localDataSource) {
            this.localDataSource = localDataSource;
        }


    @Override
    public void save(Arbitro arbitro) {
        this.localDataSource.save(arbitro);
    }

    @Override
    public void delete(Integer arbitroId) {
        this.localDataSource.delete(arbitroId);
    }

    @Override
    public Arbitro findById(Integer arbitroId) {
        return this.localDataSource.findById(arbitroId);
    }

    @Override
    public List<Arbitro> getAll() {
        return this.localDataSource.findAll();
    }
}

