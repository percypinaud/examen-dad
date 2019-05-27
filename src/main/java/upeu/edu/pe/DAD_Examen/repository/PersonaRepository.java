package upeu.edu.pe.DAD_Examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.DAD_Examen.dto.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	@Query("select per from Persona per where per.dni=:dni")
	List<Persona> buscarPersonaporDniJPAREPOSITORY(@Param("dni")int dni);  
}
