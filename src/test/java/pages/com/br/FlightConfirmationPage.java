package pages.com.br;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.com.br.hooks;

public class FlightConfirmationPage {
	
	protected WebDriver driver;
	
	public FlightConfirmationPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > table > tbody > tr:nth-child(1) > td > table > tbody > tr > td:nth-child(1) > b > font > font > b > font:nth-child(1)")
	public WebElement lblConfirmationNumber;
	
}
