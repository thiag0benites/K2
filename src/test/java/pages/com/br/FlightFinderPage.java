package pages.com.br;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.com.br.hooks;

public class FlightFinderPage {
	
	protected WebDriver driver;
	
	public FlightFinderPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}
			
	@FindBy(name="passCount")
	public WebElement cboPassengers;
	
	@FindBy(name="fromPort")
	public WebElement cboDepartingFrom;
	
	@FindBy(name="fromMonth")
	public WebElement cboMonthFromOn;
	
	@FindBy(name="fromDay")
	public WebElement cboDayFromOn;
	
	@FindBy(name="toPort")
	public WebElement cboArrivingIn;
	
	@FindBy(name="toMonth")
	public WebElement cboMonthReturning;
	
	@FindBy(name="toDay")
	public WebElement cboDayReturning;
	
	@FindBy(name="airline")
	public WebElement cboAirline;
	
	@FindBy(name="findFlights")
	public WebElement btnContinue;
	
	// Radio Buttom
	public String rdoTypeName = "tripType";
	public String rdoServiceClass = "servClass";

}
