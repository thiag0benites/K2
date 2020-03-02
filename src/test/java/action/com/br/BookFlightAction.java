package action.com.br;

import config.com.br.hooks;
import generics.com.br.GenericMethods;
import pages.com.br.BookFlightPage;

public class BookFlightAction extends BookFlightPage{
	
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());
	
	public void bookFlightVisible() {
		
		if(!generic.elementoVisivel(lblOneWayFlight)) {
			generic.escreveRelatorio(false, "A tela BOOK A FLIGHT não foi carregada!", true);
		}
		
	}
	
	public void validaVoos(String ida, String volta) {
		
		if (!generic.obterTexto(lblOneWayFlight).equals(ida)) {
			generic.escreveRelatorio(false, "Voo de ida diferente do esperado.\nObtido: " + generic.obterTexto(lblOneWayFlight) + "\nEsperado: " + ida, true);
		}
		
		if (!generic.obterTexto(lblReturnFlight).equals(volta)) {
			generic.escreveRelatorio(false, "Voo de volta diferente do esperado.\nObtido: " + generic.obterTexto(lblReturnFlight) + "\nEsperado: " + volta, true);
		}
		
	}
	
	public void preencheCamposObrigatorios(String nome, String sobreNome, String cartao) {
		
		generic.preencheCampo(txtFirstName, nome);
		generic.preencheCampo(txtLastName, sobreNome);
		generic.preencheCampo(txtNumber, cartao);
		
		generic.click(btnSecure);
		
	}

}
