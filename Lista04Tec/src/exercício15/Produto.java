package exercício15;

public class Produto {
	public String nome;
	public double preçoCusto;
	public double preçoVenda;
	private double margemLucro;
	public double despesas;
	
	public void calcML() {
		this.margemLucro = ((this.preçoVenda-(this.preçoCusto+this.despesas))/this.preçoVenda)*100;
		System.out.println(this.margemLucro+"%");
	}
}
