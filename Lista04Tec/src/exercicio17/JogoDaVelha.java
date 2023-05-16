package exercicio17;
import java.util.Scanner;
public class JogoDaVelha {
	public Celula[][] grade;
	public boolean Vezp1;
	public int contEmpate;
	
	public JogoDaVelha() {
		grade = new Celula[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				 grade[i][j] = new Celula(i, j);
			}
		}
		this.Vezp1 = true;
}
	public void jogar() {
		Scanner scan = new Scanner(System.in);
		while(GanharLinha(!Vezp1) == false && GanharColuna(!Vezp1) == false && GanharDiagonalDireita(!Vezp1) == false && GanharDiagonalEsquerda(!Vezp1) == false){
			System.out.println("Escolha onde colocar o caractere no array:");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					 System.out.print(grade[i][j].tipo+" ");;
				}
				System.out.println();
			}
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(podeJogar(x,y)) {
				if(this.Vezp1) {
					this.grade[x][y].tipo = 1;
					this.Vezp1 = !(this.Vezp1);
				}else {
					this.grade[x][y].tipo = 2;
					this.Vezp1 = !(this.Vezp1);
				}
			}
		}
	}
	public boolean podeJogar(int x,int y) {
		if((x>2 || y>2)) {
			System.out.println("Essa posição n existe");
			return false;
		}
		if(this.grade[x][y].tipo != 0) {
			System.out.println("Essa posição ja foi ocupada");
			return false;
	}
		contEmpate++;
		if(contEmpate >= 9) {
			System.out.println("Empate");
		}
		return true;
}
	
	public boolean GanharLinha(boolean vezp1) {
		int cont1 = 0;
		for(int w = 0;w<3;w++) {
			for(int x = 0;x<3;x++) {
				if(vezp1 == true) {
					if(this.grade[w][x].tipo == 1)
					cont1++;
				}else if(vezp1 == false && this.grade[w][x].tipo == 2)
					cont1++;
		}
		
	}
		if(cont1 > 2) {
			System.out.println("O jogador: "+!this.Vezp1+" ganhou");
			return true;
		}else
			return false;
	}
	public boolean GanharColuna(boolean vezp1) {
		int cont1 = 0;
		for(int w = 0;w<3;w++) {
			for(int y = 0;y<3;y++) {
				if(vezp1 == true) {
					if(this.grade[y][w].tipo == 1)
						cont1++;
				}else if(vezp1 == false && this.grade[y][w].tipo == 2){
					cont1++;
				}
		}
		
	}
		if(cont1 > 2) {
			System.out.println("O jogador: "+!this.Vezp1+" ganhou");
			return true;
		}else
			return false;
	}
	public boolean GanharDiagonalDireita(boolean vezp1) {
		int cont1 = 0;
			for(int y = 0;y<3;y++) {
				if(vezp1 == true) {
					if(this.grade[y][y].tipo == 1)
					cont1++;
				}else if(vezp1 == false && (this.grade[y][y].tipo == 2 && this.grade[y][y].tipo == 2)){
					cont1++;
				}
		
	}
		if(cont1 > 2) {
			System.out.println("O jogador: "+!this.Vezp1+" ganhou");
			return true;
		}else
			return false;
	}
	public boolean GanharDiagonalEsquerda(boolean vezp1) {
		int cont1 = 0;
			for(int y = 0,w = 2;y<3;y++) {
				if(vezp1 == true) {
					if(this.grade[w][y].tipo == 1)
					cont1++;
					w--;
				}else if(vezp1 == false && (this.grade[w][y].tipo == 2)){
					cont1++;
					w--;
				}
		
	}
		if(cont1 > 2) {
			System.out.println("O jogador: "+!(this.Vezp1)+" ganhou");
			return true;
		}else
			return false;
	}
}