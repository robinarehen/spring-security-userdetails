package co.net.parking.demosecurity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.net.parking.demosecurity.model.UsuarioModel;
import co.net.parking.demosecurity.repository.UsuarioModelRepository;

@Service
@Transactional(readOnly = true)
public class UsuarioModelService {

	private UsuarioModelRepository modelRepository;

	public UsuarioModelService(UsuarioModelRepository modelRepository) {
		super();
		this.modelRepository = modelRepository;
	}

	public UsuarioModel getFindByUserName(String userName) {

		return this.modelRepository.findByUsuario(userName);
	}
}
