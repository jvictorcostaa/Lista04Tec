package exercício09;

public class Retangulo extends Forma{
	public double base;
	public double altura;
	
	public Retangulo(double altura,double base) {
		this.altura = altura;
		this.base = base;
	}
	public double calcularArea() {
		return base*altura;
	}
	
	public String imprimirNome() {
		return "retangulo";
		}
	
}
