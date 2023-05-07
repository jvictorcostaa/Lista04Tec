package exercício04;
public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setNome("WheyProtein");
		produto1.setPreço(100);
		produto1.setQuantidade(10);
		
		produto1.comprarProduto(503,2);
		System.out.println(produto1.getQuantidade());
		
	}

}
