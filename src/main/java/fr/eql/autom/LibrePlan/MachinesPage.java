package fr.eql.autom.LibrePlan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MachinesPage extends ElementPage{

	public MachinesPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void creerMachines(){
		WebElement btnCreateMachines = driver.findElement(By.xpath("//table[@id='"+prefixe()+"x5-box']/tbody/tr[2]/td[2]"));
		btnCreateMachines.click();
	}
	
	public int presenceMachine(String codeMachine,String nomMachine, String description){
		int compteurDeLigne = 1;
		List<WebElement> lignes = driver.findElements(By.xpath("//div[@id='"+prefixe()+"p5']/div[3]/table/tbody[2]/tr"));
		
		for(WebElement ligne : lignes){
			List<WebElement> cases = ligne.findElements(By.xpath("./td/div"));
			
			if(cases.get(0).getText().equals(nomMachine) && cases.get(1).getText().equals(description) && cases.get(2).getText().equals(codeMachine)){
				return compteurDeLigne;
			}
			
			compteurDeLigne = compteurDeLigne+1;
		}
		return -1;
	}
}