package projeto;

import java.util.Scanner;

public class ContaPJ extends Conta{
	Scanner input = new Scanner(System.in);
	
	@Override
	public void abrirConta() {
		this.setSaldoPJ(0); 
		System.out.println("Seja bem vindo ao Cubo Bank!");
		System.out.println("Vamos realizar a criação de sua conta PJ, por favor, digite o nome da sua empresa: ");
		String nomeTitularPJ = input.nextLine();
		setTitularPJ(nomeTitularPJ);
		System.out.println("Informe o seu CNPJ(Apenas números):");
		String cnpj = input.nextLine();
		setCnpj(cnpj);
		setNumContaPJ();
		setStatus(true); // altera o valor do atributo status da classe mãe para true
		System.out.printf("Saldo atual: R$%.2f\n", getSaldoPJ());
		System.out.println("Nome: " + getTitularPJ());
		System.out.println("CPF: " + getCnpj());
		System.out.println("Número da Agência: " + getNumAgencia());
		System.out.println("Número da conta: " + getNumContaPJ());
		System.out.println("Conta corrente criada com sucesso!");
		System.out.println("====================================");
		
	}
	
	@Override 
	public void transferir(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("Digite o valor do pix que deseja transferir: ");
		valor = input.nextDouble();
		if (this.getSaldoPJ() > 0 && this.getSaldoPJ() > valor) { //realiza o cálculo para transferir o valor que tem em saldo
			this.setSaldo(this.getSaldo() - valor);
			this.setSaldoPJ(this.getSaldoPJ() - valor);
			System.out.println("Pix realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldoPJ());
		} else {
			System.out.println("Pix não realizado, pix insuficiente.");

		}
        } else {
            System.out.println("Não é possível realizar transferência, a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void depositar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("Digite o valor que deseja depositar: ");
		valor = input.nextDouble();
		 if (valor > 0) {
			 this.setSaldoPJ(this.getSaldoPJ() + valor);  //realiza o cálculo para depositar o valor no saldo
	            System.out.println("Depósito realizado com sucesso!");
	            System.out.printf("Saldo atual: R$%.2f\n", getSaldoPJ());
	        } else {
	            System.out.println("Depósito não realizado, valor inválido.");
	        }
        } else {
            System.out.println("Não é possível realizar depósito, a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void sacar(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("Digite o valor de saque: ");
		valor = input.nextDouble();
		if (this.getSaldoPJ() > 0 && this.getSaldoPJ() > valor) {  //realiza o cálculo para sacar o valor que tem em saldo
			this.setSaldoPJ(this.getSaldoPJ() - valor);
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Saldo atual: R$%.2f\n", getSaldoPJ());
		} else {
			System.out.println("Saque não realizado, saldo insuficiente.");

		}
        } else {
            System.out.println("Não é possível realizar saque, a conta ainda não foi criada.");
        }

	}
	
	@Override
	public void emprestimo(double valor) {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.println("Informe o valor do empréstimo que deseja obter: ");
		valor = input.nextDouble();
		double valorjuros = valor * 0.1 + valor;
		System.out.println("Em quantas parcelas deseja dividir?");
		int parcelas = input.nextInt();
		double valorparcelas = valorjuros / parcelas;
		System.out.printf("Seu empréstimo de R$%.2f dividido em %d parcelas com 10%% de juros ficou da sequinte forma: \n", valor, parcelas);
		System.out.printf("Valor total com juros: R$%.2f\n" ,valorjuros);
		System.out.printf("Valor das parcelas: R$%.2f\n" ,valorparcelas);
		
		}else {
            System.out.println("Não é possível realizar o empréstimo, a conta ainda não foi criada.");
        }

	}
	
	
	
	@Override
	public void extrato() {
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		System.out.printf("Saldo atual da conta corrente é R$%.2f\n", getSaldoPJ());
        } else {
            System.out.println("Não é possível consultar o extrato, a conta ainda não foi criada.");
        }
	}
	
	@Override
	public void acessarPJ() {
		boolean sair = false; // necessário para funcionar com o while, inicializa com false.
		if (this.getStatus() == true) { // verifica se o atributo status da classe mãe está true para prosseguir com a execução do método
		while(!sair) {  // while deixa em loop esse acesso ao menu através do switch com as opções para acessar os métodos
		System.out.println("====================================");
		System.out.println("[1] Depositar em conta PJ");
		System.out.println("[2] Sacar em conta PJ");
		System.out.println("[3] Transferir em conta PJ");
		System.out.println("[4] Solicitar empréstimo");
		System.out.println("[5] Exibir o extrato conta PJ");
		System.out.println("[6] Menu Principal");
		System.out.println("====================================");
		
		int opcao2 = input.nextInt(); // variável necessária para funcionar com o switch
		switch (opcao2) { //switch para acessar os métodos através das opções
		case 1:
			depositar(opcao2);;
			break;
			
		case 2:
			sacar(opcao2);;
			break;
			
		case 3:
			transferir(opcao2);
			break;
			
		case 4:
			emprestimo(opcao2);;
			break;
		
		case 5:
			extrato();
			break;
			
		case 6:
			if (sair) {
			CuboBank.main(null); // faz com que o menu através do switch retorne ao método main
			}
			sair = true;
			break;
			

		default:
			System.out.println("Opção inválida");
			break;
			}
		}
		}else {
            System.out.println("Não é possível acessar, a conta PJ ainda não foi criada.");
        }
	}

}


