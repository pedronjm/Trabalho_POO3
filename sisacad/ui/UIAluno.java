package sisacad.ui;

import java.util.Random;
import java.util.Scanner;

import sisacad.controle.Aluno;
import sisacad.controle.Sistema;

public class UIAluno {
	private Random rnd;
	private Sistema sis;
	private Scanner scn;

	public UIAluno() {
		rnd = new Random();
		sis = Sistema.getInstance();
		scn = new Scanner(System.in);
	}

	// responsavel por cadastrar/inserir aluno
	public void cadastrarAluno() {
		int cd = sis.getProxCodigo();
		// int cd = Sistema.getInstance().getProxCodigo();
		System.out.println("Codigo: " + cd);
		System.out.println("Qual é o nome do aluno que deseja cadastrar? ");
		String nome = scn.next();
		if (sis.verificarNomeAluno(nome) == false)
			System.out.println("Nome ja existente");
		else {
			System.out.println(
					"Qual é o endereço do aluno que deseja cadastrar? ");
			String endereco = scn.next();
			System.out.println(
					"Qual é o nome da mãe aluno que deseja cadastrar? ");
			String nomeM = scn.next();

			Aluno auxA = new Aluno(cd, nome, endereco, nomeM);
			if (sis.cadastrarAluno(auxA)) {
				System.out.println("Cadastro de aluno realizado com sucesso");
			} else {
				System.out.println("Falha no cadastro do aluno");
			}

		}

	}

	public void alterarAluno() {
		// TODO Auto-generated method stub

	}

	public void listarAlunos(int tmndespa) {
		// TODO Auto-generated method stub

	}

}
