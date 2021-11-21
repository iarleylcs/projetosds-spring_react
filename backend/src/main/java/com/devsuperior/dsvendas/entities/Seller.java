package com.devsuperior.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity //Mapeando os objetos para o BD
@Table(name = "tb_sellers") //nome da table no bd
public class Seller {

	@Id //Indica para o BD qual atributo abaixo é PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica pro BD que o ID será autoincrementado
	private long id;
	private String name;
	
	@OneToMany(mappedBy = "seller") //Um para muitos, ou seja um vendedor pode ter varias vendas
	private List<Sale> sales = new ArrayList<>(); //Criando um array para representar que um vendedor tem varias vendas
	
	

	private Seller() {
	}

	public Seller(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Sale> getSales() {
		return sales;
	}
	
}
