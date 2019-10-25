package com.szytka.parking.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
	
	@Entity
	public class Cidade implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id_cidade;
		private String nome;
		private String estado;
		
		
		public Cidade() {
			
		}
		@ManyToOne
		@JoinColumn(name="id_end")
		private Cliente cliente;
		
		
		public Cidade(Integer id, String nome, String estado) {
			super();
			this.id_cidade = id;
			this.nome = nome;
			this.estado = estado;
		}


		public Integer getId() {
			return id_cidade;
		}
		public void setId(Integer id) {
			this.id_cidade = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id_cidade == null) ? 0 : id_cidade.hashCode());
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
			Cidade other = (Cidade) obj;
			if (id_cidade == null) {
				if (other.id_cidade != null)
					return false;
			} else if (!id_cidade.equals(other.id_cidade))
				return false;
			return true;
		}	

}

