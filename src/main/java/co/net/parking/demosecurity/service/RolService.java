package co.net.parking.demosecurity.service;

import java.util.List;

import co.net.parking.demosecurity.model.RolModel;

public interface RolService {

	public RolModel create(RolModel rolModel);
	
	public List<RolModel> getAll();
}
