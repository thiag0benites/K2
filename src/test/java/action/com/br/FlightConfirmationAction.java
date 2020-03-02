package action.com.br;

import config.com.br.hooks;
import generics.com.br.GenericMethods;
import pages.com.br.FlightConfirmationPage;

public class FlightConfirmationAction extends FlightConfirmationPage{
	
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());
	
	public void flightConfirmationVisible() {
		
		if(!generic.elementoVisivel(lblConfirmationNumber)) {
			generic.escreveRelatorio(false, "A tela FLIGHT CONFIRMATION não foi carregada!", true);
		}
		
	}
	
	public void validaNumeroConfirmacao() {
		
		String num = generic.obterTexto(lblConfirmationNumber).substring(23);
		
		if(!num.equals("")){
			generic.escreveRelatorio(true, "O número de confirmação foi gerado: " + num, true);
		} else {
			generic.escreveRelatorio(false, "O número de confirmação foi gerado: " + num, true);
		}
		
	}

}
