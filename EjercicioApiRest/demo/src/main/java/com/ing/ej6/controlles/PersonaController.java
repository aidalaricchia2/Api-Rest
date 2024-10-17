package com.ing.ej6.controlles;

import com.ing.ej6.entities.Persona;
import com.ing.ej6.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseContollerImpl<Persona, PersonaServiceImpl> {


}
