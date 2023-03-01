package com.iesam.SevillaFc.Domain.UseCase.Equipos;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.EquiposRepository;

public class FindEquipoUseCase {

    private EquiposRepository equiposRepository;

    public FindEquipoUseCase(EquiposRepository equiposRepository) {
        this.equiposRepository = equiposRepository;
    }

    public Equipos execute(Integer equipoID) {
        return equiposRepository.findById(equipoID);

    }
}
