package upeu.edu.pe.DAD_Examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.DAD_Examen.dto.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
 
}
