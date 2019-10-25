package com.szytka.parking.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_end;
	private String rua;
	private Integer numero;

	public Endereco() {

	}
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Endereco(Integer id, String rua, Integer numero, String cidade, String estado) {
		super();
		this.id_end = id;
		this.rua = rua;
		this.numero = numero;

	}

	public Integer getId() {
		return id_end;
	}

	public void setId(Integer id) {
		this.id_end = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_end == null) ? 0 : id_end.hashCode());
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
		Endereco other = (Endereco) obj;
		if (id_end == null) {
			if (other.id_end!= null)
				return false;
		} else if (!id_end.equals(other.id_end))
			return false;
		return true;
	}

}