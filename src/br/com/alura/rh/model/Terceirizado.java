package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado{
	
	DadosPessoais dadosPessoais;
	private String empresa;
	

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		
		this.setEmpresa(empresa);
		this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
}
