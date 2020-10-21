package co.net.parking.demosecurity.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.net.parking.demosecurity.model.PaginaModuloModel;
import co.net.parking.demosecurity.repository.PaginaModuloRepository;

@Service
public class PaginaModuloServiceImpl implements PaginaModuloService {

	private PaginaModuloRepository repository;

	public PaginaModuloServiceImpl(PaginaModuloRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public PaginaModuloModel create(PaginaModuloModel paginaModulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaginaModuloModel> getAll() {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(0, 10);
		return this.repository.findAll(pageable).getContent();
	}

}
