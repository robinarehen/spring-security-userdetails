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
@Table(name = "PAGINAS_ROLES")
public class PaginaRolModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaginaRol;

	@JoinColumn(name = "id_pagina_modulo")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private PaginaModuloModel paginaModuloModel;

	@JoinColumn(name = "id_rol")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private RolModel rolModel;

	public PaginaRolModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIdPaginaRol() {
		return idPaginaRol;
	}

	public void setIdPaginaRol(Integer idPaginaRol) {
		this.idPaginaRol = idPaginaRol;
	}

	public PaginaModuloModel getPaginaModuloModel() {
		return paginaModuloModel;
	}

	public void setPaginaModuloModel(PaginaModuloModel paginaModuloModel) {
		this.paginaModuloModel = paginaModuloModel;
	}

	public RolModel getRolModel() {
		return rolModel;
	}

	public void setRolModel(RolModel rolModel) {
		this.rolModel = rolModel;
	}

}
