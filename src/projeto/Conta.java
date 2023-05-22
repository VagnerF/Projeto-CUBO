package projeto;

import java.util.Random;
import java.util.Scanner;

public class Conta {
	Random random = new Random();
	Scanner input = new Scanner(System.in);
	
	private int numConta;
	private int numContaCP;
	private int numContaPJ;
	private final int numAgencia = 1010; // deixa o atributo numAgencia fixado
	private String titular;
	private String titularPJ;
	private double saldo;
	private double saldoCP;
	private double saldoPJ;
	private boolean status = false;
	private String cpf;
	private String cnpj;
	
	public int getNumContaCP() {
		return numContaCP;
	}

	public void setNumContaCP() {
	       this.numContaCP = random.nextInt(1000); //gera um número aleatório para o atributo numConta.
	}
	
	public int getNumContaPJ() {
		return numContaPJ;
	}

	public void setNumContaPJ() {
	       this.numContaPJ = random.nextInt(1000); 
	}
	
	public double getSaldoCP() {
		return saldoCP;
	}

	public void setSaldoCP(double saldoCP) {
		this.saldoCP = saldoCP;
	}
	
	public double getSaldoPJ() {
		return saldoPJ;
	}

	public void setSaldoPJ(double saldoPJ) {
		this.saldoPJ = saldoPJ;
	}


	
	
	public void abrirConta() {
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta() {	
        this.numConta = random.nextInt(1000); 
		
	}
	
	public int getNumAgencia() {  // o setNumAgencia foi apagado e não é necessário porque o valor fixo foi setado direto no atributo.
		return numAgencia;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitularPJ() {
		return titularPJ;
	}

	public void setTitularPJ(String titularPJ) {
		this.titularPJ = titularPJ;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		
		while(cpf.length() != 11) {  // lenght limita o atributo cpf em 11 caracteres
			System.out.println("CPF inválido, digite 11 dígitos");
			cpf = input.nextLine();	
		}
		this.cpf = cpf;	
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		
		while(cnpj.length() != 14) { // lenght limita o atributo cnpj em 14 caracteres
			System.out.println("CNPJ inválido, digite 14 dígitos");
			cnpj = input.nextLine();	
		}
		this.cnpj = cnpj;	
	}
	
	// métodos abaixo
	
	public void transferir(double valor) {
		
	}
	
	public void extrato() {
		
	}
	
	public void sacar(double valor) {
		
	}
	
	public void depositar(double valor) {

		
	}
	
	public void emprestimo(double valor) {
		
	}
	
	public void rendimento(double juros) {
		
	}
	
	public void rendimentoCP(double valor) {
		
	}
	
	public void acessarCC() {
		
	}
	
	public void acessarCP() {
		
	}
	
	public void acessarPJ() {
		
	}

}
