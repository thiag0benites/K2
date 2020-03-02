package action.com.br;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import config.com.br.hooks;
import generics.com.br.GenericMethods;
import pages.com.br.FlightFinderPage;

public class FlightFinderAction extends FlightFinderPage{
	
	GenericMethods generic = new GenericMethods(driver, hooks.getScenario());
	
	public void preencheDadosReserva(List<String> dt) {
		
		generic.selecionaRadioPorName(rdoTypeName, dt.get(0));
		generic.selecionaComboBox(cboPassengers, dt.get(1));
		generic.selecionaComboBox(cboDepartingFrom, dt.get(2));
		
		String monthFromOn = selecionaMesComboBox(dt.get(3));
		generic.selecionaComboBox(cboMonthFromOn, monthFromOn);
		
		generic.selecionaComboBox(cboDayFromOn, dt.get(4));
		generic.selecionaComboBox(cboArrivingIn, dt.get(5));
		
		String monthReturning = selecionaMesComboBox(dt.get(6));
		generic.selecionaComboBox(cboMonthReturning, monthReturning);
		
		generic.selecionaComboBox(cboDayReturning, dt.get(7));
		generic.selecionaRadioPorName2(rdoServiceClass, dt.get(8));
		generic.selecionaComboBox2(cboAirline, dt.get(9));
		
		generic.click(btnContinue);

	}
	
	public String selecionaMesComboBox(String mes) {
		
		Map<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("January", "1");
		dictionary.put("February", "2");
		dictionary.put("March", "3");
		dictionary.put("April", "4");
		dictionary.put("May", "5");
		dictionary.put("June", "6");
		dictionary.put("July", "7");
		dictionary.put("August", "8");
		dictionary.put("September", "9");
		dictionary.put("October", "10");
		dictionary.put("November", "11");
		dictionary.put("December", "12");
		
		return dictionary.get(mes);
		
	}
}
