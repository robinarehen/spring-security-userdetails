package co.net.parking.demosecurity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES_USUARIOS")
public class RolUsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRolUsuario;

	@JoinColumn(name = "id_usuario")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UsuarioModel usuarioModel;

	@JoinColumn(name = "id_rol")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private RolModel rolModel;

	private String descripcion;

	public RolUsuarioModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdRolUsuario() {
		return idRolUsuario;
	}

	public void setIdRolUsuario(Integer idRolUsuario) {
		this.idRolUsuario = idRolUsuario;
	}

	public UsuarioModel getUsuarioModel() {
		return usuarioModel;
	}

	public void setUsuarioModel(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}

	public RolModel getRolModel() {
		return rolModel;
	}

	public void setRolModel(RolModel rolModel) {
		this.rolModel = rolModel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
