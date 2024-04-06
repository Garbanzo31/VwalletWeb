package pe.edu.upc.vwalletweb.servicesinterfaces;

import pe.edu.upc.vwalletweb.entities.Usuario;

import java.util.List;


public interface IUsuarioService{

    public void insert (Usuario usuario);
    public List<Usuario>list();

    public void delete(int id);

    public Usuario listId(int id);

    public List<Usuario> findAllByCorreo(String correo);



}