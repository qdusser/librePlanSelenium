package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QualityPage extends ElementPage{

	public QualityPage(WebDriver driver) {
		super(driver);
	}
	public void creerQuality(){
		WebElement btnCreateQuality = driver.findElement(By.xpath("//table[@id='"+prefixe()+"35-box']/tbody/tr[2]/td[2]"));
		btnCreateQuality.click();
		}
}