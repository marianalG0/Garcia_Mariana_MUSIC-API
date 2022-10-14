package net.itinajero.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.itinajero.api.entity.Album;
import net.itinajero.api.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {
	
	//Nuestra clase de service 
	@Autowired //Inyectando instancia 
	private IAlbumsService serviceAlbums;
	
	//Listado de album guardado en la tabla de albums
	@GetMapping("/albums")
	public List<Album> buscarTodos(){
		return serviceAlbums.buscarTodos();
	}
	
}
