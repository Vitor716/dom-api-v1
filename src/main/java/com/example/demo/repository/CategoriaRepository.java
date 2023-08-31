package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dtos.CategoriaEntradaDto;
import com.example.demo.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	boolean existsByNome(String nome);
	
	boolean existsByNomeAndIdNot(String nome, Integer id);
}
