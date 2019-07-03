package co.net.parking.demosecurity.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PAGINAS_MOULO")
public class PaginaModuloModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaginaModulo;

	private String label;
	private String url;
	private String icono;
	private String descripcion;

	@JoinColumn(name = "id_modulo")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private ModuloModel moduloModel;

	@OneToMany(mappedBy = "paginaModuloModel")
	private List<PaginaRolModel> paginaRolModels;

	public PaginaModuloModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPaginaModulo() {
		return idPaginaModulo;
	}

	public void setIdPaginaModulo(Integer idPaginaModulo) {
		this.idPaginaModulo = idPaginaModulo;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public ModuloModel getModuloModel() {
		return moduloModel;
	}

	public void setModuloModel(ModuloModel moduloModel) {
		this.moduloModel = moduloModel;
	}

	public List<PaginaRolModel> getPaginaRolModels() {
		return paginaRolModels;
	}

	public void setPaginaRolModels(List<PaginaRolModel> paginaRolModels) {
		this.paginaRolModels = paginaRolModels;
	}

}
