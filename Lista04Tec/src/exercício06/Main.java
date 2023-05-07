package exercício06;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		IngressoVIP vip1 = new IngressoVIP();
		vip1.valor = 10;
		vip1.valorAdicional = 5;
		
		Evento carnaval = new Evento();
		carnaval.lista = new ArrayList<>();
		carnaval.listaIngresso(vip1);
		carnaval.venderIngresso(vip1, 20);
	}

}
