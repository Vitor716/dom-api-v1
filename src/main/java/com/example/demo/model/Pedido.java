package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "pedido")
public class Pedido {
	private Integer id;
	private Usuario usuario;;
	private List<ItemPedido> item;
	private LocalDate date;
}
