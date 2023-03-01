package com.iesam.SevillaFc.Domain.UseCase.Arbitro;
import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;

public class DeleteArbitroUseCase {
    private ArbitroRepository arbitroRepository;

    public DeleteArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository=arbitroRepository;
    }


    public void execute(Integer arbitroId) {
        arbitroRepository.delete(arbitroId);
    }
}
