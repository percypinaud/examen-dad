package upeu.edu.pe.DAD_Examen.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.DAD_Examen.dto.Ventas;
import upeu.edu.pe.DAD_Examen.repository.VentasRepository;
import upeu.edu.pe.DAD_Examen.service.VentasService;

@Service
public class VentasServiceImp implements VentasService {

	@Autowired
	private VentasRepository vr;
	
	@Override
	public List<Ventas> listarventas() {
		// TODO Auto-generated method stub
		return vr.findAll();
	}

	@Override
	public Ventas crearVentas(Ventas ventas) {
		// TODO Auto-generated method stub
		return vr.save(ventas);
	}

	@Override
	public Ventas actualizarVentas(Ventas ventas) {
		// TODO Auto-generated method stub
		return vr.saveAndFlush(ventas);
	}

	@Override
	public Ventas buscarPorId(Long idventas) {
		// TODO Auto-generated method stub
		return vr.getOne(idventas);  
	}

	@Override
	public void eliminarporId(Long idventas) {
		// TODO Auto-generated method stub
		vr.deleteById(idventas);
	} 

	 
	

	

}
