package action.com.br;

import config.com.br.hooks;
import generics.com.br.GenericMethods;
import pages.com.br.ContextoPage;

public class ContextoAction extends ContextoPage{
	
	String url = "http://www.newtours.demoaut.com/";
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());

	public void acessarSistema() {
		driver.navigate().to(url);
	}
	
	public void login() {
		generic.preencheCampo(txtUserName, "mercury");
		generic.preencheCampo(txtPassword, "mercury");
		generic.click(btnlogin);
		
		if(!generic.elementoVisivel(rdoDetails)) {
			generic.escreveRelatorio(false, "Não foi possível realizar o login!", true);
		}
	}
	
}
