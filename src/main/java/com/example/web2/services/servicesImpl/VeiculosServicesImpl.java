package com.example.web2.services.servicesImpl;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web2.model.Veiculos;
import com.example.web2.repository.RepositoryVeiculos;
import com.example.web2.services.IfcarServices;
import com.example.web2.services.VeiculosServices;

@Service
public class VeiculosServicesImpl implements VeiculosServices {
	@Autowired
	RepositoryVeiculos repository;

	@Override
	public List<Veiculos> findAll() {
		return repository.findAll();
	}

	@Override
	public Veiculos findById(int id) {

		return repository.findById(id).get();
	}

	@Override
	public Veiculos save(Veiculos veiculo) {
		return repository.save(veiculo);
	}

	@Override
	public List<Veiculos> findVeiculosByModeloLike(String modelo) {
		return findVeiculosByModeloLike(modelo);
	}

	@Override
	public List<Veiculos> findVeiculosByAnoLike(int ano) {
		return findVeiculosByAnoLike(ano);
	}

	@Override
	public List<Veiculos> findVeiculosBycategoriaLike(int categoria) {
		return findVeiculosBycategoriaLike(categoria);
	}
}
