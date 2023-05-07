package exercício07;

public class Main {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor(10);
		v1.setName("vigelis");
		v1.setSalario(10000);
		v1.calcularComissao(10);
		System.out.println(v1.toString());
	}

}
