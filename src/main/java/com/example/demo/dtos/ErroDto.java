package com.example.demo.dtos;

import java.util.List;

import com.example.demo.model.Erro;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErroDto {
	private String erro;
	private List<Erro> validacoes;
	
}
