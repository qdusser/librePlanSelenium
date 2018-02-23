package fr.eql.autom.LibrePlan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriteriaPage extends ElementPage{

	public CriteriaPage(WebDriver driver) {
		super(driver);
	}
	
	
	// Vérifie message d'informations
	
	public void titreCriteria(String text){
		WebElement info = driver.findElement(By.xpath("//div[@id='"+prefixe()+"j4']/div[2]/div/div/div"));
		text.equals(info.getText());
	}
	
	public void messageInfoCriteria(String text){
		WebElement info = driver.findElement(By.xpath("//div[@id='"+prefixe()+"p6']/span"));
		text.equals(info.getText());
	}
	
	public void messageInfoCriteria2(String text){
		WebElement info = driver.findElement(By.xpath("//div[@id='"+prefixe()+"m6']/span"));
		text.equals(info.getText());
	}
	
	public void messageInfoCriteria3(String text){
		WebElement info = driver.findElement(By.xpath("//div[@id='"+prefixe()+"x7']/span"));
		text.equals(info.getText());
	}
	
	
	// Vérifie présence éléments
	
	public void elementEnregistrerCriteria(String text){
		WebElement element = driver.findElement(By.xpath("//tr[@id='"+prefixe()+"w6']/td/div/span"));
		text.equals(element.getText());
	}
	
	public void elementSauverCriteria(String text){
		WebElement element = driver.findElement(By.xpath("//tr[@id='"+prefixe()+"e7']/td/div/span"));
		text.equals(element.getText());
	}
	
	public void elementSauverCriteria2(String text){
		WebElement element = driver.findElement(By.xpath("//tr[@id='"+prefixe()+"37']/td/div/span"));
		text.equals(element.getText());
	}
	
	public void elementSauverCriteria3(String text){
		WebElement element = driver.findElement(By.xpath("//tr[@id='"+prefixe()+"x4']/td/div/span"));
		text.equals(element.getText());
	}
	
	public int elementNonPresent(String text){
		int ligneTotal = 1;
		List<WebElement> lignes = driver.findElements(By.xpath("//tbody[@id='"+prefixe()+"r4']"));
		
		for (WebElement ligne : lignes){
			List<WebElement> cases = ligne.findElements(By.xpath("./tr/td/div/span"));
			if(text.equals(cases.get(0).getText())){
				return ligneTotal;
			}
			ligneTotal++;
		}
		return -1;
	}
	
	
	// Clic sur les boutons
	
	public void sauverEtContinuerCriteria(){
		driver.findElement(By.xpath("//span[@title='Critère - Test bouton [Sauver et continuer]']")).click();;
	}
	
	public void creerCriteria(){
		driver.findElement(By.xpath("//table[@id='"+prefixe()+"_5-box']/tbody/tr[2]/td[2]")).click();
	}
	
	public void supprimerCriteria(){
		driver.findElement(By.xpath("//span[@id='"+prefixe()+"f8']/table/tbody/tr[2]/td[2]")).click();
	}
	
	public void supprimerOKCriteria(){
		driver.findElement(By.xpath("//span[@id='"+prefixe()+"v7']/table/tbody/tr[2]/td[2]")).click();
	}
	
	public void supprimerAnnulerCriteria(){
		driver.findElement(By.xpath("//span[@id='"+prefixe()+"b7']/table/tbody/tr[2]/td[2]")).click();
	}
	
	public void editCriteria(){
		driver.findElement(By.xpath("//span[@id='"+prefixe()+"88']/table/tbody/tr[2]/td[2]")).click();
	}
	
}