package prototipo.controlador;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AficionesRepository extends MongoRepository<Aficiones, String> {
	List<Aficiones> findByTema(String tema);
	
	
}
