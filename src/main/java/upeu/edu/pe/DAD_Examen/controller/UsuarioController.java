package upeu.edu.pe.DAD_Examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.DAD_Examen.dto.Usuario;
import upeu.edu.pe.DAD_Examen.service.UsuarioService;

@RequestMapping("/usuario")
@CrossOrigin(origins = "https://dadbackend.herokuapp.com")   
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService us;
	
	@GetMapping("/buscarporId/{idusuario}") 
	public Usuario getOne(@PathVariable(name="idusuario") Long idusuario) {
		return us.buscarporId(idusuario);
	} 
	
}
