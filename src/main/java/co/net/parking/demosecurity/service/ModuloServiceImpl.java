package co.net.parking.demosecurity.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.net.parking.demosecurity.model.ModuloModel;
import co.net.parking.demosecurity.repository.ModuloRepository;

@Service
public class ModuloServiceImpl implements ModuloService {

	private ModuloRepository repository;

	public ModuloServiceImpl(ModuloRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public ModuloModel create(ModuloModel modulo) {
		// TODO Auto-generated method stub
		return this.repository.save(modulo);
	}

	@Override
	public List<ModuloModel> getAll() {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(0, 10);
		return this.repository.findAll(pageable).getContent();
	}

	@Override
	public ModuloModel getById(Integer idModulo) {
		// TODO Auto-generated method stub
		return this.repository.findById(idModulo).orElseThrow(() -> new IllegalArgumentException("Id does not exist"));
	}

}
