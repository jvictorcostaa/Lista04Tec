package exercício14;

public class Pessoa {
	public int idade;
	public int dia,mes,ano;
	public String nome;
	
	public void calculaIdade(int diaAtual,int mesAtual,int AnoAtual){
		this.idade = (AnoAtual - this.ano)-1;
		if(mesAtual>=this.mes) {
			if(diaAtual>=dia) {
				this.idade++;
			}
		}
	}
	public int informaIdade() {
		return this.idade;
	}
	public String informaNome() {
		return this.nome;
	}
	public void ajustaDataDeNascimento(int dia,int mes,int ano) {
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}
}
