package pages.com.br;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import config.com.br.hooks;

public class BookFlightPage {
	
	protected WebDriver driver;
	
	public BookFlightPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]")
	public WebElement lblOneWayFlight;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]")
	public WebElement lblReturnFlight;
	
	@FindBy(name="passFirst0")
	public WebElement txtFirstName;
	
	@FindBy(name="passLast0")
	public WebElement txtLastName;
	
	@FindBy(name="creditnumber")
	public WebElement txtNumber;
	
	@FindBy(name="buyFlights")
	public WebElement btnSecure;

}
