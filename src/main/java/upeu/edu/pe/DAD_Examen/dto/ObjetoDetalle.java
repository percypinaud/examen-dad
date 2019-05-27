package upeu.edu.pe.DAD_Examen.dto;

public class ObjetoDetalle {
	private Long idproducto;
	private int cantidad;
	private double preciototal;
	
	public ObjetoDetalle() {
		super();
	}
		 
	

	public ObjetoDetalle(Long idproducto, int cantidad, double preciototal) {
		super();
		this.idproducto = idproducto;
		this.cantidad = cantidad;
		this.preciototal = preciototal;
	}

 

	public Long getIdproducto() {
		return idproducto;
	}



	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}



	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPreciototal() {
		return preciototal;
	}

	public void setPreciototal(double preciototal) {
		this.preciototal = preciototal;
	}
	
	
}
