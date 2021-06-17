package pe.edu.upc.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.spring.model.TrabajadorOficio;

@Repository
public interface ITrabajadorOficioRepository extends JpaRepository<TrabajadorOficio, Integer>{
		
	@Query("from TrabajadorOficio to where to.trabajador.cuentaUsuario like %:cuentaUsuario%")
	List<TrabajadorOficio> buscarCuentaTrabajador(@Param("cuentaUsuario") String cuentaUsuario);
	
	@Query("from TrabajadorOficio to where to.oficio.nombreOficio like %:nombreOficio%")
	List<TrabajadorOficio> buscarOficio(@Param("nombreOficio") String nombreOficio);
	
}
