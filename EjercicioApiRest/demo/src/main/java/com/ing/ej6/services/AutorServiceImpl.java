package com.ing.ej6.services;

import com.ing.ej6.entities.Autor;
import com.ing.ej6.entities.Persona;
import com.ing.ej6.repositories.AutorRepository;
import com.ing.ej6.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long>   implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}