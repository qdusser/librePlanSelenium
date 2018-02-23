package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateTimesheetsPage extends CreateElementPage {

	public CreateTimesheetsPage(WebDriver driver) {
		super(driver);
	}
	
	public TimesheetsPage SaveTimesheets(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"t7-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, TimesheetsPage.class);
	}
	
	public TimesheetsPage SaveAndContinueTimesheets(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"u7-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, TimesheetsPage.class);
	}
	
	public TimesheetsPage SaveAndNewTimesheetTimesheets(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"v7-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, TimesheetsPage.class);
	}
	
	public TimesheetsPage CancelTimesheets(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"w7-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, TimesheetsPage.class);
	}

}
