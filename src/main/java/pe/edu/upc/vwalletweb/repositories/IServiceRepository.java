package pe.edu.upc.vwalletweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.vwalletweb.entities.Servicio;

import java.util.List;

@Repository
public interface IServiceRepository extends JpaRepository<Servicio,Integer> {

    public List<Servicio>findAllByEstado(String estado);
}

