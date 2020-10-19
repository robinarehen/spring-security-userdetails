package co.net.parking.demosecurity.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MODULOS")
public class ModuloModel {

	@Id
	private Integer idModulo;

	private String nombre;
	private String label;
	private String icono;
	private String descripcion;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PaginaModuloModel> paginaModuloModels;

	public ModuloModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<PaginaModuloModel> getPaginaModuloModels() {
		return paginaModuloModels;
	}

	public void setPaginaModuloModels(List<PaginaModuloModel> paginaModuloModels) {
		this.paginaModuloModels = paginaModuloModels;
	}

}
