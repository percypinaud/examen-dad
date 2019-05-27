package upeu.edu.pe.DAD_Examen.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.DAD_Examen.dto.Detalle_Venta;
import upeu.edu.pe.DAD_Examen.repository.Detalle_VentaRepository;
import upeu.edu.pe.DAD_Examen.service.Detalle_VentaService;

@Service
public class Detalle_VentaServiceImp implements Detalle_VentaService {
	
	@Autowired
	private Detalle_VentaRepository dvr;
	
	@Override
	public Detalle_Venta crearVenta(Detalle_Venta detalle_venta) {
		// TODO Auto-generated method stub
		return dvr.save(detalle_venta); 
	}

}
