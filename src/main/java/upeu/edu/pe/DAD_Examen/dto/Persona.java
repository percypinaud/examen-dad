package upeu.edu.pe.DAD_Examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idpersona")
	private Long idpersona;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="dni")
	private int dni;
	
	@Column(name="telefono")
	private int telefono;

	
	
	 
	
	public Persona() {
		super();
	}

	   
	
	
	



	public Persona(int dni) {
		super();
		this.dni = dni;
	}








	public Persona(Long idpersona) {
		super();
		this.idpersona = idpersona;
	}


 

	public Persona(Long idpersona, String nombres, String apellidos, int dni, int telefono) {
		super();
		this.idpersona = idpersona;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
	}

	public Long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Long idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
