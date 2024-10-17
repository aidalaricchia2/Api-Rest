package com.ing.ej6.controlles;

import com.ing.ej6.entities.Base;
import com.ing.ej6.entities.Persona;
import com.ing.ej6.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public abstract class BaseContollerImpl<E extends Base, S extends BaseServiceImpl<E,Long>> implements BaseContoller<E, Long> {
    @Autowired
    protected S servicio;

    @GetMapping("") // solicitudes HTTP GET

    //metodo que  se ejecutará cuando se haga una solicitud GET a la ruta especificada.
    public ResponseEntity<?> getAll(){
        try{
            //ResponseEntity contiene el status de la respuesta
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        }catch (Exception e){
            //formato de respuesta json
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente màs tarde.\"}");

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        //PathVariable: extraer valores de los parámetros de la URL en las solicitudes HTTP
        try{
            //ResponseEntity contiene el status de la respuesta
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        }catch (Exception e){
            //formato de respuesta json
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Intente màs tarde.\"}");

        }

    }
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try{
            //ResponseEntity contiene el status de la respuesta
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        }catch (Exception e){
            //formato de respuesta json
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente màs tarde.\"}");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity){
        //RequestBody: vincular el cuerpo de la solicitud HTTP con un objeto de Java
        try{
            //ResponseEntity contiene el status de la respuesta
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        }catch (Exception e){
            //formato de respuesta json
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente màs tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        try{
            //ResponseEntity contiene el status de la respuesta
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
        }catch (Exception e){
            //formato de respuesta json
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Intente màs tarde.\"}");
        }
    }
}
