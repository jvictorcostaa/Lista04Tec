package exercício18;

public class Celula {
	public int i;
	public int j;
	public int id;
	public boolean temRobo;
	public boolean temMoedas;
	public boolean tinhaRobo;
	
	public Celula(int i,int j,int id) {
		this.i = i;
		this.j = j;
		this.id = id;
		temRobo = false;
		temMoedas = false;
		tinhaRobo = false;
	}
		public void printCelula(int cont) {
			if(temRobo == true) {
				System.out.print("# ");
		}else if(temMoedas == true) {
			System.out.print("$ ");
		}else if(tinhaRobo == true) {
			System.out.print("@ ");
		}else {
			System.out.print("* ");
		}
	}
}