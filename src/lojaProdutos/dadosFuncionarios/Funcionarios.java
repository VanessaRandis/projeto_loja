package lojaProdutos.dadosFuncionarios;

import lojaProdutos.dados.Personal;

public class Funcionarios extends Personal {
	
	private String id;
	private double salary;

	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double getBonification() {
		return (this.getSalary() * 0.10);
	}
	
	public double getTotalSalario() {
		return (this.getBonification() + this.getSalary());
	}
	
	
	
	
	
	
	
	
	
	

}
