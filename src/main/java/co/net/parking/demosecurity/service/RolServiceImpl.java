package co.net.parking.demosecurity.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.net.parking.demosecurity.model.RolModel;
import co.net.parking.demosecurity.repository.RolRepository;

@Service
public class RolServiceImpl implements RolService {

	private RolRepository repository;

	public RolServiceImpl(RolRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public RolModel create(RolModel rolModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RolModel> getAll() {
		// TODO Auto-generated method stub
		Pageable pageable = PageRequest.of(0, 10);
		return this.repository.findAll(pageable).getContent();
	}

}
