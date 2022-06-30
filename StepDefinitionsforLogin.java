package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionsforLogin extends BaseClass {
	
	SoftAssert soft = new SoftAssert();
	
	@Given("Open Chrome browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@Given("Load the application url {string}")
	public void loginUrl(String url)
	{
		driver.get(url);
	}
	
	
	
	@Given("enter username as {string}")
	public void enterUN(String uname)
	{
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys(uname);	
	}
	
	
	
	@Given("enter pwd as {string}")
	public void enterPwd(String pwd)
	{
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(pwd);
	}
	
	
	@When("click {string} button")
	public void clickLogin(String button)
	{
		driver.findElement(By.xpath("//input[contains(@class,'"+button+"')]")).click();	
	}
	
	@Then("Homepage should be displayed")
	public void checkHomepageDisplayed()
	{
		boolean isDisplayed = driver.findElement(By.partialLinkText("CRM/SFA")).isDisplayed();
		soft.assertEquals(isDisplayed, true);
		soft.assertAll();
	}

}
