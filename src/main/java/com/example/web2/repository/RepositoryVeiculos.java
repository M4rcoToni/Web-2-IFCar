package com.example.web2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web2.model.Veiculos;

@Repository
public interface RepositoryVeiculos extends JpaRepository<Veiculos, Integer> {
  List<Veiculos> findVeiculosByModeloLike(String modelo);

  List<Veiculos> findVeiculosByAnoLike(int ano);

  List<Veiculos> findVeiculosBycategoriaLike(int categoria);
  // List<Categorias> findCategoriasByTipo(int tipo);
}
