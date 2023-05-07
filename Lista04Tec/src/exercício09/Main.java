package exercício09;

public class Main {

	public static void main(String[] args) {
	Circulo c1 = new Circulo(5);
	System.out.println(c1.calcularArea());
	
	Triangulo t1 = new Triangulo(5, 2);
	System.out.println(t1.calcularArea());
	
	Retangulo r1 = new Retangulo(5, 2);
	System.out.println(r1.calcularArea());
	
	Quadrado q1 = new Quadrado(5);
	System.out.println(q1.calcularArea());
	}

}
