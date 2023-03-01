package com.iesam.SevillaFc.Domain.UseCase.Arbitro;
import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;

public class FindArbitroUseCase {

    private ArbitroRepository arbitroRepository;

    public FindArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository=arbitroRepository;
    }

    public void FindArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository = arbitroRepository;
    }

    public Arbitro execute(Integer arbitroId) {
        return this.arbitroRepository.findById(arbitroId);
    }
}
