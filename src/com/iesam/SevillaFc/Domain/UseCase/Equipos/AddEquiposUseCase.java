package com.iesam.SevillaFc.Domain.UseCase.Equipos;

import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class AddEquiposUseCase {

    private EquiposRepository equiposRepository;

    public void AddEquiposUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Equipos equipoID) {
        equiposRepository.save(equipoID);
    }
}
