package com.iesam.SevillaFc.Domain.UseCase.Partidos;

import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class DeletePartidosUseCase {
    private EquiposRepository equiposRepository;

    public void DeleteEquipoUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Integer equipoId) {
        equiposRepository.delete(equipoId);
    }
}
