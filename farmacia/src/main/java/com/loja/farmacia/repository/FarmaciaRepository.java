package com.loja.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.farmacia.model.Categoria;

public interface FarmaciaRepository extends JpaRepository<Categoria, Long>{

	public List <Categoria> findAllByNomeContainingIgnoreCase(String nome);

}
