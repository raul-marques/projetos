package br.com.jdbcTest.model;

public enum TipoPessoa {
	FISICA(1),JURIDICA(2);
	
	private int tipo;
	 
	 private TipoPessoa(int tipo) {
	   this.tipo = tipo;
	 }
	 
	 public int getCode() {
	   return tipo;
	 }
}
