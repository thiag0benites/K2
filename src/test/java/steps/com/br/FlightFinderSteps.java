package steps.com.br;

import java.util.List;

import action.com.br.FlightFinderAction;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Quando;

public class FlightFinderSteps {
	
	FlightFinderAction reserva = new FlightFinderAction();
	
	@Quando("^preencho os dados da reserva \"([^\"]*)\"$")
	public void preencho_os_dados_da_reserva(String arg1, DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		reserva.preencheDadosReserva(list);
	}

}
