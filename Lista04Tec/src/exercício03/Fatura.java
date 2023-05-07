package exercício03;

public class Fatura {
	public int numItem;
	public String descriçao;
	public int quantidadeComprada;
	public double preçoUnitario;
	public double preçoTotal;
	
	public Fatura(int num,String descrip,int quant,double preço) {
		if(num<0) {
			numItem = 0;
		}else {
			numItem = num;
		}
		if(quant<0) {
			quantidadeComprada = 0;
		}else {
			quantidadeComprada =  quant;
		}
		if(preço<0){
			preçoUnitario = 0;
		}else {
			preçoUnitario = preço;
		}
		descriçao = descrip;
		
		
		
	}
	public double getValorFatura(){
		setPreçoTotal(quantidadeComprada * preçoUnitario);
		return getPreçoTotal();
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPreçoUnitario() {
		return preçoUnitario;
	}

	public void setPreçoUnitario(double preçoUnitario) {
		this.preçoUnitario = preçoUnitario;
	}

	public double getPreçoTotal() {
		return preçoTotal;
	}

	public void setPreçoTotal(double preçoTotal) {
		this.preçoTotal = preçoTotal;
	}
	public void desconto(double desconto) {
		preçoUnitario = preçoUnitario -(preçoUnitario *(desconto/100));
	}
}



	
