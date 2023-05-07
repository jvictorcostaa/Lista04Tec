package exercício05;
import java.util.ArrayList;

public class Agenda {
	public ArrayList<Contato> lista;
	public String nomeAgenda;
	public String descrição;
	
	public void listaAdd(Contato c1) {
		lista.add(c1);
	}
}
