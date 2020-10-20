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
@Table(name = "USUARIOS")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;

	@Column(length = 20)
	private String usuario;

	private String contrasenia;

	private boolean enabled;

	@OneToMany(mappedBy = "usuarioModel", fetch = FetchType.EAGER)
	private List<RolUsuarioModel> rolUsuarioModels;

	public UsuarioModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<RolUsuarioModel> getRolUsuarioModels() {
		return rolUsuarioModels;
	}

	public void setRolUsuarioModels(List<RolUsuarioModel> rolUsuarioModels) {
		this.rolUsuarioModels = rolUsuarioModels;
	}

}
