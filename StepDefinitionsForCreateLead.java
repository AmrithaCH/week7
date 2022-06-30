package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsForCreateLead extends BaseClass {
	
	
	
	@When("click {string} link")
	public void clickLink(String link) {
		driver.findElement(By.partialLinkText(link)).click();
	}
	
	
	@Then("{string} title to be verified")
	public void verifyTitle(String title)
	{
		
		String titleName = driver.getTitle();
		System.out.println(titleName);
		boolean flag = titleName.contains(title);
		Assert.assertEquals(flag,true);
		
	}
	
	@When("fill CompanyName as {string}")
	public void fillCompanyName(String companyName)
	{
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(companyName);
	}
	
	
	
	@When("fill firstName as {string}")
	public void fillFirstName(String uName)
	{
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName' and @class='inputBox']")).sendKeys(uName);
	}
	
	
	@When("fill lastName as {string}")
	public void fillLastName(String lName)
	{
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName' and @class='inputBox']")).sendKeys(lName);
	}
	
	@When("select {string} from dropdown")
	public void selectDropdown(String selValue)
	{
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dd = new Select(dropdown);
		dd.selectByValue(selValue);
	}
	
	@When("click CreateLead button")
	public void clickButton()
	{
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	}
	
	
	@Then("verify firstname {string}")
	public void verifyFirstName(String firstNameExpected){
		{
			String firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println(firstname);
			boolean flag = firstNameExpected.contains(firstname);
			Assert.assertEquals(flag, true, "firstNameVerifiedinCreateLead");
		}
	}
	
	@Then("verify dropdown selected {string}")
	public void verifyDropDown(String dropDownExpected)
	{
		String sourceDropdownSelected = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(sourceDropdownSelected);
		boolean flag = dropDownExpected.contains(sourceDropdownSelected);
		Assert.assertEquals(flag, true, "dropDownVerifiedinCreateLead");
	}

}
