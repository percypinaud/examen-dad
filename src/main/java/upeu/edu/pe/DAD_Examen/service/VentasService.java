package upeu.edu.pe.DAD_Examen.service;

import java.util.List;

import upeu.edu.pe.DAD_Examen.dto.Ventas;

public interface VentasService {
	List<Ventas> listarventas();
	Ventas crearVentas(Ventas ventas);
	Ventas actualizarVentas(Ventas ventas);
	Ventas buscarPorId(Long idventas);
	void eliminarporId(Long idventas);
}
