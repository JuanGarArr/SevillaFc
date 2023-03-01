package com.iesam.SevillaFc.Presentation;

import com.iesam.SevillaFc.Data.ArbitroDataRepository;
import com.iesam.SevillaFc.Data.Local.ArbitroFileLocalDataSource;
import com.iesam.SevillaFc.Domain.UseCase.Arbitro.DeleteArbitroUseCase;

public class DeleteArbitroForm {
    public void  deleteArbitroForm(Integer arbitroId){
        DeleteArbitroUseCase deleteArbitroUseCase = new DeleteArbitroUseCase(new ArbitroDataRepository(ArbitroFileLocalDataSource.getInstance()));
        deleteArbitroUseCase.execute(arbitroId);

    }
}
