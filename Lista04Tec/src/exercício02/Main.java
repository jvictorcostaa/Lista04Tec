package exercício02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Olá,Seja bem-vindo ao seu novo sistema digital de emprego,"
				+          "me informe seu primeiro nome,seu sobrenome e seu salario mensal: ");
		Empregado trabalhador1 = new Empregado(scan.next(),scan.next(),scan.nextFloat());
		System.out.println("Olá,Seja bem-vindo ao seu novo sistema digital de emprego,"
				+          "me informe seu primeiro nome,seu sobrenome e seu salario mensal: ");
		Empregado trabalhador2 = new Empregado(scan.next(),scan.next(),scan.nextFloat());
		
		System.out.println(trabalhador1.getUmSalarioMensal());
		System.out.println();trabalhador2.getUmSalarioMensal();
		trabalhador1.aumentoSalario(10);
		trabalhador2.aumentoSalario(10);
		System.out.println(trabalhador1.getUmSalarioMensal());
		System.out.println(trabalhador2.getUmSalarioMensal());
		scan.close();
	}

}
