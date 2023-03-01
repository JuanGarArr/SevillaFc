package com.iesam.SevillaFc.Domain.UseCase.Arbitro;

import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;

public class FindArbitroUseCase {

    private ArbitroRepository arbitroRepository;

    public void FindArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository = arbitroRepository;
    }

    public void execute(Integer arbitroId) {
        arbitroRepository.findById(arbitroId);
    }
}
