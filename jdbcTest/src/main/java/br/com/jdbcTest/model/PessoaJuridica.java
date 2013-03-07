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
@Table(name = "PessoaJuridica")
public class PessoaJuridica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_pessoajuridica;
	
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name = "id_pessoa")
	@ForeignKey(name = "FK_CLIENTE_ID_PESSOA")
	private Pessoa pessoa;
	
	@Column
	private String RazaoSocial;
	@Column
	private String NomeFantasia;
	@Column
	private String cnpj;
	@Column
	private String incricaoEstadual;

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIncricaoEstadual() {
		return incricaoEstadual;
	}

	public void setIncricaoEstadual(String incricaoEstadual) {
		this.incricaoEstadual = incricaoEstadual;
	}

	public Long getId_pessoajuridica() {
		return id_pessoajuridica;
	}

	public void setId_pessoajuridica(Long id_pessoajuridica) {
		this.id_pessoajuridica = id_pessoajuridica;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof PessoaJuridica))
			return false;
		PessoaJuridica other = (PessoaJuridica) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

}
