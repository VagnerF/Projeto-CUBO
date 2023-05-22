package projeto;


import java.util.Scanner;

public class CuboBank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean sair = false; // necessário para funcionar com o while, inicializa com false.
		
		ContaCorrente cc = new ContaCorrente(); // instancia da classe ContaCorrente
		ContaPoupanca cp = new ContaPoupanca(); // instancia da classe ContaPoupanca
		ContaPJ pj = new ContaPJ(); // instancia da classe ContaPJ
		
		while(!sair) { // while deixa em loop esse acesso ao menu através do switch com as opções para acessar os métodos
		System.out.println("====================================");
		System.out.println("              CUBO BANK             ");
		System.out.println("====================================");
		System.out.println("Selecione uma opção:");
		System.out.println("[1] Criar conta corrente");
		System.out.println("[2] Criar conta poupança");
		System.out.println("[3] Criar conta PJ");
		System.out.println("[4] Acessar Conta Corrente");
		System.out.println("[5] Acessar Conta Poupança");
		System.out.println("[6] Acessar Conta PJ");
		System.out.println("[7] Sair");
		System.out.println("====================================");
		

		int opcao = input.nextInt(); // variável necessária para funcionar com o switch

		
		switch (opcao) { //switch para acessar os métodos através das opções
		
		case 1:
			cc.setNumConta();
			cc.abrirConta();

			break;
			
		case 2:
			cp.setNumConta();
			cp.abrirConta();			
			
			break;
			
		case 3:
			pj.setNumConta();
			pj.abrirConta();

		case 4:
			cc.acessarCC();
			break;
			
		case 5:
			cp.acessarCP();
			break;
			
		case 6:
			pj.acessarPJ();
			break;
			
		case 7:
			System.out.println("Saindo...");
			sair = true;
			break;

		default:
			System.out.println("Opção inválida");
			break;
			
		
			}

		}		
		input.close();
	}

}
