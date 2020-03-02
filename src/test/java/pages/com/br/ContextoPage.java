package pages.com.br;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import config.com.br.hooks;

public class ContextoPage {
	
	protected WebDriver driver;
	
	public ContextoPage() {
		driver = hooks.getDriver();
		PageFactory.initElements(driver, this);
	}

	//Tela de login
	@FindBy(name="userName")
	public WebElement txtUserName;
	
	@FindBy(name="password")
	public WebElement txtPassword;
	
	@FindBy(name="login")
	public WebElement btnlogin;
	
	//Tela FLIGHT FINDER
	@FindBy(name="tripType")
	public WebElement rdoDetails;

}
