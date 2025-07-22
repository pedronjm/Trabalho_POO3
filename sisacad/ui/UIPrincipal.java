package sisacad.ui;

import java.util.Scanner;

public class UIPrincipal {
	private Scanner scn;
	private UIAluno uiAluno;

	public UIPrincipal() {
		scn = new Scanner(System.in);
		uiAluno = new UIAluno();
	}

	public void iniciar() {
		int opcao;
		int tmndespa = 10;
		do {
			opcao = menuPrincipal();
			while (opcao <= 0 || opcao > 11) {
				opcao = menuPrincipal();
			}

			switch (opcao) {
			case 1:
				// cadastrarDisciplina();
				break;
			case 2:
				// removerDisciplina();
				break;
			case 3:
				// listarDisciplinas(tmndespa);
				break;
			case 4:
				uiAluno.cadastrarAluno();
				break;
			case 5:
				uiAluno.alterarAluno();
				break;
			case 6:
				uiAluno.listarAlunos(tmndespa);
				break;
			case 7:
				// listarAlunosNotas(tmndespa);
				break;
			case 8:
				// matricularAluno();
				break;
			case 9:
				// listarMatriculas(tmndespa);
				break;
			case 10:
				// tmndespa = tamnahodespa(tmndespa);
				break;

			default:
				System.out.println("Você saiu do programa");
				break;
			}
		} while (opcao != 0);
		System.out.println("Você saiu do programa");
	}

	public int menuPrincipal() {
		System.out.println("O que voce gostaria de fazer?");
		System.out.println("digite 1 para: Cadastrar disciplina");
		System.out.println("digite 2 para: Remover disciplina");
		System.out.println("digite 3 para: Listar disciplinas");
		System.out.println("digite 4 para: Cadastrar alunos");
		System.out.println("digite 5 para: Alterar dados de um aluno");
		System.out.println(
				"digite 6 para: Listar os alunos por ordem de cadastro");
		System.out.println("digite 7 para: Listar os alunos por notas");
		System.out.println("digite 8 para: Matricular aluno em disciplinas");
		System.out.println("digite 9 para: Listar matriculas");
		System.out.println(
				"digite 10 para: Alterar valor de espaçamento das tabelas");
		System.out.println("digite 11 para: Sair do codigo");

		return scn.nextInt();
	}
}
