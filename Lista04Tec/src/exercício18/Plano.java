package exercício18;
import java.util.ArrayList;
import java.util.Random;

public class Plano {
	public int tamanho;
	public ArrayList<Celula> listaCelulas;
	public int Imeio;
	public int Jmeio;
	public int iMoeda;
	public int jMoeda;
	
	public Plano(int tamanho) {
		Random moedas = new Random();
		iMoeda = moedas.nextInt(tamanho);
		jMoeda = moedas.nextInt(tamanho);
		this.listaCelulas = new ArrayList<Celula>(); 
		int contID = 1;
		this.tamanho = tamanho;
		for(int i = 0;i<this.tamanho;i++) {
			for(int j = 0;j<this.tamanho;j++) {
				this.listaCelulas.add(new Celula(i,j,contID));
				for (Celula celula : listaCelulas) {
					if(iMoeda == celula.i && jMoeda == celula.j) {
						celula.temMoedas = true;
					}else if(celula.i == tamanho/2 && celula.j == tamanho/2) {
						Imeio = celula.i;
						Jmeio = celula.j;
						celula.temRobo = true;
					}
				}
						contID++;
			}
		}
	}
	public boolean podeMovimentar(int Iinicial,int Jinicial ,int i,int j) {
		if((Iinicial + i >= this.tamanho) || (Jinicial + j >= this.tamanho)||(Iinicial+i < 0) || (Jinicial + j < 0)) {
			System.out.println("Limite do plano atingido");
			return false;
		}
		else{
			for(Celula celula : listaCelulas) {
				if(Iinicial + i == iMoeda && Jinicial == jMoeda)
					celula.temMoedas = false;
				if(celula.i == Iinicial && celula.j == Jinicial) {
					celula.temRobo = false;
					celula.tinhaRobo = true;
					}
			}
			return true;
			}
}
	public int moverCima(int i) {
		return i-1;
	}
	public int moverBaixo(int i) {
		return i+1;
	}
	public int moverDireita(int j) {
		return  j+1;
	}
	public int moverEsquerda(int j) {
		return j-1;
	}
	public void imprimirPlano() {
		int contCelula = 0;
		for (Celula celula : listaCelulas) {
			celula.printCelula(contCelula);
			if(contCelula == tamanho-1) {
				System.out.println();
				contCelula = 0;
			}else
				contCelula++;
		}
		System.out.println();
	}
	public void atualizarCelula(int i,int j) {
		for (Celula celula : listaCelulas) {
			if(celula.i == i && celula.j == j)
				celula.temRobo = true;
		}
	}
}
