package co.net.parking.demosecurity.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class RolModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;

	@Column(length = 20, nullable = false)
	private String nombre;

	private String descripcion;

	@OneToMany(mappedBy = "rolModel")
	private List<RolUsuarioModel> rolUsuarioModels;

	@OneToMany(mappedBy = "rolModel", fetch = FetchType.EAGER)
	private List<PaginaRolModel> paginaRolModels;

	public RolModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<RolUsuarioModel> getRolUsuarioModels() {
		return rolUsuarioModels;
	}

	public void setRolUsuarioModels(List<RolUsuarioModel> rolUsuarioModels) {
		this.rolUsuarioModels = rolUsuarioModels;
	}

	public List<PaginaRolModel> getPaginaRolModels() {
		return paginaRolModels;
	}

	public void setPaginaRolModels(List<PaginaRolModel> paginaRolModels) {
		this.paginaRolModels = paginaRolModels;
	}

}
