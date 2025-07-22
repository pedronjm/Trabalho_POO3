package sisacad.dados;

import sisacad.controle.Aluno;

// responsavel pelo armazenamento (vetor, arraylist, arquivo, BD,...)
public class RepositorioAluno {
	private Aluno alunos[] = new Aluno[3];
	private int qttAluno;
	private int proxCodigo;

	public boolean add(Aluno a) {
		contarAluno();
		if (a != null) {
			if (alunos.length == qttAluno) {
				aumentarVetorAluno();
				a.setCdaluno(proxCodigo++);
				alunos[qttAluno] = a;
				return true;
			}
			alunos[qttAluno] = a;
			return true;
		} else {
			return false;
		}
	}

	private void contarAluno() {
		qttAluno = 0;
		for (int i = 0; i < alunos.length; i++) {

			if (alunos[i] != null) {
				qttAluno++;

			}

		}
	}

	private boolean aumentarVetorAluno() {

		int j = alunos.length * 2;
		Aluno[] vaux = new Aluno[j];
		for (int i = 0; i < alunos.length; i++) {
			vaux[i] = alunos[i];
		}

		alunos = vaux;
		return true;
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
		boolean k = false;
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null && alunos[i].getCodigo() == aaux) {
				k = true;
			}
		}

		return k;
	}

	public boolean verificarNome(String nome) {
		boolean k = false;
		String nm = "";
		contarAluno();

		for (int i = 0; i < qttAluno; i++) {
			nm = alunos[i].getNmaluno();
			if (nm.equals(nome)) {
				k = true;
			}
		}

		if (k == true) {
			return false;
		} else {
			return true;
		}
	}

	public boolean buscarPorNome(Aluno a) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getProxCodigo() {
		return proxCodigo;
	}
}
