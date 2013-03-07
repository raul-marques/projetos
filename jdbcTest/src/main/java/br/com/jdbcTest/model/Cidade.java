package br.com.jdbcTest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="Cidade")
public class Cidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_cidade;
	
	@Column
	private String descricao;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="id_estado")
	@ForeignKey(name="FK_ESTADO_ID_ESTADO")
	private Estado estado;

	public Long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
}
