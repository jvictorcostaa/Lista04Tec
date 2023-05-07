package exercício04;

public class Produto {
	public String nome;
	public double preço;
	public int quantidade;
	
	
	public void comprarProduto(double compra,int quant){
		if((preço*quant)>compra) {
			System.out.println("compra invalida");
		}else if((preço*quant)<100) {
			preço = preço*quant;
			System.out.println("compra efetuada com sucesso,valor de: "+preço);
			quantidade = quantidade - quant;
		}else if((preço*quant)>=100 && (preço*quant)<200) {
			preço = quant*(preço-(preço * 0.1));
			System.out.println("compra efetuada com sucesso,valor de: "+preço);
			quantidade = quantidade - quant;
		}else if((preço*quant)>=200 && (preço*quant) < 500) {
			preço = quant*(preço-(preço * 0.2));
			System.out.println("compra efetuada com sucesso,valor de: "+preço);
			quantidade = quantidade - quant;
		}else if((preço*quant)>=500) {
			preço = quant*(preço-(preço * 0.25));
			System.out.println("compra efetuada com sucesso,valor de: "+preço);
			quantidade = quantidade - quant;
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
