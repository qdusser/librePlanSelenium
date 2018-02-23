package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateCategoriesPage extends CreateElementPage {

	public CreateCategoriesPage(WebDriver driver) {
		super(driver);
	}
	
	public CategoriesPage SaveCategory(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"x5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CategoriesPage.class);
	}
	
	public CategoriesPage SaveAndContinueCategory(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"y5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CategoriesPage.class);
	}
	
	public CategoriesPage CancelCategory(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"z5-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CategoriesPage.class);
	}

}
