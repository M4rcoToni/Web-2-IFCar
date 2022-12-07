package com.example.web2.services;

import java.util.List;

import com.example.web2.model.Veiculos;

public interface VeiculosServices {
	List<Veiculos> findAll();

	Veiculos findById(int id);

	Veiculos save(Veiculos veiculos);

	List<Veiculos> findVeiculosByModeloLike(String modelo);

	List<Veiculos> findVeiculosByAnoLike(int ano);

	List<Veiculos> findVeiculosBycategoriaLike(int categoria);

}
