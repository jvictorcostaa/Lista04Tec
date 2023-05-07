package exercício07;

public class Empregado {
	public String name;
	protected double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salary;
	}
	public void setSalario(double salario) {
		this.salary = salario;
	}
	public String toString() {
		return "Empregado [name=" + name + ", salario=" + salary + "]";
	}
	
}
