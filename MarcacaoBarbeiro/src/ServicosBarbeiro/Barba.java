package ServicosBarbeiro;


public  class Barba extends Servicos implements Horario{
	
	 FuncionarioBarbeiro barbeiro;
	 TipoServico tiposervico;
	 TipoServico  valor;
	 Estado turno;

	public Barba(String nome, String numero) {
		super(nome, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setFuncionarioBarbeiro(FuncionarioBarbeiro b) {
		// TODO Auto-generated method stub
		barbeiro = b;
	}

	@Override
	public FuncionarioBarbeiro getFuncionarioBarbeiro() {
		// TODO Auto-generated method stub
		return barbeiro;
	}
	@Override
	public void setTipoServico(TipoServico s) {
		// TODO Auto-generated method stub
		tiposervico = s;
	}

	@Override
	public TipoServico getTipoServico() {
		// TODO Auto-generated method stub
		return tiposervico;
	}
	public void setValor(TipoServico v) {
		// TODO Auto-generated method stub
		valor = v;
	}
	public TipoServico getValor() {
		return valor;
	}

	@Override
	public Estado getTurno() {
		return turno;
	}
	
	@Override
	public void setTurno(Estado hora) {
		turno = hora;		
	}

}
