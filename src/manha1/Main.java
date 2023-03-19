package manha1;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	////corpo da classe
	
	///atributos
	///metodos
	/////assinatura: nome (main) + atributos (opcional) (args)
	
	///public, protected, private (visibilidade)
	
	///tipo de retorno: void (vazio) ou o tipo definido


	//Operadores:
	////Aritimetico:
	////Atribuicao:
	////Logico:
	////
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		
		
//		lerNomesComFor  (quantidade);
		lerNomesComWhile(quantidade);
		
//		String opcaoSelecionada = leitor.next();
//		
//		menu(opcaoSelecionada);
//		
		//String nome = retornaMeuNome();
		
		//System.out.println(nome);
		
		//variavel valorQueAPessoaPossui = 100
		//ler o valor da conta = teclado
		
//		double valorQueAPessoaPossui = 100.00;
		
//		//criando o Scanner
//		Scanner leitor = new Scanner(System.in);
//		
//		//System.out.printf("Informe a quantidade de pessoas..: ");
//		//int quantidadeDePessoas = leitor.nextInt();
//		
//		System.out.printf("Informe o valor da compra...: ");
//		double valor = leitor.nextDouble();
//		
//		//double valorPorPessoas= valor / quantidadeDePessoas;
//		
//		//condition - precisa ser uma espressao logica (resultado true ou false)
//		if (valor > valorQueAPessoaPossui) {
//			System.out.println("Não pode comprar");
//		} 
//		else {
//			System.out.println("Pode comprar");
//		}
//		
		
		
//		System.out.printf("O valor por pessoa e: %.2f ", valorPorPessoas);
		
		
		
		
	}
	
	public static String retornaMeuNome() {
		//String nome (definição) Tipo nomeDaVariavel
		//= ¨Isaac¨ (Inicialização)
		
		//tipos primitivos: int, double, float, boolean
		
		
		String nome = "Isaac";
		
		return nome;
	}
	
	public static void menu(String menuSelecionado) {
		

		
		switch (menuSelecionado) {
		case "CONTA":
			System.out.println("Acessando conta");
			break;
		case "SALDO":
			System.out.println("Acessando saldo");
			break;
		case "OUTRO":
			System.out.println("Acessando outro");
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
		
		
		// Fazendo o mesmo com o if else
		
//		if (opcao.equals("A")) {
//			
//		} else if (opcao.equals("B")) {
//			
//		} else {
//			
//		}
	}
	
    //estrutura de repetição: for e while	
	public static void lerNomesComFor(int quantidade) {
		Scanner leitor = new Scanner(System.in);
		
		//Inicializar variavel de controle, expressao condicional, alteracao da variavel de controle
		for(int i = 0; i < quantidade; i++) {
			String primeiroNome = leitor.next();
			System.out.println("Nome lido: " + primeiroNome);
		}
		
	}
	
	public static void lerNomesComWhile(int quantidade) {
		Scanner leitor = new Scanner(System.in);
		String nome;
		int controle = 0;
		
		//controle = 0 e quantidade = 10
		while (controle < quantidade) {
			nome = leitor.next();
			System.out.println("Nome lido: " + nome);
			controle++;
		}
	}
}
