package upeu.edu.pe.DAD_Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.DAD_Examen.dto.Producto;
import upeu.edu.pe.DAD_Examen.service.ProductoService;
@RequestMapping("/producto")
@CrossOrigin(origins = "https://dadfront.herokuapp.com") 
@RestController
public class ProductoController {
	@Autowired
	private ProductoService ps;
	
	@GetMapping("/listar")
	public List<Producto> all(){
		return ps.listarProducto(); 
	}
}
