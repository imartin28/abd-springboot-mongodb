package aficion.SA;



import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
	}
	
	
	
	public List<Aficiones> buscarTodosLosTemas(){
		List<Aficiones> aficiones = new ArrayList<>();
        repository.findAll().forEach(aficiones::add);
		return aficiones;
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

	public Aficiones query() {
		Query query = new Query();
		query.addCriteria(Criteria.where("precio").gt(10));
		List<User> users = mongoTemplate.find(query, User.class);
	}
	


	

	


	
	
}
