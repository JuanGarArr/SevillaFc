package com.iesam.SevillaFc.Presentation;

import com.iesam.SevillaFc.Data.EquiposDataRepository;
import com.iesam.SevillaFc.Data.Local.EquiposFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.Equipos.AddEquiposUseCase;

public class DeleteEquipoForm {

    public void  deleteEquipoForm(Equipos equipos){
        AddEquiposUseCase addEquiposUseCase = new AddEquiposUseCase(new EquiposDataRepository(EquiposFileLocalDataSource.getInstance()));
        addEquiposUseCase.execute(equipos);

    }
}
