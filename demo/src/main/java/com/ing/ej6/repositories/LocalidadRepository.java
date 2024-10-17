package com.ing.ej6.repositories;

import com.ing.ej6.entities.Localidad;
import com.ing.ej6.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalidadRepository extends BaseRepository<Localidad, Long>{

}
