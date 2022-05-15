package LojaMain;

import java.util.Date;
import java.util.Scanner;

import lojaProdutos.dadosFuncionarios.Funcionarios;
import lojaProdutos.dadosFuncionarios.Manager;
import lojaProdutos.dadosProdutos.Order;
import lojaProdutos.dadosProdutos.OrderStatus;

public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionarios fun = new Funcionarios();
		
		System.out.println("Insira seu cpf");
		fun.setCpf(scan.nextLine());
		System.out.println("Insira seu nome");
		fun.setName(scan.nextLine());
		
		System.out.println(fun.getCpf());
		System.out.println(fun.getName());
		
		System.out.println();
		System.out.println("inform the employee salary");
		fun.setSalary(scan.nextDouble());
		
		System.out.println("salary" + fun.getSalary());
		
		System.out.println("Bonification" + fun.getBonification());
		
		System.out.println("total" + fun.getTotalSalario());
		
		
		Manager man = new Manager();
		
		System.out.println("Inform the Mananger name");
		man.setName(scan.next());
		
		System.out.println("cpf");
		man.setCpf(scan.next());
		
		System.out.println(man.getCpf());
		System.out.println(man.getName());
		
		System.out.println("How much is the payment");
		man.setSalary(scan.nextDouble());
		
		System.out.println(man.getSalary());
		System.out.println(man.getBonification());
		System.out.println("total " + man.getTotalSalary());
		
		
		Order order = new Order(1050, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
