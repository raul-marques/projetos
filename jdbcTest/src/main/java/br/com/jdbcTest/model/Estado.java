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
@Table(name="Estado")
public class Estado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_estado;
	@Column
	private String descricao;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name = "id_pais")
	@ForeignKey(name = "FK_PAIS_ID_PAIS")
	private Pais pais;
	
	
	public Long getId_estado() {
		return id_estado;
	}
	public void setId_estado(Long id_estado) {
		this.id_estado = id_estado;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
