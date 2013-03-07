package br.com.jdbcTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pais")
public class Pais {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_pais;
	
	@Column
	private String descricao;
	@Column
	private String sigla;
	@Column
	private Long ddi;
	
	
	public Long getId_pais() {
		return id_pais;
	}
	public void setId_pais(Long id_pais) {
		this.id_pais = id_pais;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Long getDdi() {
		return ddi;
	}
	public void setDdi(Long ddi) {
		this.ddi = ddi;
	}

	
}
