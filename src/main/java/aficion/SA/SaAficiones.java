package aficion.SA;



import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
	
	
	public void delete(String id) {
		repository.deleteById(id);
	}

	/*public  Aficiones buscarPorApodo(String apodo){
		return (Aficiones) repository.findByApodo(apodo);
	}*/
	public List<Aficiones> buscarPorId(String id) {
		
		// TODO Auto-generated method stub
		return repository.findByid(id);
	}


	

	


	
	
}
