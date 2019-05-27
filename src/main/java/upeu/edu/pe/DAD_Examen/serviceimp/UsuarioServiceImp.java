package upeu.edu.pe.DAD_Examen.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.DAD_Examen.dto.Usuario;
import upeu.edu.pe.DAD_Examen.repository.UsuarioRepository;
import upeu.edu.pe.DAD_Examen.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository ur;
	
	@Override
	public Usuario buscarporId(Long idusuario) {
		// TODO Auto-generated method stub
		return ur.getOne(idusuario); 
	}

}
