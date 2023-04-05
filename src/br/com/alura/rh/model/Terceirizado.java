package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado extends Funcionario {
	
	private String empresa;
	

	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		super(nome, cpf, cargo, salario);
		this.setEmpresa(empresa);
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void promover(Cargo novoCargo) {
		super.promover(novoCargo);
	}
	
	@Override
	public void atualizarSalario(BigDecimal novoSalario) {
		super.atualizarSalario(novoSalario);
	}
	
}
