package upeu.edu.pe.DAD_Examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idusuario")
	private Long idusuario;
	
	@Column(name="nom_user")
	private String nom_user;
	
	@Column(name="clave")
	private String clave;
	
	@Column(name="estado")
	private int estado; 
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idrol",nullable=false)
	private Rol idrol;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpersona",nullable=false)
	private Persona idpersona;

	public Usuario() {
		super();
	}

	public Usuario(Long idusuario, String nom_user, String clave, int estado, Rol idrol, Persona idpersona) {
		super();
		this.idusuario = idusuario;
		this.nom_user = nom_user;
		this.clave = clave;
		this.estado = estado;
		this.idrol = idrol;
		this.idpersona = idpersona;
	}

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNom_user() {
		return nom_user;
	}

	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Rol getIdrol() {
		return idrol;
	}

	public void setIdrol(Rol idrol) {
		this.idrol = idrol;
	}

	public Persona getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}
	
	
}
