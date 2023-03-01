package com.iesam.SevillaFc.Presentation;

import com.iesam.SevillaFc.Data.EquiposDataRepository;
import com.iesam.SevillaFc.Data.Local.EquiposFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.Equipos.AddEquiposUseCase;

public class NewEquipoForm {
    private Equipos buildNewEquipo(){
        Equipos equipos = new Equipos();
        equipos.setId(1);
        equipos.setNombre("NO");
        equipos.setCategoria("Alevin");
        equipos.setJugadores(20);

        return equipos;
    }

    private void saveNewEquipo(Equipos equipos){
        AddEquiposUseCase addEquiposUseCase = new AddEquiposUseCase(new EquiposDataRepository(EquiposFileLocalDataSource.getInstance()));
        addEquiposUseCase.execute(equipos);
    }

    public void createNewEquipo(){
        Equipos equipos = buildNewEquipo();
        saveNewEquipo(equipos);
    }
}
