package br.com.jdbcTest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="endereco")
public class Endereco {
	
	
	@Id
	@GeneratedValue
	private Long id_endereco;
	@Column
	private String logradouro;
	@Column
	private Long numero;
	@Column
	private String complemento;
	@Column
	private String bairro;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="id_cidade")
	@ForeignKey(name="FK_CIDADE_ID_CIDADE")
	private Cidade cidade;
	
	public Long getId_endereco() {
		return id_endereco;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public Long getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	
}
