package exercício03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o numero do item,a descrição,a quantidade comprada e seu preço unitario");
		Fatura fat1 = new Fatura(scan.nextInt(),scan.next(),scan.nextInt(),scan.nextDouble());
		System.out.println(fat1.getValorFatura());
		fat1.desconto(10);
		System.out.println(fat1.getValorFatura());
		
		
		
		
		
		
		
		scan.close();
	}

}
