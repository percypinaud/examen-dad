package upeu.edu.pe.DAD_Examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.edu.pe.DAD_Examen.dto.Detalle_Venta;


@Repository
public interface Detalle_VentaRepository extends JpaRepository<Detalle_Venta, Long> {

}
