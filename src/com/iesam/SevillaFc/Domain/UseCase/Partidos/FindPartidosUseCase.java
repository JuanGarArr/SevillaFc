package com.iesam.SevillaFc.Domain.UseCase.Partidos;

import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class FindPartidosUseCase {

    private EquiposRepository equiposRepository;

    public void FindEquipoUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Integer arbitroId) {
        equiposRepository.findById(arbitroId);
    }
}
