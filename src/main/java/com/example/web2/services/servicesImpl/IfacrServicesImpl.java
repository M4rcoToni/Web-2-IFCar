package com.example.web2.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web2.model.Categorias;
import com.example.web2.repository.RepositoryIfcar;
import com.example.web2.services.IfcarServices;

@Service
public class IfacrServicesImpl implements IfcarServices {
	@Autowired
	RepositoryIfcar repository;

	@Override
	public List<Categorias> findAll() {
		return repository.findAll();
	}

}
