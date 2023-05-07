package exercício06;
import java.util.ArrayList;

public class Evento {
	ArrayList<Ingresso> lista;
	public int contIngresso,contIngressoVIP;
	
	public void listaIngresso(Ingresso ticket) {
		lista.add(ticket);
	}
	public void venderIngresso(Ingresso ticket,float dinheiro) {
		if(ticket instanceof Ingresso ) {
			if(ticket.valor<dinheiro) {
				System.out.println("compra de ingresso efetuada");
				lista.remove(ticket);
				contIngresso++;
			}else {
				System.out.println("compra invalida");
			}
		}
		if(ticket instanceof IngressoVIP) {
			if(ticket.valor<dinheiro) {
				System.out.println("compra de ingresso efetuada");
				lista.remove(ticket);
				contIngressoVIP++;
			}else {
				System.out.println("compra invalida");
			}
		}
	}
	public void valorVendas() {
		
	}
}
