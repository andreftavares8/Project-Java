package ServicosBarbeiro;


public abstract class Servicos {

	
	String nome;
	String numero;
	FuncionarioBarbeiro barbeiro;
	TipoServico tiposervico;
//	private String tipoServico;
//	private double preco;
	
	
	
	public Servicos(String nome, String numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public abstract void setFuncionarioBarbeiro(FuncionarioBarbeiro b);
	public abstract FuncionarioBarbeiro getFuncionarioBarbeiro();
	
	public abstract void setTipoServico(TipoServico s);
	public abstract TipoServico getTipoServico();

}
