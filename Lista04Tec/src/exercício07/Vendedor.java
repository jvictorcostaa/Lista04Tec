package exercício07;

public class Vendedor extends Empregado {
	public double commission;
	public double salaryplus;
	public Vendedor(double commission) {
		super();
		this.commission = commission;
	}
	public double calcularComissao(double comissao) {
		this.salaryplus = this.salary+(this.salary * (comissao/100));
		return salaryplus;
	}
	public String toString() {
		return "Vendedor [commission=" + commission + ", salaryplus=" + salaryplus + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
}
