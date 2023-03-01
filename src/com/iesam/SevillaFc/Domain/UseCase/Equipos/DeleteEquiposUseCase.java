package com.iesam.SevillaFc.Domain.UseCase.Equipos;

import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class DeleteEquiposUseCase {

    private EquiposRepository equiposRepository;

    public void DeleteEquiposUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Integer equipoID) {
        equiposRepository.delete(equipoID);
    }
}
