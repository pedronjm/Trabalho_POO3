package sisacad.controle;

import java.util.Random;

// FACHADA (CONTROLÃO: CONTROLE DOS CONTROLES)
public class Sistema {
	private ControleDisciplina cDisciplina;
	private ControleAluno cAluno;

	private static Sistema instance; // vai referenciar o unico objeto

	private Sistema() {
		cAluno = new ControleAluno();
	}

	// singleton
	public static Sistema getInstance() {
		if (instance == null)
			instance = new Sistema();

		return instance;
	}

	// aluno
	public boolean cadastrarAluno(Aluno a) {
		return cAluno.add(a);
	}

	public boolean alterarAluno(int i, Aluno auxA) {
		return false;
	}

	public Aluno[] listarAlunos() {
		return null;
	}

	public void init() {

	}

	public boolean verificarCdaluno(int Aaux) {
		return cAluno.verificarCodigo(Aaux);
	}

	public boolean verificarNomeAluno(String nome) {
		return cAluno.verificarNome(nome);
	}

	public int getProxCodigo() {
		return cAluno.getProxCodigo();
	}

}
