package com.iesam.SevillaFc.Domain.UseCase.Equipos;

import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class FindEquipoUseCase {

    private EquiposRepository equiposRepository;

    public void FindEquipoUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public void execute(Integer equipoID) {
        equiposRepository.findById(equipoID);
    }
}
