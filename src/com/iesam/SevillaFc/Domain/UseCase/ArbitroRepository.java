package com.iesam.SevillaFc.Domain.UseCase;

import com.iesam.SevillaFc.Domain.Models.Arbitro;

import java.util.List;

public interface ArbitroRepository {

    public void save(Arbitro arbitro);

    public void delete(Integer arbitroId);

    public Arbitro findById(Integer arbitroId);

    public List<Arbitro> getAll();
}
