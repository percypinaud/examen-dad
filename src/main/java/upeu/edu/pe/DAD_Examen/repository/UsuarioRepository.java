package upeu.edu.pe.DAD_Examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.DAD_Examen.dto.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
