package exercício13;

public class ControleRemoto{
	private boolean ligar;
	private int canal;
	private int volume;
	private boolean mute;
	
	public ControleRemoto() {
	ligar = false;
	canal = 1;
	volume = 0;
	mute = false;
	}
	public void ligarDesligarTv() {
		if(this.ligar == false)
			this.ligar = true;
		else
			this.ligar = false;
	}
	
	public void aumentarCanal() {
		if(this.ligar == true) {
			this.canal++;
		}else {
			System.out.println("a tv esta desligada");
		}
	}
	public void diminuirCanal() {
		if(this.ligar == true) {
			if(this.canal>0)
			this.canal--;
			else {
				System.out.println("canal inexistente");
			}
		}else {
			System.out.println("a tv esta desligada");
		}
	}
	
	public void aumentarVolume() {
		if(this.ligar == true) {
			if(this.volume<100) {
				this.volume++;
			}else {
				System.out.println("volume maximo");
			}
		}else {
			System.out.println("a tv esta desligada");
		}
	}
	public void diminuirVolume() {
		if(this.ligar == true) {
			if(this.volume<100) {
				this.volume++;
			}else {
				System.out.println("volume maximo");
			}
		}else {
			System.out.println("a tv esta desligada");
		}
	}
	
	public void status() {
		System.out.println("canal: "+this.canal+"\nvolume: "+this.volume);
	}
	public void mudarCanal(int numCanal) {
		if(this.ligar = true) {
			if(numCanal>=1) {
				this.canal = numCanal;
			}else {
				System.out.println("canal inexistente");
			}
		}else {
			System.out.println(
					);
		}
	}
	public void ligarDesligarMute() {
		if(this.ligar == true) {
			if(mute == false) {
				mute = true;
				this.volume = 0;
				System.out.println("voce mutou a tv");
			}else {
				mute = false;
				System.out.println("voce desmutou a tv");
			}
		}else {
			System.out.println("a tv esta desligada");
		}
		}
}
