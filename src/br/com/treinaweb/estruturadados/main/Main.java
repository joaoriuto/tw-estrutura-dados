package br.com.treinaweb.estruturadados.main;

import java.util.Scanner;

import br.com.treinaweb.estruturadados.conjuntos.Conjunto;
import br.com.treinaweb.estruturadados.filas.Fila;
import br.com.treinaweb.estruturadados.listaligada.ListaDuplamenteLigada;
import br.com.treinaweb.estruturadados.listaligada.ListaLigada;
import br.com.treinaweb.estruturadados.modelos.Pessoa;
import br.com.treinaweb.estruturadados.pilhas.Pilha;
import br.com.treinaweb.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Escolha a opção: ");
		System.out.println("1. Gerenciamento de memoria");
		System.out.println("2. Fazer vetores");
		System.out.println("3. Lista ligada");
		System.out.println("4. Lista duplamente ligada");
		System.out.println("5. Pilha");
		System.out.println("6. Fila");
		System.out.println("7. Conjunto");

		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		case 4:
			fazerListaDuplamenteLigada();
			break;
		case 5:
			fazerPilha();
			break;
		case 6:
			fazerFila();
			break;
		case 7:
			fazerConjunto();
			break;
		}
		scanner.close();
	}

	private static void fazerConjunto() {
		Conjunto<Pessoa> conjuntoPessoas = new Conjunto<Pessoa>();
		System.out.println(conjuntoPessoas.estaVazio());
		System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "TreinaWeb")));
		System.out.println(conjuntoPessoas.toString());
		System.out.println(conjuntoPessoas.inserir(new Pessoa(1, "TreinaWeb")));
		System.out.println(conjuntoPessoas.toString());
	}

	private static void fazerFila() {
		Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
		System.out.println(filaPessoas.estaVazia());
		filaPessoas.enfileirar(new Pessoa(1, "TreinaWeb 1"));
		filaPessoas.enfileirar(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(filaPessoas.toString());
		Pessoa p = filaPessoas.desenfileirar();
		System.out.println(p.toString());
		System.out.println(filaPessoas.toString());
		
	}

	private static void fazerPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		pilhaPessoas.empilhar(new Pessoa(1, "TreinaWeb 1"));
		pilhaPessoas.empilhar(new Pessoa(2, "TreinaWeb 2"));
		pilhaPessoas.empilhar(new Pessoa(3, "TreinaWeb 3"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
		
	}

	private static void fazerListaDuplamenteLigada() {
		ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		listaPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		listaPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		System.out.println(listaPessoas.toString());
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		listaPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		listaPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		System.out.println(listaPessoas.toString());
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println("Valor atual A: " + a);
		int b = a;
		System.out.println("Valor atual B: " + b);
		b = 2;
		System.out.println("----------- Teste 1 -----------");
		System.out.println("Valor atual A: " + a);
		System.out.println("Valor atual B: " + b);
		System.out.println("São iguais? " + (a == b));

		System.out.println("----------- Teste 2 -----------");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		System.out.println(p1.toString());

		Pessoa p2 = p1;
		System.out.println(p2.toString());

		System.out.println("----------- Teste 3 -----------");
		p2.setNome("TreinaWeb Modificado");
		System.out.println("Pessoa 1 " + p1.toString());
		System.out.println("Pessoa 2 " + p2.toString());
		System.out.println("São iguais? " + (p1 == p2));
	}

	private static void fazerVetor() {
		// Importante lembrar que o índice começa no 0

		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();

		vetorPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		vetorPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		vetorPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		vetorPessoas.inserir(new Pessoa(4, "TreinaWeb 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "TreinaWeb 5"));
		System.out.println(vetorPessoas);
		System.out.println(" ** LISTA de PESSOAS: ");
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}

		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "Treina 100");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaErrada));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaErrada));

		// Remoção de elementos

		vetorPessoas.remover(2);
		System.out.println(vetorPessoas.toString());

		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());

//		vetorPessoas.inserirEm(1, new Pessoa(1, "JoaoRiuto"));
//
//		System.out.println(vetorPessoas.recuperar(1).getNome());
//		
//		//Outro vetor com outro tipo de dado
//		
//		Vetor<Integer> valorInteiro = new Vetor<Integer>(4);
//		valorInteiro.inserirEm(1, 1);
//		System.out.println(valorInteiro.recuperar(1));

	}

}
