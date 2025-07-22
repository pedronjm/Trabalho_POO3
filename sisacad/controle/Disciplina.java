package sisacad.controle;

public class Disciplina {
	int cddisc;
	public String nmdisc;
	int ano;
	int numVagas;
	String nmprof;
	String sigla;

	public Disciplina(int cddisc, int ano, String nmdisc, String nmprof,
			int numVagas) {
		this.cddisc = cddisc;
		this.nmdisc = nmdisc;
		this.ano = ano;
		this.nmprof = nmprof;
		this.numVagas = numVagas;
	}

}
