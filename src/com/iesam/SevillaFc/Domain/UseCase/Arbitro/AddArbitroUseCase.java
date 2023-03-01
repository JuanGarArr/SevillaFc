package com.iesam.SevillaFc.Domain.UseCase.Arbitro;
import com.iesam.SevillaFc.Domain.Models.Arbitro;
import com.iesam.SevillaFc.Domain.UseCase.ArbitroRepository;

public class AddArbitroUseCase {

    private ArbitroRepository arbitroRepository;

    public AddArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository=arbitroRepository;
    }

    public void AddArbitroUseCase(ArbitroRepository arbitroRepository) {
        this.arbitroRepository = arbitroRepository;
    }

    public void execute(Arbitro arbitro) {
        arbitroRepository.save(arbitro);
    }
}
