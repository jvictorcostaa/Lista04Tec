package exercício09;
public class Circulo extends Forma {
	public double raio;
	public Circulo(double raio) {
		this.raio = raio;
	}
	public double calcularArea() {
		return (3.14 * this.raio * this.raio);
	}
	public String imprimirNome() {
		return "circulo";
	}

}
