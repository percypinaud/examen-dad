package upeu.edu.pe.DAD_Examen.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.DAD_Examen.dto.Persona;
import upeu.edu.pe.DAD_Examen.repository.PersonaRepository;
import upeu.edu.pe.DAD_Examen.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaRepository per;
	
	@Override
	public List<Persona> listarpersona() {
		// TODO Auto-generated method stub
		return per.findAll();
	}

	@Override
	public List<Persona> buscarPersonaporDni(int dni) {
		List<Persona> listita=per.buscarPersonaporDniJPAREPOSITORY(dni);
		return listita; 
	}

}
