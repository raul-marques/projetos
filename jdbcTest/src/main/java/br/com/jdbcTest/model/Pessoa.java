package br.com.jdbcTest.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

	@Column(name = "idPessoa")
	@Id
	@GeneratedValue
	private int idPessoa;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	@JoinColumn(name="id_endereco")
	@ForeignKey(name="FK_ENDERECO_ID_ENDERECO")
	private List<Endereco> endereco;


	@Column
	private int idUsuarioLcto;

	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;

	@Column
	private Date dtLcto;

	public Pessoa() {
		System.out.println("Pessoa Entity");
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public int getIdUsuarioLcto() {
		return idUsuarioLcto;
	}

	public void setIdUsuarioLcto(int idUsuarioLcto) {
		this.idUsuarioLcto = idUsuarioLcto;
	}

	public Date getDtLcto() {
		return dtLcto;
	}

	public void setDtLcto(Date dtLcto) {
		this.dtLcto = dtLcto;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPessoa;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Pessoa))
			return false;
		Pessoa other = (Pessoa) obj;
		if (idPessoa != other.idPessoa)
			return false;
		return true;
	}



}
