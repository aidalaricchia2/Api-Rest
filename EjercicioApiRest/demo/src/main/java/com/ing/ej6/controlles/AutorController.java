package com.ing.ej6.controlles;


import com.ing.ej6.entities.Autor;
import com.ing.ej6.entities.Persona;
import com.ing.ej6.services.AutorServiceImpl;
import com.ing.ej6.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseContollerImpl<Autor, AutorServiceImpl> {


}


