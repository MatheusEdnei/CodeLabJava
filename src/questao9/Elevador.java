package questao9;

public class Elevador {
	
	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int totalPessoas;
	
	
	public void sobe() {
		if(andarAtual != totalAndares ) {
			this.andarAtual++;
			System.out.println("Subindo um andar");
		} else {
			System.out.println("Elevador está no ultimo andar");
		}
	}
	
	public void sai() {
		if( this.totalPessoas > 0 ) {
			this.totalPessoas--;
			System.out.println("Saindo uma pessoa do elevador");
		} else {
			System.out.println("O elevador está vazio");
		}
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getTotalPessoas() {
		return totalPessoas;
	}

	public void setTotalPessoas(int totalPessoas) {
		this.totalPessoas = totalPessoas;
	}
	
	

}
