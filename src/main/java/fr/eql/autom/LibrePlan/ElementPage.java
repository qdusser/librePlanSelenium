package fr.eql.autom.LibrePlan;

import org.junit.ComparisonFailure;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPage extends HeaderPage {

	public ElementPage(WebDriver driver) {
		super(driver);
		
	}
	
	//avec boucle
	public String reessaiPrefixeBoucle(){
		
		for(int i=0; i<10; i++){
			try{
				
				WebElement bouton = driver.findElement(By.xpath("//body/div"));
				String idBouton = bouton.getAttribute("id");
				String prefix = idBouton.substring(0, 4);
				return prefix;
				
			} catch(StaleElementReferenceException ex){
				
				//on ignore l'exception
			}
		}
		
		WebElement bouton = driver.findElement(By.xpath("//body/div"));
		String idBouton = bouton.getAttribute("id");
		String prefix = idBouton.substring(0, 4);
		return prefix;
	}
	
	//avec recursion
	public String reessaiPrefixeRecursion(int i){
		
		if(i < 10){	
		
			try{
				
				WebElement bouton = driver.findElement(By.xpath("//body/div"));
				String idBouton = bouton.getAttribute("id");
				String prefix = idBouton.substring(0, 4);
				return prefix;
				
			} catch(StaleElementReferenceException ex){
				
				return reessaiPrefixeRecursion(i++);
			}
		} else {
			WebElement bouton = driver.findElement(By.xpath("//body/div"));
			String idBouton = bouton.getAttribute("id");
			String prefix = idBouton.substring(0, 4);
			return prefix;
		}
	}

	
	public String prefixe(){
		
		try{
		
			WebElement bouton = driver.findElement(By.xpath("//body/div"));
			String idBouton = bouton.getAttribute("id");
			String prefix = idBouton.substring(0, 4);
			return prefix;
			
		} catch(StaleElementReferenceException ex){
			
			return reessaiPrefixeBoucle();
		}
	}
	
	
	
	
	public String reessaiPrefixeBoucle2(){
		
		for(int i=0; i<10; i++){
			try{
				
				WebElement bouton = driver.findElement(By.xpath("//body/div"));
				String idBouton = bouton.getAttribute("id");
				String prefix = idBouton.substring(0, 4);
				return prefix;
				
			} catch(ComparisonFailure com){
				
				//on ignore l'exception
			}
		}
		
		WebElement bouton = driver.findElement(By.xpath("//body/div"));
		String idBouton = bouton.getAttribute("id");
		String prefix = idBouton.substring(0, 4);
		return prefix;
	}

	
	public String prefixe2(){
		
		try{
		
			WebElement bouton = driver.findElement(By.xpath("//body/div"));
			String idBouton = bouton.getAttribute("id");
			String prefix = idBouton.substring(0, 4);
			return prefix;
			
		} catch(ComparisonFailure com){
			
			return reessaiPrefixeBoucle2();
		}
	}
}
