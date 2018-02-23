package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalendarsPage extends ElementPage{

	public CalendarsPage(WebDriver driver) {
		super(driver);
	}
	
	public void creerCalendars(){
		WebElement btnCreateCalendars = driver.findElement(By.xpath("//table[@id='"+prefixe()+"q4-box']/tbody/tr[2]/td[2]"));
		btnCreateCalendars.click();
		}
	
}