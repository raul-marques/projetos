package br.com.jdbcTest.dao;

import java.util.List;
import br.com.jdbcTest.model.*;

public interface PessoaFisicaDAO {
	
	void salvar();
	
	void atualiza();
	
	void deleta();
	
	List<Endereco> listarEndereco();
}
