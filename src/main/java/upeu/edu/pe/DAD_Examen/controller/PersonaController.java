package upeu.edu.pe.DAD_Examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.DAD_Examen.dto.Persona;
import upeu.edu.pe.DAD_Examen.service.PersonaService;

@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:3000") 
@RestController
public class PersonaController {
	@Autowired
	private PersonaService pers;
	
	@Autowired
	
	@GetMapping("/listar")
	public List<Persona> all(){
		return pers.listarpersona();
	}
	 
	@GetMapping("/buscarpersonaporDNI/{dni}")
	public List<Persona> listarPersonaporID(@PathVariable("dni") int dni){
		List<Persona> listitaencontroller=pers.buscarPersonaporDni(dni);
		return listitaencontroller;
	}
	
	
}
