package exercício16;

public class Elevador {
	private int andarAtual;
	private int andarTotal;
	private int capacidadeMax;
	private int capacidadeAtual;
	
	public Elevador(int capacidadeMax,int andarTotal) {
		setCapacidadeMax(capacidadeMax);;
		setAndarTotal(andarTotal);
		setCapacidadeAtual(0);
		setAndarAtual(0);
	}
	public void addPessoa() {
		if(this.capacidadeAtual<this.capacidadeMax)
			this.capacidadeAtual++;
		else
			System.out.println("o elevador esta na capacidade maxima");
	}
	public void removePessoa() {
		if(this.capacidadeAtual>0)
			this.capacidadeAtual--;
		else
			System.out.println("sem pessoas no elevador");
	}
	public void subir() {
		if(this.andarAtual<this.andarTotal)
			this.andarAtual++;
		else
			System.out.println("andar maximo");
	}
	public void descer() {
		if(this.andarAtual>0)
			this.andarAtual--;
		else
			System.out.println("andar minimo");
	}
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getAndarTotal() {
		return andarTotal;
	}
	public void setAndarTotal(int andarTotal) {
		this.andarTotal = andarTotal;
	}
	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}
	
}
