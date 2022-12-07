package com.example.web2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web2.model.Categorias;

@Repository
public interface RepositoryIfcar extends JpaRepository<Categorias, Integer> {
  // List<Categorias> findCategoriasByTituloLike(String titulo);

  // List<Categorias> findCategoriasByTipo(int tipo);
}
