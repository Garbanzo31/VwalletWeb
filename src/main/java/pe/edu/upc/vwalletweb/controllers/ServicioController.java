package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.ServicioDTO;
import pe.edu.upc.vwalletweb.dtos.UsuarioDTO;
import pe.edu.upc.vwalletweb.entities.Servicio;
import pe.edu.upc.vwalletweb.servicesinterfaces.IServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private IServicioService sS;

    @PostMapping
public void insertar(@RequestBody ServicioDTO servicioDTO){
        ModelMapper d=new ModelMapper();
        Servicio servicio=d.map(servicioDTO,Servicio.class);
        sS.insert(servicio);
}

@GetMapping
public List<ServicioDTO> listar(){
    return sS.list().stream().map(y->{
        ModelMapper m = new ModelMapper();
        return m.map(y,ServicioDTO.class);
    }).collect(Collectors.toList());
}

}
