package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateQualityPage extends CreateElementPage {

	public CreateQualityPage(WebDriver driver) {
		super(driver);
	}
	
	public QualityPage SaveQuality(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"f6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, QualityPage.class);
	}
	
	public QualityPage SaveAndContinueQuality(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"g6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, QualityPage.class);
	}
	
	public QualityPage CancelQuality(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixeBoutonCreateElementPage()+"h6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, QualityPage.class);
	}

}
