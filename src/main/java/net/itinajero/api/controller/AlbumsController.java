package net.itinajero.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/albums") 
	public Album guardar(@RequestBody Album album) {
		serviceAlbums.guardar(album);
		return album;
	}
	
	@PutMapping("/albums")
	public Album modificar(@RequestBody Album album) {
		serviceAlbums.guardar(album); //Guardando en la base de datos
		return album;
	} 
	
	@DeleteMapping("/albums/{id}")
	public String eliminar(@PathVariable("id") int idAlbum) {
		serviceAlbums.eliminar(idAlbum);
		return "Registro Eliminado";
	}
}
