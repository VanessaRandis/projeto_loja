package lojaProdutos.dadosFuncionarios;

public class Manager extends Funcionarios {
	
	private int senha;
	
	
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


	public double getBonification() {
		
		return super.getBonification() + super.getSalary();
	}
	
	public double getTotalSalary() {
		
		return this.getBonification()+super.getSalary();
	}
	
	
	
	
	
}
