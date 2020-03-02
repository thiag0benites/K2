package steps.com.br;

import action.com.br.BookFlightAction;
import action.com.br.ContextoAction;
import action.com.br.FlightConfirmationAction;
import action.com.br.SelectFlightAction;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class ContextoSteps {
	
	ContextoAction contexto = new ContextoAction();
	
	@Dado("^que acesso o sistema$")
	public void que_acesso_o_sistema() throws Throwable {
		contexto.acessarSistema();
	}

	@Entao("^realizo login$")
	public void realizo_login() throws Throwable {
		contexto.login();
	}
	
	@E("^estou na tela \"([^\"]*)\"$")
	public void estou_na_tela(String tela) throws Throwable {
		
		switch (tela) {
			case "SELECT FLIGHT":
				SelectFlightAction voo = new SelectFlightAction();
				voo.selectFlightVisivel();
				break;
				
			case "BOOK A FLIGHT":
				BookFlightAction book = new BookFlightAction();
				book.bookFlightVisible();
				break;
				
			case "FLIGHT CONFIRMATION":
				FlightConfirmationAction conf = new FlightConfirmationAction();
				conf.flightConfirmationVisible();
				break;
		}
		
	}

}
