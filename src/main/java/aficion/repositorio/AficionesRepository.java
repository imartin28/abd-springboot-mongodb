package aficion.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import aficion.entidad.Aficiones;

public interface AficionesRepository extends MongoRepository<Aficiones, String> {
	List<Aficiones> findByTema(String tema);
	
	//Aficiones findById(String id);

	Aficiones findByApodo(String apodo);
	
}
