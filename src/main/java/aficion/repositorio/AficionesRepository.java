package aficion.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import aficion.entidad.Aficiones;

public interface AficionesRepository extends MongoRepository<Aficiones, String> {
	List<Aficiones> findByTema(String tema);
	
	
}
