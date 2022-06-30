package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsForEditLead extends BaseClass {
	public static String firstOccuringLead;
	public static String firstOccuringName;

	@When("enter {string} in firstname")
	public void fillFirstName(String fName)
	{
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following::label[contains(text(),'First name')]/following-sibling::div/input")).sendKeys(fName);	
	}
	
	
	@When("click {string} button using xpath tag button")
	public void clickFindLeads(String buttonName)
	{
		driver.findElement(By.xpath("//button[text()='"+buttonName+"']")).click();
	}
	
	@When("click first result from Lead List")
	public void clickFirstResult() throws InterruptedException {
		Thread.sleep(2000);
		firstOccuringLead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).getText();
		firstOccuringName = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a")).getText();
		System.out.println("First occuring lead is: "+firstOccuringLead+"and its name is: "+firstOccuringName);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a")).click();
	
	}
	
	@When("update company name {string}")
	public void updateCompanyName(String updateCname)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateCname);
	}
	
	@When("click Update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	
	@Then("verify updated company name {string}")
	public void verifyupdateCompanyName(String updateCname) {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The updated company name is: "+ companyName);
		//Check if updated name is appearing
		
		boolean flag = companyName.contains(updateCname);
		Assert.assertEquals(flag, true);
	}
	
	

}
