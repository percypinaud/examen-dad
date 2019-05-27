package upeu.edu.pe.DAD_Examen.dto;

import java.util.Date;

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
@Table(name="ventas")
public class Ventas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idventas")
	private Long idventas;
	
	@Column(name="fecha",columnDefinition="TIMESTAMP")
	private Date fecha;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpersona",nullable=false)
	private Persona idpersona;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcliente",nullable=false)
	private Persona idcliente;

	public Ventas() {
		super();
	}

	
	
	public Ventas(Long idventas) {
		super();
		this.idventas = idventas;
	}



	public Ventas(Long idventas, Date fecha, Persona idpersona, Persona idcliente) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.idpersona = idpersona;
		this.idcliente = idcliente;
	}

	public Long getIdventas() {
		return idventas;
	}

	public void setIdventas(Long idventas) {
		this.idventas = idventas;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Persona getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Persona idpersona) {
		this.idpersona = idpersona;
	}

	public Persona getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Persona idcliente) {
		this.idcliente = idcliente;
	}
	
	
}
