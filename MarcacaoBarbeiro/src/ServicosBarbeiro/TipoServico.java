package ServicosBarbeiro;

import java.text.DecimalFormat;

public enum TipoServico {
	
	// servico barba
	Bigode(14.00),
	Contornos_e_Acabamentos(6.00), 
	Barba_s�_M�quina(6.00),
	Barba_M�quina_com_Contornos_Navalha(8.00),
	Barba_Completa_Navalha(8.00),
	// servico corte
	Corte_s�_M�quina_0_1_2_ou_3(8.00),
	Corte_com_Lavagem(13.00),
	Corte_sem_Lavagem(12.00),
	Corte_Degrad�(13.00),
	Corte_Crian�a_at�_8_anos(9.00),
	Lavar_Cabelo_e_Styling(9.00),
	Corte_M�quina_e_Barba(15.00),
	Corte_e_Barba(19.00);
	
	public double valor;
	TipoServico (double valor) {
		DecimalFormat df = new DecimalFormat("#.####");
		String dfn = Double.toString(valor);
		df.format(dfn);
		this.valor = dfn;
	}
	public double getValor() {
		// TODO Auto-generated method stub

		return valor;
	}
	
}
