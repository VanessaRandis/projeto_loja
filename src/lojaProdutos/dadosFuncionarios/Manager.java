package lojaProdutos.dadosFuncionarios;

import lojaProdutos.dados.Address;

public class Manager extends Funcionarios {
	
	private int senha;
	
	public Manager() {
		super();
	}
	
	public Manager(String cpf, String name, Address address, String id, double salary, int senha) {
		super(cpf, name, address, id, salary);
		this.senha = senha;
	}


	public boolean autentica(int senha) {
		if(this.senha== senha) {
		return true;
	}else {
		return false;
	      }
	}

	public void setSenha(int senha) {
			this.senha=senha;
		
	}

	@Override
	public double getBonification() {
		
		return super.getBonification() + super.getSalary();
	}
	
	
	@Override
	public double getTotalSalary() {
		
		return this.getBonification()+super.getSalary();
	}
	
	
	
	
	
}
