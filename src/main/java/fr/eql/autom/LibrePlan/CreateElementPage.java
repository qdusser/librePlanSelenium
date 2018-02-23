package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateElementPage extends HeaderPage {
	
	public CreateElementPage(WebDriver driver) {
		super(driver);
	}
	
	public String prefixeBoutonCreateElementPage(){
		WebElement bouton = driver.findElement(By.xpath("//body/div"));
		String idPrefixe = bouton.getAttribute("id");
		String prefixe = idPrefixe.substring(0, 4);
		return prefixe;
	}

}
