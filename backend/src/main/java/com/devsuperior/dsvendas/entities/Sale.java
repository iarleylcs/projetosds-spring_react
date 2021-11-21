package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity //Mapeando os objetos para o BD
@Table(name = "tb_sales") //nome da table no bd
public class Sale {
	
	@Id //Indica para o BD qual atributo abaixo é PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Indica pro BD que o ID será autoincrementado
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	@ManyToOne //Representa o "Muitos para um" ou seja, chave estrangeira, nesse caso a venda tem q ter a chave do vendedor
	@JoinColumn(name = "seller_id") //Mapeando nome da chave estrangeira
	private Seller seller; //definindo o tipo como Seller(outra classe), pq uma venda tem apenas um vendor
	

	private Sale () {
		
	}


	public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
	}


	public Integer getDeals() {
		return deals;
	}


	public void setDeals(Integer deals) {
		this.deals = deals;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	
}
