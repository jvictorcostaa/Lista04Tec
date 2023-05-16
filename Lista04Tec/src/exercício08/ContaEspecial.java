package exercício08;

public class ContaEspecial extends ContaCorrente {
	
	public double withdrawLimit;

	public ContaEspecial(int id, String nameOfAccountOwner, double withdrawLimit, int password) {
		super(id, nameOfAccountOwner, password);
		this.withdrawLimit = withdrawLimit;
	}
	
	public void moneyWithdraw(double amount, int password) {
		if(this.checkPassword(password)) {
			if(amount<=withdrawLimit) {
				System.out.printf("Saque realizado com sucesso!");
				this.setBalance(this.getBalance(password)-amount, password);
			} else {
				System.out.printf("Dinheiro insuficiente.");
			}
		} else {
			System.out.println("Senha incorreta!");
		}
	}

	

	
	
	
	
}