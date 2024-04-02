package pe.edu.upc.vwalletweb.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.vwalletweb.entities.Servicio;
import pe.edu.upc.vwalletweb.repositories.IServiceRepository;
import pe.edu.upc.vwalletweb.servicesinterfaces.IServicioService;

import java.util.List;

@Service
public class ServicioServiceImplement implements IServicioService {
@Autowired
   private IServiceRepository sR;
    @Override
    public void insert(Servicio servicio) {
sR.save(servicio);
    }

    @Override
    public List<Servicio> list() {
        return sR.findAll();
    }
}
