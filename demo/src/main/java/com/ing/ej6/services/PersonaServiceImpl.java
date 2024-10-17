package com.ing.ej6.services;

import com.ing.ej6.entities.Persona;
import com.ing.ej6.repositories.BaseRepository;
import com.ing.ej6.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
/*
    @Override
    public List<Persona> search(String filtro) throws Exception {
      //  try {
      //      List<Persona> personas = personaRepository.findByContainingOrApellidoConteining(filtro , filtro);
       //     return personas;
        //} catch (Exception e) {
         //   throw new Exception(e.getMessage());
        //}
    //}
}*/


