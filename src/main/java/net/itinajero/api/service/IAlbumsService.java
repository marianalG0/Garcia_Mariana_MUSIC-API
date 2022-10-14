package net.itinajero.api.service;

import java.util.List;
import net.itinajero.api.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();//Encargado de buscar todos los registros en la tabla
	
}
