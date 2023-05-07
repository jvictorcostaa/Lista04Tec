package exercício07;

public class Gerente extends Empregado{
	public String department;
	public Gerente(String name,double salary,String departament) {
		this.name = name;
		this.salary = salary;
		this.department = departament;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return "Gerente [department=" + department + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
