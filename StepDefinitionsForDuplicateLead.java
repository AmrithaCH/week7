package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsForDuplicateLead extends BaseClass{
	
	@When("enter {string} in email")
	public void filleMail(String eMail)
	{
		//Click on email tab
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter email and click find
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(eMail);
	}
	
	@When("click Create Lead under duplicate")
	public void clickCreateUnderDuplicate()
	{
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}
	
	
	@Then("check the lead is duplicated")
	public void checkDuplicated()
	{
		String duplicatedLead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		boolean flag = duplicatedLead.equals(StepDefinitionsForEditLead.firstOccuringName);
		Assert.assertEquals(flag, true);
	}
	

}
