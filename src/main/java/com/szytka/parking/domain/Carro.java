package com.szytka.parking.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_carro;
	private String nomeCar;
	private String modelo;
	private String placa;
	private String vaga;

	public Carro() {

	}
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Carro(Integer id, String nomeCar, String modelo, String placa, String vaga) {
		super();
		this.id_carro = id;
		this.nomeCar = nomeCar;
		this.modelo = modelo;
		this.placa = placa;
		this.vaga = vaga;
	}

	public Integer getId() {
		return id_carro;
	}

	public void setId(Integer id) {
		this.id_carro = id;
	}

	public String getNomeCar() {
		return nomeCar;
	}

	public void setNomeCar(String nomeCar) {
		this.nomeCar = nomeCar;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getVaga() {
		return vaga;
	}

	public void setVaga(String vaga) {
		this.vaga = vaga;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_carro== null) ? 0 : id_carro.hashCode());
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
		Carro other = (Carro) obj;
		if (id_carro == null) {
			if (other.id_carro != null)
				return false;
		} else if (!id_carro.equals(other.id_carro))
			return false;
		return true;
	}	

}
