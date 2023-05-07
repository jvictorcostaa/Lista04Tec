package exercício05;

import java.util.ArrayList;

public class main {

	public static void main(String[] args){
		Contato c1 = new Contato(1100,"joao","vitinhogomes@games.com",40028922);
		c1.observaçao = "ola mundo";
		c1.printStatus();
		Contato c2 =(c1.duplicarContato(c1));
		System.out.println("\n\n\n");
		c2.printStatus();
		c1.verificarContato(c1);
		
		Agenda agenda1 = new Agenda();
		agenda1.lista = new ArrayList<>();
		agenda1.listaAdd(c1);
	}

}
