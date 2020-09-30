package ServicosBarbeiro;



import java.text.DecimalFormat;
import java.util.ArrayList;





public class Principal {

	static ArrayList<Servicos> servico = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Barba bar = new Barba("Andre ", "91864524 ");
		bar.setFuncionarioBarbeiro(FuncionarioBarbeiro.AndrewKozak);
		bar.setTipoServico(TipoServico.Bigode);
		bar.setTurno(Estado.Disponivel);
		servico.add(bar);
		
		Corte cort = new Corte("piu ", "91864524 ");
		cort.setFuncionarioBarbeiro(FuncionarioBarbeiro.HamletGarcia);
		cort.setTipoServico(TipoServico.Contornos_e_Acabamentos);
		cort.setTurno(Estado.Indiponivel);
		servico.add(cort);
		
		
		for (Servicos serv : servico) {
			if(serv instanceof Horario) {
				System.out.printf("Cliente: "+ serv.getNome()+ "\nNumero: " + serv.getNumero()
					+ "\nBarbeiro: " + serv.getFuncionarioBarbeiro() + "\nServiço: " 
					+ serv.getTipoServico() + " - " + serv.getTipoServico().getValor() + "€ " + ((Horario) serv).getTurno() );
			} else {
				System.out.println("Cliente: "+ serv.getNome()+ "\nNumero: " + serv.getNumero()
				+ "\nBarbeiro: " + serv.getFuncionarioBarbeiro() + "\nServiço:  " 
				+ serv.getTipoServico() + " - " + serv.getTipoServico().getValor() + "€ " + ((Horario) serv).getTurno());
			}
		}	
	
	}
}
