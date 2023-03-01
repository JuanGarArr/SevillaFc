package com.iesam.SevillaFc.Domain.UseCase.Equipos;

import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class AddEquiposUseCase {

    private EquiposRepository equiposRepository;


    public AddEquiposUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Equipos equipos) {
        equiposRepository.save(equipos);
    }
}
