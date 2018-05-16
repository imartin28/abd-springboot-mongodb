package aficion.SA;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aficion.entidad.Aficiones;
import aficion.repositorio.AficionesRepository;
@Service
public class SaAficiones {
	@Autowired
	private AficionesRepository repository;

	public void insertarAficion(Aficiones transferAficiones) {		
			repository.save(transferAficiones);
			
	}

	
	public List<Aficiones> buscarTemaAficion(String tema) {
		return repository.findByTema(tema);
		// TODO Auto-generated method stub
		
	}
	
	
	public void eliminar(String id) {
		repository.deleteById(id);
	}

	public Aficiones buscarPorId(String id) {
		
		// TODO Auto-generated method stub
		return repository.findByid(id).get(0);
	}


	public Aficiones getById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
   	
	}


	

	


	
	
}
