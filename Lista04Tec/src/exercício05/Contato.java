package exercício05;

public class Contato {
	public int codigo;
	public String nome;
	private String email;
	public int telefone;
	public String observaçao;
	public boolean preenchido;
	
	public Contato(int cod,String name,String mail,int phone) {
		setCodigo(cod);
		setNome(name);
		setEmail(mail);
		setTelefone(phone);
		preenchido = true;
	}
	public void printStatus() {
		System.out.println(getCodigo()+"\n"+getEmail()+"\n"+getNome()+"\n"+getTelefone()+"\n"+getObservaçao());
	}
	public Contato duplicarContato(Contato c) {
		Contato c2 = c;
		return(c2);
	}
	public void verificarContato(Contato c) {
		if(c.preenchido = true && c.observaçao != null) {
			System.out.println("Este contato esta preenchido");
		}else {
			System.out.println("Este contato esta incompleto");
		}
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		if(codigo >= 1000 && codigo<=9999) {
			this.codigo = codigo;
		}else {
			System.out.println("Este codigo e invalido");
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		if(telefone<100000000 && telefone>=10000000) {
			this.telefone = telefone;
		}else {
			System.out.println("Este telefone e invalido");
		}
		
	}
	public String getObservaçao() {
		return observaçao;
	}
	public void setObservaçao(String observaçao) {
		this.observaçao = observaçao;
	}
	
}
