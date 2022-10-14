package net.itinajero.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.itinajero.api.entity.Album;
import net.itinajero.api.repository.AlbumsRepository;
import net.itinajero.api.service.IAlbumsService;

@Service //No olvidar la anotacion en la clase que implementa la interfaz
public class AlbumsService implements IAlbumsService {

	//Declarando la variable de tipo repository
	@Autowired //Automaticamente se inyecta una instancia de nuestro repo
	private AlbumsRepository repoAlbums;
	
	//Implementando el metodo buscar todos, que regrese todos los registros
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

}
