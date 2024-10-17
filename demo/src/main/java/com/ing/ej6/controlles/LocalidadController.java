package com.ing.ej6.controlles;

import com.ing.ej6.entities.Localidad;
import com.ing.ej6.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseContollerImpl<Localidad, LocalidadServiceImpl> {
}
