package net.itinajero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.itinajero.api.entity.Album;
														//tipo del Entity, tipo de la llave primaria
public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
