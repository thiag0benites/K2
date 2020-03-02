package steps.com.br;

import action.com.br.FlightConfirmationAction;
import cucumber.api.java.pt.Entao;

public class FlightConfirmationSteps {
	
	FlightConfirmationAction conf = new FlightConfirmationAction();
	
	@Entao("^valido o numero de reserva$")
	public void valido_o_numero_de_reserva() throws Throwable {
		conf.validaNumeroConfirmacao();
	}

}
