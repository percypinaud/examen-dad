package upeu.edu.pe.DAD_Examen.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idproducto")
	private Long idproducto;
	
	@Column(name="nom_prod")
	private String nom_prod;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="codigo")
	private int codigo;

	public Producto() {
		super();
	}
	
	
	
	
	public Producto(Long idproducto) {
		super();
		this.idproducto = idproducto;
	}




	public Producto(Long idproducto, String nom_prod, double precio, int stock, int codigo) {
		super();
		this.idproducto = idproducto;
		this.nom_prod = nom_prod;
		this.precio = precio;
		this.stock = stock;
		this.codigo = codigo;
	}

	public Long getIdproducto() {
		return idproducto;
	} 

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNom_prod() {
		return nom_prod;
	}

	public void setNom_prod(String nom_prod) {
		this.nom_prod = nom_prod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	} 
	
	
	
	
	
}
