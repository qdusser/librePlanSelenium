package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CalendarExceptionPage extends ElementPage{

	public CalendarExceptionPage(WebDriver driver) {
		super(driver);
	}
	
	public void creerCalendarException(){
		WebElement btnCreateCalendarException = driver.findElement(By.xpath("//table[@id='"+prefixe()+"t4-box']/tbody/tr[2]/td[2]"));
		btnCreateCalendarException.click();
		}
}