package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilesPage extends ElementPage{

	public ProfilesPage(WebDriver driver) {
		super(driver);
	}
	
	public void creerProfiles(){
		WebElement btnCreateProfiles = driver.findElement(By.xpath("//table[@id='"+prefixe()+"v4-box']/tbody/tr[2]/td[2]"));
		btnCreateProfiles.click();
		}
}