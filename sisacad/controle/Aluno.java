package sisacad.controle;

public class Aluno {

	private int numDiscMat;
	private NotaDisciplina[] discMatriculadas;
	private String nmaluno;
	private int codigo;
	private String endereco;
	private String NmMae;
	private int vauxD[];
	private double media;

	public Aluno(int codigo, String nmaluno, String endereco, String NmMae) {
		this.nmaluno = nmaluno;
		this.codigo = codigo;
		this.endereco = endereco;
		this.NmMae = NmMae;
		discMatriculadas = new NotaDisciplina[12];

	}

	public Aluno() {
		discMatriculadas = new NotaDisciplina[12];
	}

	public String getNmaluno() {
		return nmaluno;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getNmMae() {
		return NmMae;
	}

	public double getMedia() {
		return media;
	}

	public void setNmaluno(String nmaluno) {
		this.nmaluno = nmaluno;
	}

	public void setCdaluno(int cdaluno) {
		this.codigo = cdaluno;
	}

	public boolean setEndereco(String endereco) {
		if (endereco != null) {
			this.endereco = endereco;
			return true;
		} else {
			return false;
		}
	}

	public void setNmMae(String NmMae) {
		this.NmMae = NmMae;
	}

	public NotaDisciplina[] getDiscMatriculadas() {
		return discMatriculadas;
	}

	public int getNumDiscMat() {
		return numDiscMat;
	}

	public void setNumDiscMat(int numDiscMat) {
		this.numDiscMat = numDiscMat;
	}

}
