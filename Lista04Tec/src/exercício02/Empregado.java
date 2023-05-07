package exercício02;

public class Empregado {
	public String umPrimeiroNome;
	public String umSobrenome;
	public float umSalarioMensal;
	
	public Empregado(String firstName,String lastName,float salary) {
		setUmPrimeiroNome(firstName);
		setUmSobrenome(lastName);
		setUmSalarioMensal(salary);//
	}

	public String getUmPrimeiroNome() {
		return umPrimeiroNome;
	}

	public void setUmPrimeiroNome(String umPrimeiroNome) {
		this.umPrimeiroNome = umPrimeiroNome;
	}

	public String getUmSobrenome() {
		return umSobrenome;
	}

	public void setUmSobrenome(String umSobrenome) {
		this.umSobrenome = umSobrenome;
	}

	public double getUmSalarioMensal() {
		return umSalarioMensal;
	}

	public void setUmSalarioMensal(float umSalarioMensal) {
		if(umSalarioMensal < 0) {
			this.umSalarioMensal = 00;
		}else {
			this.umSalarioMensal += umSalarioMensal;
		}
		
	}
	public void aumentoSalario(float aumento){
		this.umSalarioMensal = this.umSalarioMensal * ((aumento/100)+1);
	}
}	
