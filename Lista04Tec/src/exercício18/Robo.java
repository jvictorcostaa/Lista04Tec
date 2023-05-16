package exercício18;

public class Robo {
	public int id;
	public int posI;
	public int posJ;
	public Plano plano;
	public int ControleDeMovimentos;
	public boolean Controle;
	
	public Robo(int id,Plano plano) {
		this.plano = plano;
		this.id = id;
		posI = plano.Imeio;
		posJ = plano.Jmeio;
		Controle = true;
	}
	public void moverNorte() {
		if(!(ControleDeMovimentos == 1 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,-1,0)) {
				this.posI = plano.moverCima(this.posI);
				this.ControleDeMovimentos = 1;
				plano.atualizarCelula(this.posI, posJ);
				plano.imprimirPlano();
				}
		}
	}
	public void moverSul() {
		if(!(ControleDeMovimentos == 2 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,1,0)) {
				this.posI = plano.moverBaixo(this.posI);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 2;
				plano.imprimirPlano();
			}
		}
	}
	public void moverLeste() {
		if(!(ControleDeMovimentos == 3 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,0,1)) {
				this.posJ = plano.moverDireita(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 3;
				plano.imprimirPlano();
				}
		}
	}
	public void moverOeste() {
		if(!(ControleDeMovimentos == 4 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,0,-1)) {
				this.posJ = plano.moverEsquerda(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 4;
				plano.imprimirPlano();
			}
		}
		
	
	}
	public void moverNordeste() {
		if(!(ControleDeMovimentos == 5 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,-1,1)) {
				this.posI = plano.moverCima(this.posI);
				this.posJ = plano.moverDireita(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 5;
				plano.imprimirPlano();
			}
		}
		
		
	}
	public void moverSudeste() {
		if(!(ControleDeMovimentos == 6 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,1,1)) {
				this.posI = plano.moverBaixo(this.posI);
				this.posJ = plano.moverDireita(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 6;
				plano.imprimirPlano();
			}
		}
		
		
	}
	public void moverSudoeste() {
		if(!(ControleDeMovimentos == 7 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,1,-1)) {
				this.posI = plano.moverBaixo(this.posI);
				this.posJ = plano.moverEsquerda(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 7;
				plano.imprimirPlano();
			}
		}
		
	}
	public void moverNoroeste() {
		if(!(ControleDeMovimentos == 8 && Controle)) {
			if(this.plano.podeMovimentar(this.posI,this.posJ,-1,-1)) {
				this.posI = plano.moverCima(this.posI);
				this.posJ = plano.moverEsquerda(this.posJ);
				plano.atualizarCelula(this.posI, posJ);
				this.ControleDeMovimentos = 8;
				plano.imprimirPlano();
		}
		
	}
}
	public void caminhoA() {
		this.Controle = false;
		int cont = ((plano.tamanho)/2);
		for(;cont<plano.tamanho;cont++) {
			for(;plano.podeMovimentar(this.posI,this.posJ,0,1);moverLeste()){
				plano.atualizarCelula(this.posI,this.posJ);	
			}
			cont++;
			if(cont<plano.tamanho) {
				plano.podeMovimentar(this.posI,this.posJ,1,0);
				moverSul();
				for(;plano.podeMovimentar(this.posI,this.posJ,0,-1);moverOeste()) {
					plano.atualizarCelula(this.posI,this.posJ);
				}
			}
			plano.podeMovimentar(this.posI,this.posJ,1,0);
			moverSul();
		}
		
	}
	public void caminhoB() {
		this.Controle = false;
		for (;plano.podeMovimentar(this.posI, this.posJ,1,1);moverSudeste()) {
			plano.atualizarCelula(this.posI, posJ);
		}
		for(;plano.podeMovimentar(this.posI, this.posJ, -1, 0);moverNorte()) {
			plano.atualizarCelula(this.posI, posJ);
		}
		for(;plano.podeMovimentar(this.posI,this.posJ,1,-1);moverSudoeste()) {
			plano.atualizarCelula(this.posI, posJ);
		}
		for(;plano.podeMovimentar(posI, posJ,-1,0);moverNorte()) {
			plano.atualizarCelula(this.posI, posJ);
		}
		for(int i = 0;i<plano.Imeio;moverSudeste(),i++) {
			plano.podeMovimentar(this.posI,this.posJ,1,1);
			plano.atualizarCelula(this.posI,this.posJ);
		}
				
	}
}

