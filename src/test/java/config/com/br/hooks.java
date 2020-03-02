package config.com.br;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import generics.com.br.GenericMethods;

public class hooks {
	
	private static WebDriver driver;
	private static Scenario scenario;
	
	@Before
	public void ConfiguracaoInicial(Scenario scenario) {
		hooks.scenario = scenario;
		
		System.out.println("*** Iniciando Teste ***");
		System.out.println("Executando cenario " + scenario.getName());
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void FecharJanela() {
		//driver.quit();
		GenericMethods generic = new GenericMethods(driver, scenario);
		
		generic.aguardar(2);
		
		driver.navigate().to(System.getProperty("user.dir") + "\\target\\cucumber-html-report\\index.html");
		generic.aguardar(2);
		driver.navigate().refresh();
		System.out.println("*** Fim dos testes ***");	
	}
	
	public static Scenario getScenario() {
		return scenario;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
