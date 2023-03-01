package com.iesam.SevillaFc.Presentation;

import com.iesam.SevillaFc.Data.ArbitroDataRepository;
import com.iesam.SevillaFc.Data.Local.ArbitroFileLocalDataSource;
import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.UseCase.Arbitro.AddArbitroUseCase;

public class NewArbitroForm {

    private Arbitro buidNewArbitro(){
        Arbitro arbitro = new Arbitro();
        arbitro.setId(1);
        arbitro.setNombre("NO");
        arbitro.setCategoria("Alevin");
        arbitro.setFechaNaz("11-2");

        return arbitro;
    }

    private void saveNewArbitro(Arbitro arbitro){
        AddArbitroUseCase addArbitroUseCase = new AddArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        addArbitroUseCase.execute(arbitro);
    }

    public void createNewArbitro(){
        Arbitro arbitro = buidNewArbitro();
        saveNewArbitro(arbitro);
    }
}
