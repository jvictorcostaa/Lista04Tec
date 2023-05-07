package exercício09;

public class Triangulo extends Forma{
	public double altura;
	public double base;
	
	public Triangulo(double altura,double base) {
		this.altura = altura;
		this.base = base;
	}
	public double calcularArea() {
		return (this.base*this.altura)/2;
	}

	public String imprimirNome() {
		return "triangulo";
	}
	
}
