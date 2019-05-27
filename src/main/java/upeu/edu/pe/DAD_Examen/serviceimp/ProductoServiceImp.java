package upeu.edu.pe.DAD_Examen.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.DAD_Examen.dto.Producto;
import upeu.edu.pe.DAD_Examen.repository.ProductoRepository;
import upeu.edu.pe.DAD_Examen.service.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService {

	@Autowired
	private ProductoRepository pr;
	
	
	@Override
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
