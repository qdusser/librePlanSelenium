package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarsPage extends CreateElementPage {

	public CreateCalendarsPage(WebDriver driver) {
		super(driver);
	}
	
	public CalendarsPage SaveCalendars(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"z7-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarsPage.class);
	}
	
	public CalendarsPage SaveAndContinueCalendars(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"_8-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarsPage.class);
	}
	
	public CalendarsPage CancelCalendars(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"08-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarsPage.class);
	}

}
