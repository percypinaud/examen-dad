package upeu.edu.pe.DAD_Examen.service;

import java.util.List;


import upeu.edu.pe.DAD_Examen.dto.Persona;

public interface PersonaService {
	List<Persona> listarpersona();
	
	
	List<Persona> buscarPersonaporDni(int dni);
}
