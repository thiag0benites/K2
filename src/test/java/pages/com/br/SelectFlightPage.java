package pages.com.br;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.com.br.hooks;
import generics.com.br.GenericMethods;

public class SelectFlightPage {
	
	protected WebDriver driver;
	
	public SelectFlightPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9)")
	public WebElement tblDepart;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10)")
	public WebElement tblReturn;
	
	@FindBy(name="reserveFlights")
	public WebElement btnContinue;
	
	public void clickRadioTabela(String voo, int numLinha) {
		
		GenericMethods generic = new GenericMethods(driver, hooks.getScenario());
		
		try {
			numLinha = numLinha - 1;
			
			switch (voo) {
				case "Ida":
					driver.findElement(By.cssSelector("table:nth-child(9) tr:nth-child(" + numLinha + ") input")).click();
					break;
				
				case "Volta":
					driver.findElement(By.cssSelector("table:nth-child(10) tr:nth-child(" + numLinha + ") input")).click();
					break;
			}
			
		} catch (Exception e) {
			generic.escreveRelatorio(false, "Não foi possível selecionar o radiobutton na linha " + numLinha, true);
		}	
		
	}

}
