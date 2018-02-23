package fr.eql.autom.LibrePlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import junit.framework.ComparisonFailure;

public class CreateCriteriaPage extends ElementPage {

	public CreateCriteriaPage(WebDriver driver) {
		super(driver);
	}
	
	
	// Vérifie présence message d'information
	
	public void verifieCritereEnregistreCriteria(String text){
		driver.findElement(By.xpath("//span[@id='"+prefixe()+"n6']/tbody/tr[2]/td[2]"));
	}
	
	public void verifieInfoBulleCreateCriteria(String text){
		WebElement titre = driver.findElement(By.xpath("//div[@id='"+prefixe()+"m6']/span"));
		text.equals(titre.getText());
	}
	
	public void verifieInfoBulleCreateCriteria2(String text){
		WebElement titre = driver.findElement(By.xpath("//div[@id='"+prefixe()+"t4']/span"));
		text.equals(titre.getText());
	}
	
	public void verifieTitreCreateCriteria(String text){
		WebElement titre = driver.findElement(By.xpath("//table[@id='"+prefixe()+"15']/tbody/tr/td"));
		text.equals(titre.getText());
	}
	
	public String trouverEditCreateCriteria(){
			int i = 0;
			
			try{
				driver.findElement(By.xpath("//div[@id='"+prefixe()+"45-hm']/span"));
			} catch(ComparisonFailure c){
				return reessaiComparaison();
			}
			return null;
		}
	
	public String reessaiComparaison(){
		for (int i=0; i<10; i++){
		
			try{
				driver.findElement(By.xpath("//div[@id='"+prefixe()+"45-hm']/span"));
			} catch(ComparisonFailure c){
				
			}
		}
		driver.findElement(By.xpath("//div[@id='"+prefixe()+"45-hm']/span"));
		return null;
	}
	
	
	// Remplit le champ "Name"
	
	public void remplirChampNameCreateCriteria(String textName){
		WebElement champName = driver.findElement(By.xpath("//input[@id='"+prefixe()+"e5']"));
		champName.clear();
		champName.sendKeys(textName);
	}
	
	// Choisit dans le menu déroulant entre "Worker" ou "Machine"
	
	public void choisirMenuWorkerCreateCriteria(){
		driver.findElement(By.xpath("//tr[@id='"+prefixe()+"l6']/td[2]"));
	}
	
	
	// Coche les cases "Multiple", "Hierarchy", "Enabled"
	
	public void cocherMultipleCriteria(){
		WebElement menuType = driver.findElement(By.xpath("//input[@id='"+prefixe()+"k5-real']"));
		boolean checkbox = menuType.isSelected();
		if (checkbox == false){
			menuType.click();
		}else{
			
		}
	}
	
	public void cocherHierarchyCriteria(){
		WebElement menuType = driver.findElement(By.xpath("//input[@id='"+prefixe()+"n5-real']"));
		boolean checkbox = menuType.isSelected();
		if (checkbox == false){
			menuType.click();
		}else{
			
		}
	}
	
	public void cocherEnabledCriteria(){
		WebElement menuType = driver.findElement(By.xpath("//input[@id='"+prefixe()+"q5-real']"));
		boolean checkbox = menuType.isSelected();
		if (checkbox == false){
			menuType.click();
		}else{
			
		}
	}
	
	
	// Remplit le champ "Description"

	public void remplirChampDescriptionCreateCriteria(String textDescription){
		WebElement champDescription = driver.findElement(By.xpath("//textarea[@id='"+prefixe()+"t5']"));
		champDescription.clear();
		champDescription.sendKeys(textDescription);
	}
	
	
	
	// Clic sur les boutons "Save", "Save and Continue", "Cancel"
	
	public CriteriaPage SaveCriteria(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"h6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CriteriaPage.class);
	}
	
	public CriteriaPage SaveAndContinueCriteria(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"i6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CriteriaPage.class);
	}
	
	public CriteriaPage CancelCriteria(){
		WebElement boutonSave = driver.findElement(By.xpath("//table[@id='"+prefixe()+"j6-box']/tbody/tr[2]/td[2]"));
		boutonSave.click();
		return PageFactory.initElements(driver, CriteriaPage.class);
	}
}
