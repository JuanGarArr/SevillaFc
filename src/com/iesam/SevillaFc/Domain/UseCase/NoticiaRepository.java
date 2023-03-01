package com.iesam.SevillaFc.Domain.UseCase;

import com.iesam.SevillaFc.Domain.Models.Noticia;

import java.util.List;

public interface NoticiaRepository {

    public void save(Noticia noticia);

    public void delete(Integer noticiaId);

    public Noticia findById(Integer noticiaId);

    public List<Noticia> getAll();
}
