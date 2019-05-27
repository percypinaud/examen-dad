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
@Table(name="detalle_venta")
public class Detalle_Venta {
		
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iddetalle_venta")
	private Long iddetalle_venta;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idventas",nullable=false)
	private Ventas idventas;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idproducto",nullable=false)
	private Producto idproducto;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="cantidad")
	private int cantidad;

	public Detalle_Venta() {
		super();
	}

	public Detalle_Venta(Long iddetalle_venta, Ventas idventas, Producto idproducto, double precio, int cantidad) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.idventas = idventas;
		this.idproducto = idproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Long getIddetalle_venta() {
		return iddetalle_venta;
	}

	public void setIddetalle_venta(Long iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}

	public Ventas getIdventas() {
		return idventas;
	}

	public void setIdventas(Ventas idventas) {
		this.idventas = idventas;
	}

	public Producto getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Producto idproducto) {
		this.idproducto = idproducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
