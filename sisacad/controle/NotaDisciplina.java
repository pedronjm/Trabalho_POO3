package sisacad.controle;

public class NotaDisciplina {
	double nota;
	Disciplina disc;

	public double getnota() {
		return nota;
	}

	public Disciplina getdisc() {
		return disc;
	}

	public void setdisc(Disciplina disc) {
		if (disc != null) {
			this.disc = disc;
		}
	}

	public NotaDisciplina() {

	}

}
