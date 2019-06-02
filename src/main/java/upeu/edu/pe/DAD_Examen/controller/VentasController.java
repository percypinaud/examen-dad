package upeu.edu.pe.DAD_Examen.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.DAD_Examen.dto.Detalle_Venta;
import upeu.edu.pe.DAD_Examen.dto.ObjetoDetalle;
import upeu.edu.pe.DAD_Examen.dto.Persona;
import upeu.edu.pe.DAD_Examen.dto.Producto;
import upeu.edu.pe.DAD_Examen.dto.Ventas;
import upeu.edu.pe.DAD_Examen.service.Detalle_VentaService;
import upeu.edu.pe.DAD_Examen.service.VentasService;

@RequestMapping("/ventas")
@CrossOrigin(origins = "http://localhost:3000")   
@RestController
public class VentasController {
	@Autowired
	private VentasService vs;

	@Autowired
	private Detalle_VentaService dvs;
	
	@GetMapping("/listar")
	public List<Ventas> all(){
		return vs.listarventas();
	} 
	
	
	//crear venta
	@PostMapping("/crear")
	public Ventas create(@RequestBody Ventas ventas) {
		Ventas vvv= vs.crearVentas(ventas);
		System.out.println(vvv);
		return vvv;  
	}
	
	 
	//creardetalle_conobjeto
	@PostMapping("creardetalletotal/{idcliente}/{idpersona}")
	public Ventas createconObjeto(@PathVariable(name="idcliente") Long idcliente,@PathVariable(name="idpersona") Long idpersona,@RequestBody List<ObjetoDetalle> objetito) {
		
		
		Date fecha=new Date();
		
		Ventas ventita=new Ventas();
		ventita.setIdcliente(new Persona(idcliente));
		ventita.setIdpersona(new Persona(idpersona));
		ventita.setFecha(fecha);
		
		Ventas veee=vs.crearVentas(ventita); 
		
		
		 for (ObjetoDetalle i : objetito) {
		    Detalle_Venta detalleventas= new Detalle_Venta();
		    detalleventas.setCantidad(i.getCantidad());
		    detalleventas.setIdproducto(new Producto(i.getIdproducto()));
		    detalleventas.setIdventas(new Ventas(veee.getIdventas()));
		    detalleventas.setPrecio(i.getPreciototal());
		    dvs.crearVenta(detalleventas); 		    
		} 

		 
		 
		return veee;
	}
	
	
	//creardetalle
	@PostMapping("/creardetalle")
	public Detalle_Venta create(@RequestBody Detalle_Venta detalle_ventas) {
		return dvs.crearVenta(detalle_ventas);
	}
	
	@PutMapping("/actualizar")
	public Ventas update(@RequestBody Ventas ventas) {
		return vs.actualizarVentas(ventas);  
	}      
	
	  
	@GetMapping("/buscarporId/{idventas}")
	public Ventas getOne(@PathVariable(name="idventas") Long idventas) {
		return vs.buscarPorId(idventas);  
	} 
	
	@DeleteMapping("/eliminarporId/{idventas}")
	public void deleteOne(@PathVariable(name="idventas") Long idventas) {
		vs.eliminarporId(idventas);                  
	}
	
	@PostMapping("/vender")
	public void vender(@RequestBody Ventas ventas) {
		Ventas v=new Ventas();
		Detalle_Venta dv=new Detalle_Venta();
		vs.Vender(v, dv);
	}
}
