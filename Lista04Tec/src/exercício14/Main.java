package exercício14;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Albert Einstein";
		p1.ajustaDataDeNascimento(14,3,1879);
		p1.calculaIdade(7,5,2023);
		System.out.println(p1.informaIdade());
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Isaac Newton";
		p2.ajustaDataDeNascimento(4,1,1643);
		p2.calculaIdade(7,5,2023);
		System.out.println(p2.informaIdade());
	}

}
