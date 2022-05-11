public class Candidato extends Partido {
	private int votos;

	public Candidato(int numero, String nome, String partido) {
		this.setNumero(numero);
		this.setNome(nome);
		this.setPartido(partido);
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	public void Votar() {
		votos++;
	}

}
