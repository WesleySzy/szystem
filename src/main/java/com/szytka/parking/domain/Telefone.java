package com.szytka.parking.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_tel;
	private Integer numero;

	public Telefone() {

	}
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Telefone(Integer id, Integer numero) {
		super();
		this.id_tel = id;
		this.numero = numero;
	}

	public Integer getId() {
		return id_tel;
	}

	public void setId(Integer id) {
		this.id_tel = id;
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
		result = prime * result + ((id_tel == null) ? 0 : id_tel.hashCode());
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
		Telefone other = (Telefone) obj;
		if (id_tel == null) {
			if (other.id_tel != null)
				return false;
		} else if (!id_tel.equals(other.id_tel))
			return false;
		return true;
	}

}
