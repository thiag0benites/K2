package steps.com.br;

import action.com.br.BookFlightAction;
import cucumber.api.java.pt.Quando;

public class BookFlightSteps {

	BookFlightAction book = new BookFlightAction();

	@Quando("^valido os dados de voo \"([^\"]*)\" e \"([^\"]*)\"$")
	public void valido_os_dados_de_voo_e(String ida, String volta) throws Throwable {
		book.validaVoos(ida, volta);
	}

	@Quando("^preencho os campos obrigatorios \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencho_os_campos_obrigatorios_e(String nome, String sobreNome, String cartao) throws Throwable {
		book.preencheCamposObrigatorios(nome, sobreNome, cartao);
	}

}
