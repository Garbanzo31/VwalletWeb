package pe.edu.upc.vwalletweb.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vwalletweb.dtos.ServicioDTO;
import pe.edu.upc.vwalletweb.dtos.UsuarioDTO;
import pe.edu.upc.vwalletweb.entities.Usuario;
import pe.edu.upc.vwalletweb.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService iS;

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO usuarioDTO){
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO,Usuario.class);
        iS.insert(usuario);
    }
    @GetMapping
    public List<UsuarioDTO> listar(){
        return iS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDTO listar(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(iS.listId(id), UsuarioDTO.class);
        return dto;
    }

    @GetMapping("/find")
    public List<UsuarioDTO> buscar(@RequestParam String correo){
        return iS.findAllByCorreo(correo).stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }




}



