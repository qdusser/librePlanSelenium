package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoriesPage extends ElementPage{

	public CategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	public void creerCategories(){
		WebElement btnCreateCategories = driver.findElement(By.xpath("//table[@id='"+prefixe()+"x4-box']/tbody/tr[2]/td[2]"));
		btnCreateCategories.click();
		}
}