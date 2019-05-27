package upeu.edu.pe.DAD_Examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idrol")
	private Long idrol;
	
	@Column(name="nom_rol")
	private String nom_rol;

	public Rol() {
		super();
	}

	public Rol(Long idrol, String nom_rol) {
		super();
		this.idrol = idrol;
		this.nom_rol = nom_rol;
	}

	public Long getIdrol() {
		return idrol;
	}

	public void setIdrol(Long idrol) {
		this.idrol = idrol;
	}

	public String getNom_rol() {
		return nom_rol;
	}

	public void setNom_rol(String nom_rol) {
		this.nom_rol = nom_rol;
	}
	
	
}
