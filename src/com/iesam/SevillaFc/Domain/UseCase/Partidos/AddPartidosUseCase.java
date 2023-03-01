package com.iesam.SevillaFc.Domain.UseCase.Partidos;

import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.Models.Partidos;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;
import com.iesam.SevillaFc.Domain.UseCase.PartidosRepository;

public class AddPartidosUseCase {

    private PartidosRepository partidosRepository;

    public void AddEquipoUseCase(PartidosRepository partidosRepository) {
        this.partidosRepository = partidosRepository;
    }

    public void execute(Partidos partidosId) {
        partidosRepository.save(partidosId);
    }
}
