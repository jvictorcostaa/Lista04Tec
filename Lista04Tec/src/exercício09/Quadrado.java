package exercício09;

public class Quadrado extends Forma {
	public double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	public double calcularArea() {
		return (this.lado*this.lado);
	}
	public String imprimirNome() {
		return "quadrado";
	}
	
}
