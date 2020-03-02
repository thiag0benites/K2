package action.com.br;

import config.com.br.hooks;
import generics.com.br.GenericMethods;
import pages.com.br.SelectFlightPage;

public class SelectFlightAction extends SelectFlightPage{
	
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());
	
	public void selectFlightVisivel() {
		
		if(!generic.elementoVisivel(tblDepart)) {
			generic.escreveRelatorio(false, "A tela SELECT FLIGHT não foi carregada!", true);
		}
		
	}
	
	public void preencheDadosVoo(String voo, String dados) {
		
		int linha;
		
		switch (voo) {
			case "Ida":
				linha = generic.obterIndiceLinha(tblDepart, "FLIGHT", dados);
				clickRadioTabela("Ida", linha);
				break;
			
			case "Volta":
				linha = generic.obterIndiceLinha(tblReturn, "FLIGHT", dados);
				clickRadioTabela("Volta", linha);
				generic.click(btnContinue);
				break;
		}

	}
	

	
}
