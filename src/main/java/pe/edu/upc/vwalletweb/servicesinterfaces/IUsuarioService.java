package pe.edu.upc.vwalletweb.servicesinterfaces;

import pe.edu.upc.vwalletweb.entities.Usuario;

import java.util.List;


public interface IUsuarioService{

    public void insert (Usuario usuario);
    public List<Usuario>list();



}