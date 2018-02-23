package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarExceptionPage extends CreateElementPage {

	public CreateCalendarExceptionPage(WebDriver driver) {
		super(driver);
	}
	
	public CalendarExceptionPage SaveCalendarException(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"x5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarExceptionPage.class);
	}
	
	public CalendarExceptionPage SaveAndContinueCalendarException(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"y5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarExceptionPage.class);
	}
	
	public CalendarExceptionPage CancelCalendarException(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"z5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CalendarExceptionPage.class);
	}

}
