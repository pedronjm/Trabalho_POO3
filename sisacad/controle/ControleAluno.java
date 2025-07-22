package sisacad.controle;

import sisacad.dados.RepositorioAluno;

// Responsavel regras de negocio
public class ControleAluno {
	private RepositorioAluno repoAluno;

	public boolean add(Aluno a) {
		// regra de negocio: nao pode existir 2 alunos com mesmo nome
		if (repoAluno.buscarPorNome(a))
			return false;
		else
			return repoAluno.add(a);
	}

	public boolean buscarPorNome(Aluno a) {
		return false;
	}

	public boolean excluir(int numMatricula) {
		return true;
	}

	public boolean alterar(Aluno a) {
		return true;
	}

	public Aluno buscar(int numMatricula) {
		return null;
	}

	public Aluno[] listar() {
		return null;
	}

	public boolean verificarCodigo(int aaux) {
		return repoAluno.verificarCodigo(aaux);
	}

	public boolean verificarNome(String nome) {
		return repoAluno.verificarNome(nome);
	}

	public int getProxCodigo() {
		return repoAluno.getProxCodigo();
	}

}
