package com.szytka.parking.domain;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	private String nome;

	public Cliente() {

	}

	public Cliente(Integer id, String nome) {
		super();
		this.id_cliente = id;
		this.nome = nome;
	}

	@OneToMany(mappedBy = "cliente")
	private List<Endereco> pedidos = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="id_cidade")
	private Cidade cidade;
	
	@ManyToOne
	@JoinColumn(name="id_end")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="id_carro")
	private Carro carro;
	
	@ManyToOne
	@JoinColumn(name="id_tel")
	private Telefone telefone;


	public Integer getId() {
		return id_cliente;
	}

	public void setId(Integer id) {
		this.id_cliente = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_cliente == null) ? 0 : id_cliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (id_cliente == null) {
			if (other.id_cliente != null)
				return false;
		} else if (!id_cliente.equals(other.id_cliente))
			return false;
		return true;
	}
}
