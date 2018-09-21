package com.messiassouza.clienteservidor.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	private int produto_id;
	
	private String preco;

	private String nome;

	private String estoque;
	
	public Produto() {
	}
	
	public Produto(int produto_id, String preco, String nome, String estoque) {
		super();
		this.produto_id = produto_id;
		this.preco = preco;
		this.nome = nome;
		this.estoque = estoque;
	}

	public int getId() {
		return produto_id;
	}
	public void setId(int produto_id) {
		this.produto_id = produto_id;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstoque() {
		return estoque;
	}
	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + produto_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (produto_id != other.produto_id)
			return false;
		return true;
	}

	
}
