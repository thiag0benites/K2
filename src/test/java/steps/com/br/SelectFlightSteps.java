package steps.com.br;

import action.com.br.SelectFlightAction;
import cucumber.api.java.pt.Quando;

public class SelectFlightSteps {
	
	SelectFlightAction voo = new SelectFlightAction();
	
	@Quando("^seleciono o voo de ida \"([^\"]*)\"$")
	public void seleciono_o_voo_de_ida(String dados) throws Throwable {
		voo.preencheDadosVoo("Ida", dados);
	}

	@Quando("^seleciono o voo de volta \"([^\"]*)\"$")
	public void seleciono_o_voo_de_volta(String dados) throws Throwable {
		voo.preencheDadosVoo("Volta", dados);
	}

}
