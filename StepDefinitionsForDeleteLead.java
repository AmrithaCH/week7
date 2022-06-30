package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsForDeleteLead extends BaseClass {

  
	
	
	@When("enter {string} in phone number")
	public void fillPhoneNumber(String pNumber) 
	{
		// CLick on phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter any phone number for search
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1");
	}

	
	
	@When("click {string} button using xpath tag a")
	public void clickDelete(String bName)
	{
		driver.findElement(By.xpath("//a[text()='"+bName+"']")).click();
	}
	
	
	@When("click {string} button from shortcuts")
	public void clickFindLeadsFromShortcut(String bName)
	{
		driver.findElement(By.xpath("//a[text()='"+bName+"']")).click();
	}
	
	
	@Then("check the lead is deleted successfully")
	public void checkDeleted()
	{
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following-sibling::div/input")).sendKeys(StepDefinitionsForEditLead.firstOccuringLead);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String deleted = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		Assert.assertEquals(deleted, "No records to display");
		System.out.println("When entered "+StepDefinitionsForEditLead.firstOccuringLead+" shows "+deleted+". Hence success");
	}
}
