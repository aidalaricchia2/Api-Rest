package com.ing.ej6.repositories;

import com.ing.ej6.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
