package com.iesam.SevillaFc.Presentation;

import com.iesam.SevillaFc.Data.ArbitroDataRepository;
import com.iesam.SevillaFc.Data.EquiposDataRepository;
import com.iesam.SevillaFc.Data.Local.ArbitroFileLocalDataSource;
import com.iesam.SevillaFc.Data.Local.EquiposFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.Models.Equipos;
import com.iesam.SevillaFc.Domain.UseCase.Arbitro.FindArbitroUseCase;
import com.iesam.SevillaFc.Domain.UseCase.Equipos.AddEquiposUseCase;
import com.iesam.SevillaFc.Domain.UseCase.Equipos.FindEquipoUseCase;
import com.iesam.SevillaFc.Domain.UseCase.Partidos.AddPartidosUseCase;

public class NewPartidoForm {
    private Arbitro findArbitro(Integer arbitroId){
        FindArbitroUseCase findArbitroUseCase = new FindArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        return findArbitroUseCase.execute(arbitroId);
    }

    private Equipos findEquipos(Integer equipoId){
        FindEquipoUseCase findEquipoUseCase = new FindEquipoUseCase(new EquiposDataRepository(EquiposFileLocalDataSource.getInstance()));
        return findEquipoUseCase.execute(equipoId);
    }
    private void savePartido(){

    }
}
