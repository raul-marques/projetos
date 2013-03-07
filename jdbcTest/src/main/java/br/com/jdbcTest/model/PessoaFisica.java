package br.com.jdbcTest.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@javax.persistence.Entity
@Table(name = "PessoaFisica")
public class PessoaFisica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_pessoafisica;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name = "id_pessoa")
	@ForeignKey(name = "FK_CLIENTE_ID_PESSOA")
	private Pessoa pessoa;
	
	@Column
	private String nome;

	@Column
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId_pessoafisica() {
		return id_pessoafisica;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setId_pessoafisica(Long id_pessoafisica) {
		this.id_pessoafisica = id_pessoafisica;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PessoaFisica))
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

}
