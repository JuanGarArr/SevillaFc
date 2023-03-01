package com.iesam.SevillaFc.Domain.UseCase.Partidos;

import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class AddEquipoUseCase {

    private EquiposRepository equiposRepository;

    public void AddEquipoUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Equipos equipoId) {
        equiposRepository.save(equipoId);
    }
}
